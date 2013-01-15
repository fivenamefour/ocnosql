
var rootUrl = {
        ajax: function(opt) {

            var id = opt.data.split("=")[1];
            var clusterId = id || -1;
            var url = "${restPath}/cluster/{clusterId}.json";
            $.rest("GET", url, {clusterId : clusterId}, function(data) {
                console.log(data);
            });
        }
};

var setting = {
    view : {
        showLine : false
    },
    async: {
        enable: true,
        url: rootUrl,
        autoParam: ["id"]
    }
};


$(function() {
    $.fn.zTree.init($("#clusterTree"), setting);
});