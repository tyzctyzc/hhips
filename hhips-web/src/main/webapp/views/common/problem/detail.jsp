<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/include_common.jsp"%>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>资源添加修改页</title>
<style>
    .preview_box img {
        width: 400px;
    }
    .active {
        box-shadow: 0px 0px 10px 10px rgba(0,0,255,.4);
    }
</style>
</head>
<body>
    <div class="page-header">
        <h1 style="margin-left: 10px;">${chaptername}</h1>
    </div>
    <div class="row" style="margin-top: 10px; margin-bottom: 10px;">
        <img src="${pageContext.request.contextPath}/resources/images/${problem.problemdetail}"
            class="img-responsive" alt="Cinque Terre" width="800" height="140" />
    </div>
    <div id="main">
        <table id="table"></table>
    </div>
</body>
<script type="text/javascript">
var $table = $('#table');
$(function() {

	$table.bsTable({
		url: '${pageContext.request.contextPath}/common/problem/worklist',
		idField: 'idwork',// 指定主键列
		singleSelect: true,
		search: true,
		columns: [
			{field: 'state', checkbox: true},
			{field: 'idwork', title: '工作序号', align: 'center'},
			{field: 'workdate', title: '工作时间', align: 'center', formatter: function (value, row, index) {
			    return changeDateFormat(value);
			}},
			{field: 'idproblem', title: '问题序号', align: 'center'},
			{field: 'usedtime', title: '工作用时', align: 'center'},
			{field: 'workdetail', title: '工作详情', align: 'center', formatter: function(value, row, index){
			    return '<img src="${pageContext.request.contextPath}/resources/images/' + value + '" width="500" height="160" />';
			}},
			{field: 'workmark', title: '工作标记', align: 'center'},
			{field: 'reason', title: '工作原因', align: 'center'}
		]
	});

});

function changeDateFormat(cellval) {
    if (cellval != null) {
        var date = new Date(cellval);
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var hour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var minute = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        var second = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hour + ":" + minute + ":" + second;
    }
}
</script>
</html>