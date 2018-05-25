<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp" %>
<%@ include file="/common/include_common.jsp" %>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>问题管理</title>
</head>
<body>
<div id="main">
	<div id="toolbar">
		<a class="waves-effect btn btn-info btn-sm" href="javascript:addProblem();" ><i class="zmdi zmdi-plus"></i> 新增问题</a>
		<a class="waves-effect btn btn-warning btn-sm" href="javascript:editProblem();" ><i class="zmdi zmdi-edit"></i> 编辑问题</a>
		<a class="waves-effect btn btn-danger btn-sm" href="javascript:deleteProblem();" ><i class="zmdi zmdi-delete"></i> 删除问题</a>
		<a class="waves-effect btn btn-success btn-sm" href="javascript:activeProblem();" ><i class="zmdi zmdi-calendar-check"></i> 激活问题</a>
		<a class="waves-effect btn btn-default btn-sm" href="javascript:deactiveProblem();" ><i class="zmdi zmdi-calendar-remove"></i> 不激活问题</a>
		<a class="waves-effect btn btn-primary btn-sm" href="javascript:detailProblem();" ><i class="zmdi zmdi-triangle-down"></i> 问题详细</a>
		<a class="waves-effect btn btn-warning btn-sm" href="javascript:makeProblem();" ><i class="zmdi zmdi-edit"></i> 做题</a>
	</div>
	<table id="table"></table>
</div>

</body>

<script type="text/javascript">

var $table = $('#table');
$(function() {
	
	$table.bsTable({
		url: '${pageContext.request.contextPath}/common/problem/problemlist',
		idField: 'idproblem',// 指定主键列
		singleSelect: true,
		search: true,
		columns: [
			{field: 'state', checkbox: true},
			{field: 'idproblem', title: '问题序号', align: 'center'},
			{field: 'problemcisactive', title: '问题是否激活', align: 'center', formatter: function(value, row, index){
				if(value){
					return '<span class="label label-info">激活</span>';
				}else {
					return '<span class="label label-danger">没激活</span>';
				}
			}},
			{field: 'problemdetail', title: '问题内容', align: 'center', formatter: function(value, row, index){
			    return '<img src="${pageContext.request.contextPath}/resources/images/' + value + '" width="500" height="160" />';
			}},
			{field: 'problemlevel', title: '问题难度', align: 'center'},
			{field: 'problemchapterid', title: '问题章节ID', align: 'center'},
			{field: 'problemindex', title: '问题索引', align: 'center'},
			{field: 'problemmodule', title: '问题模块', align: 'center'},
			{field: 'problemanswerstring', title: '问题答案', align: 'center'},
			{field: 'problemanswerdetail', title: '问题答案详情', align: 'center', formatter: function(value, row, index){
			    return '<img src="${pageContext.request.contextPath}/resources/images/' + value + '" width="500" height="160" />';
			}}
		]
	});
	
});

// 添加
function addProblem() {
    parent.clearLastSelected();
    var list = $("#table").bootstrapTable('getData')[0];
    if(list==null){
        parent.document.getElementById('problem_iframe').src = "${pageContext.request.contextPath}/common/problem/0/add";
    }else{
        parent.document.getElementById('problem_iframe').src = "${pageContext.request.contextPath}/common/problem/" + list.idproblem + "/add";
    }
}

// 删除
function deleteProblem() {
	var rows = $table.bootstrapTable('getSelections');
	if (rows.length == 0) {
		$.confirm({
			title: false,
			content: '请至少选择一条记录！',
			autoClose: 'cancel|3000',
			backgroundDismiss: true,
			buttons: {
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	} else {
        var ids = new Array();
        for (var i in rows) {
            ids.push(rows[i].idproblem);
        }
	    message = '确认删除id等于' + ids.join("-") + '的问题吗？';
		$.confirm({
			type: 'red',
			animationSpeed: 300,
			title: false,
			content: message,
			buttons: {
				confirm: {
					text: '确认',
					btnClass: 'waves-effect waves-button',
					action: function () {
                        var problem = {};
                        problem.idproblem = rows[0].idproblem;
                        problem.problemlevel = rows[0].problemlevel;
                        problem.problemdetail = rows[0].problemdetail;
                        problem.problemchapterid = rows[0].problemchapterid;
                        problem.problemindex = rows[0].problemindex;
                        problem.problemmodule = rows[0].problemmodule;
                        problem.problemcisactive = rows[0].problemcisactive;
                        problem.problemanswerstring = rows[0].problemanswerstring;
                        problem.problemanswerdetail = rows[0].problemanswerdetail;
                        console.log("url", '${pageContext.request.contextPath}/common/problem/save');
                        console.log("problem", problem);
                        $.post('${pageContext.request.contextPath}/common/problem/delete', problem, function(data) {
                            parent.clearLastSelected();
                            $.alert(data.msg);
                        });
					}
				},
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	}
}

// 激活
function activeProblem() {
	var rows = $table.bootstrapTable('getSelections');
	if (rows.length == 0) {
		$.confirm({
			title: false,
			content: '请至少选择一条记录！',
			autoClose: 'cancel|3000',
			backgroundDismiss: true,
			buttons: {
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	} else {
        var ids = new Array();
        for (var i in rows) {
            ids.push(rows[i].idproblem);
        }
	    message = '确认激活id等于' + ids.join("-") + '的问题吗？';
		$.confirm({
			type: 'red',
			animationSpeed: 300,
			title: false,
			content: message,
			buttons: {
				confirm: {
					text: '确认',
					btnClass: 'waves-effect waves-button',
					action: function () {
                        var problem = {};
                        problem.idproblem = rows[0].idproblem;
                        problem.problemcisactive = 1;
                        $.post('${pageContext.request.contextPath}/common/problem/active', problem, function(data) {
                            parent.clearLastSelected();
                            $.alert(data.msg);
                        });
					}
				},
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	}
}

// 不激活
function deactiveProblem() {
	var rows = $table.bootstrapTable('getSelections');
	if (rows.length == 0) {
		$.confirm({
			title: false,
			content: '请至少选择一条记录！',
			autoClose: 'cancel|3000',
			backgroundDismiss: true,
			buttons: {
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	} else {
        var ids = new Array();
        for (var i in rows) {
            ids.push(rows[i].idproblem);
        }
	    message = '确认不激活id等于' + ids.join("-") + '的问题吗？';
		$.confirm({
			type: 'red',
			animationSpeed: 300,
			title: false,
			content: message,
			buttons: {
				confirm: {
					text: '确认',
					btnClass: 'waves-effect waves-button',
					action: function () {
                        var problem = {};
                        problem.idproblem = rows[0].idproblem;
                        problem.problemcisactive = 0;
                        $.post('${pageContext.request.contextPath}/common/problem/deactive', problem, function(data) {
                            parent.clearLastSelected();
                            $.alert(data.msg);
                        });
					}
				},
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	}
}

// 问题详细
function detailProblem() {
	var rows = $table.bootstrapTable('getSelections');
	if (rows.length == 0) {
		$.confirm({
			title: false,
			content: '请至少选择一条记录！',
			autoClose: 'cancel|3000',
			backgroundDismiss: true,
			buttons: {
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	} else {
        parent.clearLastSelected();
        parent.document.getElementById('problem_iframe').src = "${pageContext.request.contextPath}/common/problem/" + rows[0].idproblem + "/detail";
	}
}
</script>

</html>