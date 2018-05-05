<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/include_common.jsp"%>
<style>
<!-- /* 左右布局 */
.layout-left {
	position: fixed;
	width: 240px;
	background: #fff;
	height: 100%;
	transition: all;
	-webkit-transition-duration: .3s;
	transition-duration: .3s;
	z-index: 10;
	overflow-y: auto;
	box-shadow: 1px 0 4px rgba(0, 0, 0, .3);
}

.layout-right {
	position: fixed;
	width: calc(100% -240px);
	background: #fff;
	left: 240px;
	height: 100%;
}
</style>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>菜单管理</title>
</head>
<body>

	<div class="layout-left">
		<div id="toolbar" align="right" style="background: #F5F5F5;">
			<a id="add-btn" class="waves-effect btn btn-info btn-sm"
				style="margin-right: 5px;" href="javascript:chapterAdd();"><i
				class="zmdi zmdi-plus"></i> 添加</a> <a id="delete-btn"
				class="waves-effect btn btn-danger btn-sm"
				style="margin-right: 5px;" href="javascript:chapterDelete();"><i
				class="zmdi zmdi-delete"></i> 删除</a> <a id="refresh-btn"
				class="waves-effect btn btn-warning btn-sm"
				style="margin-right: 5px;" href="javascript:chapterAllRefresh();"><i
				class="zmdi zmdi-refresh"></i> 刷新</a>
		</div>
		<div id="ztree" class="ztree"></div>
	</div>
	<div class="layout-right">
		<iframe id="content_iframe" class="tab_iframe" frameborder="0"
		    width="940" height="650" scrolling="yes"></iframe>
	</div>
</body>

<script type="text/javascript">
	var treeObj;
	var setting = {
		async : {
			enable : true,
			url : "${pageContext.request.contextPath}/common/chapter/chapterTree",
			autoParam : [ "id", "pid", "name", "level" ]
		},
		view: {
			fontCss: setFontCss
		},
		callback : {
			//beforeClick: zTreeBeforeClick,
			onClick : zTreeOnClick,
			onDblClick: zTreeOnDblClick
		}
	};
	// 初始化 tree 数据
	treeObj = $.fn.zTree.init($('#ztree'), setting);
	// 设置样式
	function setFontCss(treeId, treeNode) {
		return treeNode.valid == false ? {color:"red"} : {};
	};
	// 禁止第一节点被选中
	/*
	function zTreeBeforeClick(treeId, treeNode, clickFlag) {
		return (treeNode.level != '0');
	}
	 */
	 var lastSelected;
	 var lastChecked;
	// tree 双击事件
	function zTreeOnDblClick(event, treeId, treeNode) {
		//$("#content").load('${pageContext.request.contextPath}/common/chapter/addOrEdit');
		if(0 == treeNode.level){
			$('#delete-btn').hide();
		}else{
			$('#delete-btn').show();
		}
		if(lastSelected != treeNode.id || lastChecked != 'click'){
			$("#content_iframe").attr("src", "${pageContext.request.contextPath}/common/chapter/" + treeNode.id + "/edit");
		}
		lastSelected = treeNode.id;
		lastChecked = 'click';
	}
	// tree 点击事件
	function zTreeOnClick(event, treeId, treeNode) {
		//$("#content").load('${pageContext.request.contextPath}/common/chapter/addOrEdit');
		if(0 == treeNode.level){
			$('#delete-btn').hide();
		}else{
			$('#delete-btn').show();
		}
		if(lastSelected != treeNode.id || lastChecked != 'click'){
			$("#content_iframe").attr("src", "${pageContext.request.contextPath}/common/problem/" + treeNode.id + "/showproblem");
		}
		lastSelected = treeNode.id;
		lastChecked = 'click';
	}
	// 添加 tree 节点
	function chapterAdd() {
		var nodes = treeObj.getSelectedNodes();
		if ("" == nodes) {
			$.alert("请选择父节点");
		} else {
			if(lastSelected != nodes[0].id || lastChecked != 'add'){
				$("#content_iframe").attr("src", "${pageContext.request.contextPath}/common/chapter/" + nodes[0].id + "/add");
			}
			lastSelected = nodes[0].id;
			lastChecked = 'add';
		}
	}
	// 删除 tree 节点
	function chapterDelete() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes != '') {
			$.confirm({
				type : 'red',
				animationSpeed : 300,
				title : false,
				content : '确认删除[' + nodes[0].name + ']菜单吗？',
				buttons : {
					confirm : {
						text : '确认',
						btnClass : 'waves-effect waves-button',
						action : function() {
							$.post('${pageContext.request.contextPath}/common/chapter/delete', {chapterId:nodes[0].id, chapterPid:nodes[0].pid}, function(data){
								if('1' == data.status){
									chapterParentsNodeRefresh();
								}else{
									chapterParentNodeRefresh();
								}
								$.alert(data.msg);
							});
						}
					},
					cancel : {
						text : '取消',
						btnClass : 'waves-effect waves-button'
					}
				}
			});
		} else {
			$.confirm({
				title : false,
				content : '请选择需要删除的菜单！',
				autoClose : 'cancel|3000',
				backgroundDismiss : true,
				buttons : {
					cancel : {
						text : '取消',
						btnClass : 'waves-effect waves-button'
					}
				}
			});
		}
	}
	// 全部 tree 刷新 
	function chapterAllRefresh() {
		treeObj.reAsyncChildNodes(null, "refresh");
		lastSelected='';
		lastChecked='';
	}
	// 选中 tree 节点父节点的父节点刷新 
	function chapterParentsNodeRefresh() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes.length > 0) {
			treeObj.reAsyncChildNodes(nodes[0].getParentNode().getParentNode(), "refresh");
		}
		lastSelected='';
		lastChecked='';
	}
	// 选中 tree 节点的父节点刷新 
	function chapterParentNodeRefresh() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes.length > 0) {
			treeObj.reAsyncChildNodes(nodes[0].getParentNode(), "refresh");
		}
		lastSelected='';
		lastChecked='';
	}
	// 选中 tree 节点刷新 
	function chapterNodeRefresh() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes.length > 0) {
			treeObj.reAsyncChildNodes(nodes[0], "refresh");
		}
		lastSelected='';
		lastChecked='';
	}
</script>
</html>