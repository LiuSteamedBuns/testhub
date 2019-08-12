<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Wechat</title>
<script type="text/javascript"
	src="${pageContext.request.getContextPath()}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<style type="text/css">
.s_color {
	color: #FFFFFF;
}

#upload {
	margin-top: 8px;
}
.ddgg {	margin: 3%;}
	.bgcent {margin: 0px 200px;}
	.ddgg1 {margin: 3%;}
	.bgcent1 {margin:  0px 200px;}
	.bgcent2 {margin:  0px 200px;}
	a{color:#fff;}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div id="navbar" class="navbar-collapse collapse">

			<div class="navbar-header">
				<span class="navbar-brand">${username}</span>
			</div>
			<ul class="nav navbar-nav navbar-left">
				<li><a class="a_left s_color"
					href="${pageContext.request.getContextPath()}/outLogin">退出登录</a></li>
			</ul>

		</div>
	</div>
	</nav>


	<div class="bgcent">

		<div class="btn-group-vertical ddgg" id="d1" role="group"
			aria-label="...">
			<button type="button" class="btn btn-primary">微信一</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/downWeChat?adwid=1">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
				onclick="deleteAllNum()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d2" role="group"
			aria-label="...">
			<button type="button" class="btn btn-success">微信二</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/downWeChat?adwid=2">导出</a>
			</button>
			<button type="button" class="btn btn-success"
				onclick="deleteSuccLogin()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d3" role="group"
			aria-label="...">
			<button type="button" class="btn btn-info">微信三</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/downWeChat?adwid=3">导出</a>
			</button>
			<button type="button" class="btn btn-info"
				onclick="deleteFaildSend()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d4" role="group"
			aria-label="...">
			<button type="button" class="btn btn-warning">微信四</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/downWeChat?adwid=4">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
				onclick="deleteSuccGet()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d5" role="group"
			aria-label="...">
			<button type="button" class="btn btn-danger">微信五</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/downWeChat?adwid=5">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail()">
				删除</button>

		</div>
	</div>





	<script type="text/javascript">
$(function() {
	$.ajax({
		url : "${pageContext.request.getContextPath()}/countWechat",
		type:"GET",	
		success : function(result) {
			var list = result.extend.list;
			var countAllphone = list[0];
			var countFailSend = list[1];
			var countGetfailphones = list[2];
			var countSuccessGet = list[3];
			var countSuccessLogin = list[4];

			$("<span></span>")

			.append("總記錄數:").append(countAllphone).appendTo("#d1");

			$("<span></span>")

			.append("總記錄數:").append(countFailSend).appendTo("#d2");

			$("<span></span>").append("總記錄數:").append(
					countGetfailphones).appendTo("#d3");

			$("<span></span>").append("總記錄數:").append(countSuccessGet)
					.appendTo("#d4");

			$("<span></span>").append("總記錄數:")
					.append(countSuccessLogin).appendTo("#d5");
		}
	});

});
 
	function deleteAllNum() {
		if (confirm("确认删除吗?")) {
			window.location.href = "${pageContext.request.getContextPath()}/deleteWechat?adwid=1";
		}}
	
	function deleteSuccLogin() {
		if (confirm("确认删除吗?")) {
			window.location.href = "${pageContext.request.getContextPath()}/deleteWechat?adwid=2";
		}	}
	
	function deleteFaildSend() {
		if (confirm("确认删除吗?")) {
			window.location.href = "${pageContext.request.getContextPath()}/deleteWechat?adwid=3";
		}		}
	
	function deleteSuccGet() {
		if (confirm("确认删除吗?")) {
			window.location.href = "${pageContext.request.getContextPath()}/deleteWechat?adwid=4";
		}		}
	
	function getfail() {
		if (confirm("确认删除吗?")) {
			window.location.href = "${pageContext.request.getContextPath()}/deleteWechat?adwid=5";
		}		}
	


































</script>















</body>
</html>