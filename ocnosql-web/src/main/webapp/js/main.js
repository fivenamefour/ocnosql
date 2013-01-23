<%@page pageEncoding="UTF-8"%>
$(function() {
    var treeData = {}, tableList = viewList = [];

    var setting = {
        view : { showLine : false },
        data: {
            simpleData: { enable: true }
        }
    };
    // $.when($.ajax1, $.ajax2, ...).then(doneCallbacks, failCallbacks)
    $.when($.rest("GET", "${restPath}/table/list.json", function(data) {
        for (var i = 0, l = data.length; i < l; i++) {
            tableList.push({"id": data[i].tableId, "name": data[i].tableName});
        }
    }), $.rest("GET", "${restPath}/view/list.json", function(data) {
        for (var i = 0, l = data.length; i < l; i++) {
            viewList.push({"id": data[i].viewId, "name": data[i].viewName});
        }
    })).then(function() {
        treeData = {name: "OcNoSql集群一", children: [{name: "OcNoSql表", children: tableList}, {name: "视图", children: viewList}]};
        $.fn.zTree.init($("#clusterTree"), setting, treeData);
    })
});