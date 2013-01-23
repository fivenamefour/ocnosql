<%@page pageEncoding="UTF-8"%>
$(function() {
    var treeData = {}, tableList = viewList = [];

    var setting = {
        view : {
            showLine : false,
            addHoverDom: addHoverDom,
            removeHoverDom: removeHoverDom
        },
        edit: {
            enable: true,
            showRemoveBtn : false,
            showRenameBtn : false
        }
    };

    function addHoverDom(treeId, treeNode) {
        var node = $("#" + treeNode.tId + "_a");
        var dropdown;

        if (treeNode.level === 0) return;  // If it is the root node, there is no drop-down menu
        if ($("div[id$=_" + treeNode.tId + "]").length > 0)  return; // If there is a drop-down menu, return

        if (treeNode.type === "tableRoot") {
            dropdown = $.template($('#tplCreateTable').html(), {tId : treeNode.tId});
        } else if (treeNode.type === "table") {
            dropdown = $.template($('#tplOperateTable').html(), {tId : treeNode.tId});
        } else if (treeNode.type === "viewRoot") {
           // todo
        } else if (treeNode.type === "view") {
           // todo
        }

        dropdown && node.append(dropdown);

        $("a[op]").click(function() {
            alert($(this).attr("op"));
        });
    }

    function removeHoverDom(treeId, treeNode) {
        $("div[id$=_" + treeNode.tId + "]").remove();
        return false;
    }

    // $.when($.ajax1, $.ajax2, ...).then(doneCallbacks, failCallbacks)
    $.when($.rest("GET", "${restPath}/table/list.json", function(data) {
        for (var i = 0, l = data.length; i < l; i++) {
            tableList.push({"id": data[i].tableId, "name": data[i].tableName, "type": "table"});
        }
    }), $.rest("GET", "${restPath}/view/list.json", function(data) {
        for (var i = 0, l = data.length; i < l; i++) {
            viewList.push({"id": data[i].viewId, "name": data[i].viewName, "type": "view"});
        }
    })).then(function() {
        treeData = {name: "OcNoSql集群一", children: [{name: "OcNoSql表", type: "tableRoot", children: tableList}, {name: "视图", type: "viewRoot", children: viewList}]};
        $.fn.zTree.init($("#clusterTree"), setting, treeData);
    })
});