<!DOCTYPE html>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
  <meta charset="UTF-8">
  <title>OcNoSql管理</title>
  <link rel="stylesheet" href="${frontendPath}/lib/bootstrap/bootstrap/css/bootstrap.min.css" type="text/css"/>
  <link rel="stylesheet" href="${frontendPath}/extend/bootstrap/bootstrap/css/bootstrap.css" type="text/css"/>
  <link rel="stylesheet" href="${frontendPath}/lib/ztree/JQuery zTree v3.4/css/zTreeStyle/zTreeStyle.css" type="text/css"/>
  <link rel="stylesheet" href="${frontendPath}/extend/ztree/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css"/>

</head>

<body>
<ul id="clusterTree" class="ztree"></ul>

<!-- 下拉操作模板：新建表 -->
<div id="tplCreateTable" style="display:none;">
  <div class="dropdown" id="menuCreateTable_{tId}">
    <a class="dropdown-toggle icon icon-dropdown" data-toggle="dropdown"></a>
    <ul class="dropdown-menu">
      <li><a href="#" op="create">新建表</a></li>
    </ul>
  </div>
</div>

<!-- 下拉操作模板：表操作 -->
<div id="tplOperateTable" style="display:none;">
  <div class="dropdown" id="menuOperateTable_{tId}">
    <a class="dropdown-toggle icon icon-dropdown" data-toggle="dropdown"></a>
    <ul class="dropdown-menu">
      <li><a href="#" op="disable">预删除</a></li>
      <li><a href="#" op="delete">删除</a></li>
      <li><a href="#" op="rename">重命名</a></li>
      <li><a href="#" op="copy">复制</a></li>
      <li><a href="#" op="query">查询</a></li>
    </ul>
  </div>
</div>





<script type="text/javascript" src="${frontendPath}/lib/jquery/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${frontendPath}/lib/bootstrap/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${frontendPath}/extend/bootstrap/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${frontendPath}/lib/ztree/JQuery zTree v3.4/js/jquery.ztree.all-3.4.min.js"></script>
<script type="text/javascript" src="${frontendPath}/core/osfc.js"></script>
<script type="text/javascript" src="${frontendPath}/lib/json/json/json2.js"></script>
<script type="text/javascript" src="js/main.js"></script>
</body>
</html>