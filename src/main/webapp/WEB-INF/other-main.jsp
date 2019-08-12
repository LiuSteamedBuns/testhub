<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>statistics two</title>
<script type="text/javascript"
	src="${pageContext.request.getContextPath()}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<style type="text/css">
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
<!--  解码NNG -->
	<div class="bgcent">
			<p>NNG</p>
		<div class="btn-group-vertical ddgg" id="d1" role="group"
			aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=1">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
				onclick="deleteAllNum()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d2" role="group"
			aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button> 
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=1">导出</a>
			</button>
			<button type="button" class="btn btn-success"
				onclick="deleteSuccLogin()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d3" role="group"
			aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=1">导出</a>
			</button>
			<button type="button" class="btn btn-info"
				onclick="deleteFaildSend()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d4" role="group"
			aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=1">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
				onclick="deleteSuccGet()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="d5" role="group"
			aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=1">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail()">
				删除</button>

		</div>
		
		
	<div class="btn-group-vertical ddgg" id="c1" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=1">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c2" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=1">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
		
		
		
		
		
		
		
	</div>

	<!-- 以上为解码一    tab_1  middletag=1 -->
	
	
	<div class="bgcent1">
	<p>JX</p>
		<div class="btn-group-vertical ddgg1" id="d6" role="group"
			aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=2">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
				onclick="deleteAllNum_2()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d7" role="group"
			aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=2">导出</a>
			</button>
			<button type="button" class="btn btn-success"
				onclick="deleteSuccLogin_2()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d8" role="group"
			aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=2">导出</a>
			</button>
			<button type="button" class="btn btn-info"
				onclick="deleteFaildSend_2()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d9" role="group"
			aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=2">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
				onclick="deleteSuccGet_2()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="d10" role="group"
			aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=2">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_2()">
				删除</button>

		</div>
		
		
		
		<div class="btn-group-vertical ddgg" id="c3" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=2">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_2()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c4" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=2">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_2()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
		
		
		
	</div>
	<!-- 以上是解码二 tab_1   middletag=2 -->
	
		
	<div class="bgcent2">
	<p>接码三</p>
		<div class="btn-group-vertical ddgg1" id="d11" role="group"
			aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=3">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
				onclick="deleteAllNum_3()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d12" role="group"
			aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=3">导出</a>
			</button>
			<button type="button" class="btn btn-success"
				onclick="deleteSuccLogin_3()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d13" role="group"
			aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=3">导出</a>
			</button>
			<button type="button" class="btn btn-info"
				onclick="deleteFaildSend_3()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d14" role="group"
			aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=3">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
				onclick="deleteSuccGet_3()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="d15" role="group"
			aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=3">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_3()">
				删除</button>

		</div>
		
		
		
			
		<div class="btn-group-vertical ddgg" id="c5" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=3">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_3()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c6" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=3">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_3()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
		
		
	</div>
	<!--  以上是解码三 tab_1   middletag=3-->


	
	<div class="bgcent2">
	<p>接码四</p>
		<div class="btn-group-vertical ddgg1" id="d16" role="group"
			aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=4">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
				onclick="deleteAllNum_4()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d17" role="group"
			aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=4">导出</a>
			</button>
			<button type="button" class="btn btn-success"
				onclick="deleteSuccLogin_4()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d18" role="group"
			aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=4">导出</a>
			</button>
			<button type="button" class="btn btn-info"
				onclick="deleteFaildSend_4()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d19" role="group"
			aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=4">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
				onclick="deleteSuccGet_4()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="d20" role="group"
			aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=4">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_4()">
				删除</button>

		</div>
		
		
				
		<div class="btn-group-vertical ddgg" id="c7" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=4">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_4()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c8" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=4">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_4()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
		
		
		
		
		
		
	</div>

	
	
	<div class="bgcent2">
	<p>接码五</p>
		<div class="btn-group-vertical ddgg1" id="d21" role="group"
			aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=5">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
				onclick="deleteAllNum_5()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d22" role="group"
			aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=5">导出</a>
			</button>
			<button type="button" class="btn btn-success"
				onclick="deleteSuccLogin_5()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d23" role="group"
			aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=5">导出</a>
			</button>
			<button type="button" class="btn btn-info"
				onclick="deleteFaildSend_5()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="d24" role="group"
			aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=5">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
				onclick="deleteSuccGet_5()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="d25" role="group"
			aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=5">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_5()">
				删除</button>

		</div>
		
		
				
		<div class="btn-group-vertical ddgg" id="c9" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=5">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_5()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c10" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=5">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_5()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
		
		
		
		
		
		
	</div>

	<!--555555555555555555555555555555  -->






	<div class="bgcent2">
		<p><strong>接码六</strong></p>
		<div class="btn-group-vertical ddgg" id="a1" role="group"
			 aria-label="接码一">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=6">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
					onclick="deleteAllNum_6()">
				删除
			</button>

		</div>
		<div class="btn-group-vertical ddgg" id="a2" role="group"
			 aria-label="接码一">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
						href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=6">导出</a>
			</button>
			<button type="button" class="btn btn-success"
					onclick="deleteSuccLogin_6()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="a3" role="group"
			 aria-label="接码一">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
						href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=6">导出</a>
			</button>
			<button type="button" class="btn btn-info"
					onclick="deleteFaildSend_6()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="a4" role="group"
			 aria-label="接码一">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=6">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
					onclick="deleteSuccGet_6()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg" id="a5" role="group"
			 aria-label="接码一">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=6">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="getfail_6()">
				删除</button>

		</div>
		
				
		<div class="btn-group-vertical ddgg" id="c11" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=6">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_6()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c12" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=6">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_6()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
	</div>

	<!-- 以上为解码7 tab    middletag=7 -->

	<div class="bgcent1">
		<p><strong>解码七</strong></p>
		<div class="btn-group-vertical ddgg1" id="a6" role="group"
			 aria-label="接码二">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=7">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
					onclick="deleteAllNum_7()">
				删除
			</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a7" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
						href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=7">导出</a>
			</button>
			<button type="button" class="btn btn-success"
					onclick="deleteSuccLogin_7()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a8" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
						href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=7">导出</a>
			</button>
			<button type="button" class="btn btn-info"
					onclick="deleteFaildSend_7()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a9" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=7">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
					onclick="deleteSuccGet_7()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a10" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=7">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="getfail_7()">
				删除</button>


		</div>
		
		
				
		<div class="btn-group-vertical ddgg" id="c13" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=7">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_7()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c14" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=7">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_7()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
	</div>

	<!-- 以上为解码2   middletag=8-->

	<div class="bgcent2">
		<p><strong>接码八</strong></p>
		<div class="btn-group-vertical ddgg1" id="a11" role="group"
			 aria-label="接码二">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=8">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
					onclick="deleteAllNum_8()">
				删除
			</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a12" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
						href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=8">导出</a>
			</button>
			<button type="button" class="btn btn-success"
					onclick="deleteSuccLogin_8()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a13" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
						href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=8">导出</a>
			</button>
			<button type="button" class="btn btn-info"
					onclick="deleteFaildSend_8()">删除</button>


		</div>
		<div class="btn-group-vertical ddgg1" id="a14" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=8">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
					onclick="deleteSuccGet_8()">删除</button>


		</div>
		<div class="btn-group-vertical ddgg1" id="a15" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=8">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="getfail_8()">
				删除</button>


		</div>
		
		
			<div class="btn-group-vertical ddgg" id="c15" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=8">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_8()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c16" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=8">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_8()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
		
		
		
	</div>
	<!-- 以上为解码3  middletag=9  -->




	<div class="bgcent2">
		<p>接码九</p>
		<div class="btn-group-vertical ddgg1" id="a16" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=9">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
					onclick="deleteAllNum_9()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a17" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
						href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=9">导出</a>
			</button>
			<button type="button" class="btn btn-success"
					onclick="deleteSuccLogin_9()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a18" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
						href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=9">导出</a>
			</button>
			<button type="button" class="btn btn-info"
					onclick="deleteFaildSend_9()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a19" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=9">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
					onclick="deleteSuccGet_9()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="a20" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=9">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_9()">
				删除</button>

		</div>
		
			<div class="btn-group-vertical ddgg" id="c17" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=9">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_9()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c18" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=9">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_9()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
		
		
	</div>



	<div class="bgcent2">
		<p>接码十</p>
		<div class="btn-group-vertical ddgg1" id="a21" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=10">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
					onclick="deleteAllNum_10()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a22" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
						href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=10">导出</a>
			</button>
			<button type="button" class="btn btn-success"
					onclick="deleteSuccLogin_10()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a23" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
						href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=10">导出</a>
			</button>
			<button type="button" class="btn btn-info"
					onclick="deleteFaildSend_10()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="a24" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=10">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
					onclick="deleteSuccGet_10()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="a25" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=10">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_10()">
				删除</button>

		</div>
		
		
			
		<div class="btn-group-vertical ddgg1" id="c19" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=10">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_10()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg1" id="c20" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=10">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_10()">
				删除</button>

		</div>
		
		
		</div>
	
		
		<!-- end of the shit -->
		
	 
	<%--11111111111111111111--%>

	<!--566666666666666666666666666666666666666666666666665  -->


	<div class="bgcent2">
		<p>接码十一</p>
		<div class="btn-group-vertical ddgg1" id="b1" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=11">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
					onclick="deleteAllNum_11()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="b2" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
						href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=11">导出</a>
			</button>
			<button type="button" class="btn btn-success"
					onclick="deleteSuccLogin_11()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="b3" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
						href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=11">导出</a>
			</button>
			<button type="button" class="btn btn-info"
					onclick="deleteFaildSend_11()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="b4" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=11">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
					onclick="deleteSuccGet_11()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="b5" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=11">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_11()">
				删除</button>

		</div>
		
		
		<div class="btn-group-vertical ddgg" id="c21" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=11">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_11()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c22" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=11">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_11()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
		
			
		</div>
		
	
	 


	<div class="bgcent2">
		<p>接码十二</p>
		<div class="btn-group-vertical ddgg1" id="b6" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-primary">全部电话号码</button>
			<button type="button" class="btn btn-primary">
				<a href="${pageContext.request.getContextPath()}/excel_downALLNum_1?middlename=12">导出</a>
			</button>
			<button type="button" class="btn btn-primary"
					onclick="deleteAllNum_12()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="b7" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-success">登录成功的号码</button>
			<button type="button" class="btn btn-success">
				<a
						href="${pageContext.request.getContextPath()}/excel_downSuccLogin_1?middlename=12">导出</a>
			</button>
			<button type="button" class="btn btn-success"
					onclick="deleteSuccLogin_12()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="b8" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-info">成功登录不能发短信</button>
			<button type="button" class="btn btn-info">
				<a
						href="${pageContext.request.getContextPath()}/excel_downLoginFailsend_1?middlename=12">导出</a>
			</button>
			<button type="button" class="btn btn-info"
					onclick="deleteFaildSend_12()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1" id="b9" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-warning">成功获取验证码</button>
			<button type="button" class="btn btn-warning">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetsuccess_1?middlename=12">导出</a>
			</button>
			<button type="button" class="btn btn-warning"
					onclick="deleteSuccGet_12()">删除</button>

		</div>
		<div class="btn-group-vertical ddgg1 " id="b10" role="group"
			 aria-label="...">
			<button type="button" class="btn btn-danger">取到码,登录失败</button>
			<button type="button" class="btn btn-danger">
				<a
						href="${pageContext.request.getContextPath()}/excel_downGetFaild_1?middlename=12">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="getfail_12()">
				删除</button>

		</div>
	 		 
		<div class="btn-group-vertical ddgg" id="c23" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">成功返回的码</button>
			<button type="button" class="btn btn-danger"><a		  excel_downSuccReturn_1	
					href="${pageContext.request.getContextPath()}/excel_downSuccReturn_1?middlename=12">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="SuccRetrun_12()">
				删除</button>
		</div>
		
		<div class="btn-group-vertical ddgg" id="c24" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger">待定</button>
			<button type="button" class="btn btn-danger"><a
					href="${pageContext.request.getContextPath()}/excel_downPending_1?middlename=12">导出</a></button>
			<button type="button" class="btn btn-danger" onclick="Pending_12()">
				删除</button>

		</div>
		
		<!-- end of the shit -->
		
	 		
	</div>






 



	<script type="text/javascript">
		$(function() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/recordlist_1",
				type : "GET",
				datatype:'json',
				data:{"middlename":1},		
				success : function(result) {
					var list = result.extend.list;
					var countAllphone = list[0];
					var countFailSend = list[1];
					var countGetfailphones = list[2];
					var countSuccessGet = list[3];
					var countSuccessLogin = list[4];
					var countSuccReturn = list[5];
					var countPending = list[6];

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
					
					$("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c1");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c2");
			
			
					
					
					
					
					
					
					
				}
			});

		});

		$(function() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/recordlist_1",
				type : "GET",
				datatype:'json',
				data:{"middlename":2},
				success : function(result) {
					var list = result.extend.list;
					var countAllphone = list[0];
					var countFailSend = list[1];
					var countGetfailphones = list[2];
					var countSuccessGet = list[3];
					var countSuccessLogin = list[4];
					var countSuccReturn = list[5];
					var countPending = list[6];
				
					$("<span></span>")

					.append("總記錄數:").append(countAllphone).appendTo("#d6");

					$("<span></span>")

					.append("總記錄數:").append(countFailSend).appendTo("#d7");

					$("<span></span>").append("總記錄數:").append(
							countGetfailphones).appendTo("#d8");

					$("<span></span>").append("總記錄數:").append(countSuccessGet)
							.appendTo("#d9");

					$("<span></span>").append("總記錄數:")
							.append(countSuccessLogin).appendTo("#d10");
				
				
					$("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c3");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c4");
			
					
					
					
				}
			});

		});

		$(function() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/recordlist_1",
				type : "GET",
				datatype:'json',
				data:{"middlename":3},
				success : function(result) {
					var list = result.extend.list;
					var countAllphone = list[0];
					var countFailSend = list[1];
					var countGetfailphones = list[2];
					var countSuccessGet = list[3];
					var countSuccessLogin = list[4];
					var countSuccReturn = list[5];
					var countPending = list[6];
				 
					$("<span></span>")

					.append("總記錄數:").append(countAllphone).appendTo("#d11");

					$("<span></span>")

					.append("總記錄數:").append(countFailSend).appendTo("#d12");

					$("<span></span>").append("總記錄數:").append(
							countGetfailphones).appendTo("#d13");

					$("<span></span>").append("總記錄數:").append(countSuccessGet)
							.appendTo("#d14");

					$("<span></span>").append("總記錄數:")
							.append(countSuccessLogin).appendTo("#d15");
					
			
					$("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c5");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c6");
			
				}
			});

		});
		
		$(function() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/recordlist_1",
				type : "GET",
				datatype:'json',
				data:{"middlename":4},
				success : function(result) {
					var list = result.extend.list;
					var countAllphone = list[0];
					var countFailSend = list[1];
					var countGetfailphones = list[2];
					var countSuccessGet = list[3];
					var countSuccessLogin = list[4];
					var countSuccReturn = list[5];
					var countPending = list[6];
				 

					$("<span></span>")

					.append("總記錄數:").append(countAllphone).appendTo("#d16");

					$("<span></span>")

					.append("總記錄數:").append(countFailSend).appendTo("#d17");

					$("<span></span>").append("總記錄數:").append(
							countGetfailphones).appendTo("#d18");

					$("<span></span>").append("總記錄數:").append(countSuccessGet)
							.appendTo("#d19");

					$("<span></span>").append("總記錄數:")
							.append(countSuccessLogin).appendTo("#d20");

					$("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c7");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c8");
			
					
				}
			});

		});
		
		
		
		$(function() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/recordlist_1",
				type : "GET",
				datatype:'json',
				data:{"middlename":5},
				success : function(result) {
					var list = result.extend.list;
					var countAllphone = list[0];
					var countFailSend = list[1];
					var countGetfailphones = list[2];
					var countSuccessGet = list[3];
					var countSuccessLogin = list[4];
					var countSuccReturn = list[5];
					var countPending = list[6];
					
					$("<span></span>")

					.append("總記錄數:").append(countAllphone).appendTo("#d21");

					$("<span></span>")

					.append("總記錄數:").append(countFailSend).appendTo("#d22");

					$("<span></span>").append("總記錄數:").append(
							countGetfailphones).appendTo("#d23");

					$("<span></span>").append("總記錄數:").append(countSuccessGet)
							.appendTo("#d24");

					$("<span></span>").append("總記錄數:")
							.append(countSuccessLogin).appendTo("#d25");

					$("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c9");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c10");
			
				
				}
			});

		});



        /*  678910----====== =*/

        $(function() {//接码6
            $.ajax({
                url : "${pageContext.request.getContextPath()}/recordlist_1",
                type : "GET",
                datatype:'json',
                data:{"middlename":6},
                success : function(result) {
                    var list = result.extend.list;
                    var countAllphone = list[0];
                    var countFailSend = list[1];
                    var countGetfailphones = list[2];
                    var countSuccessGet = list[3];
                    var countSuccessLogin = list[4];
                    var countSuccReturn = list[5];
					var countPending = list[6];
                    
                    
                    $("<span></span>").append("總記錄數:").append(countAllphone)
                        .appendTo("#a1");

                    $("<span></span>").append("總記錄數:").append(countFailSend)
                        .appendTo("#a2");

                    $("<span></span>").append("總記錄數:").append(
                        countGetfailphones).appendTo("#a3");

                    $("<span></span>").append("總記錄數:").append(countSuccessGet)
                        .appendTo("#a4");

                    $("<span></span>").append("總記錄數:")
                        .append(countSuccessLogin).appendTo("#a5");

					$("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c11");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c12");
                    
                    
                }
            });

        });

        $(function() {//接码7
            $.ajax({
                url : "${pageContext.request.getContextPath()}/recordlist_1",
                type : "GET",
                datatype:'json',
                data:{"middlename":7},
                success : function(result) {
                    var list = result.extend.list;
                    var countAllphone = list[0];
                    var countFailSend = list[1];
                    var countGetfailphones = list[2];
                    var countSuccessGet = list[3];
                    var countSuccessLogin = list[4];
                    var countSuccReturn = list[5];
					var countPending = list[6];
                    
                    $("<span></span>").append("總記錄數:").append(countAllphone)
                        .appendTo("#a6");
                    $("<span></span>").append("總記錄數:").append(countFailSend)
                        .appendTo("#a7");
                    $("<span></span>").append("總記錄數:").append(
                        countGetfailphones).appendTo("#a8");
                    $("<span></span>").append("總記錄數:").append(countSuccessGet)
                        .appendTo("#a9");
                    $("<span></span>").append("總記錄數:")
                        .append(countSuccessLogin).appendTo("#a10");

					$("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c13");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c14");
                    
                }
            });

        });

        $(function() {//解码8
            $.ajax({
                url : "${pageContext.request.getContextPath()}/recordlist_1",
                type : "GET",
                datatype:'json',
                data:{"middlename":8},
                success : function(result) {
                    var list = result.extend.list;
                    var countAllphone = list[0];
                    var countFailSend = list[1];
                    var countGetfailphones = list[2];
                    var countSuccessGet = list[3];
                    var countSuccessLogin = list[4];
                    var countSuccReturn = list[5];
					var countPending = list[6];
					
                    $("<span></span>").append("總記錄數:").append(countAllphone)
                        .appendTo("#a11");

                    $("<span></span>").append("總記錄數:").append(countFailSend)
                        .appendTo("#a12");

                    $("<span></span>").append("總記錄數:").append(
                        countGetfailphones).appendTo("#a13");

                    $("<span></span>").append("總記錄數:").append(countSuccessGet)
                        .appendTo("#a14");

                    $("<span></span>").append("總記錄數:")
                        .append(countSuccessLogin).appendTo("#a15");
                
                    $("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c15");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c16");
                    
                }
            });

        });


        $(function() {//解码9
            $.ajax({
                url : "${pageContext.request.getContextPath()}/recordlist_1",
                type : "GET",
                datatype:'json',
                data:{"middlename":9},
                success : function(result) {
                    var list = result.extend.list;
                    var countAllphone = list[0];
                    var countFailSend = list[1];
                    var countGetfailphones = list[2];
                    var countSuccessGet = list[3];
                    var countSuccessLogin = list[4];
                    var countSuccReturn = list[5];
					var countPending = list[6];
					
                    $("<span></span>")

                        .append("總記錄數:").append(countAllphone).appendTo("#a16");

                    $("<span></span>")

                        .append("總記錄數:").append(countFailSend).appendTo("#a17");

                    $("<span></span>").append("總記錄數:").append(
                        countGetfailphones).appendTo("#a18");

                    $("<span></span>").append("總記錄數:").append(countSuccessGet)
                        .appendTo("#a19");

                    $("<span></span>").append("總記錄數:")
                        .append(countSuccessLogin).appendTo("#a20");
               
                    $("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c17");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c18");
                
                }
            });

        });



        $(function() {//解码10
            $.ajax({
                url : "${pageContext.request.getContextPath()}/recordlist_1",
                type : "GET",
                datatype:'json',
                data:{"middlename":10},
                success : function(result) {
                    var list = result.extend.list;
                    var countAllphone = list[0];
                    var countFailSend = list[1];
                    var countGetfailphones = list[2];
                    var countSuccessGet = list[3];
                    var countSuccessLogin = list[4];
                    var countSuccReturn = list[5];
					var countPending = list[6];
					
                    $("<span></span>")

                        .append("總記錄數:").append(countAllphone).appendTo("#a21");

                    $("<span></span>")

                        .append("總記錄數:").append(countFailSend).appendTo("#a22");

                    $("<span></span>").append("總記錄數:").append(
                        countGetfailphones).appendTo("#a23");

                    $("<span></span>").append("總記錄數:").append(countSuccessGet)
                        .appendTo("#a24");

                    $("<span></span>").append("總記錄數:")
                        .append(countSuccessLogin).appendTo("#a25");
                    $("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c19");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c20");
                
                }
            });

        });

        /*a        aa    a a a */

        $(function() {//解码11
            $.ajax({
                url : "${pageContext.request.getContextPath()}/recordlist_1",
                type : "GET",
                datatype:'json',
                data:{"middlename":11},
                success : function(result) {
                    var list = result.extend.list;
                    var countAllphone = list[0];
                    var countFailSend = list[1];
                    var countGetfailphones = list[2];
                    var countSuccessGet = list[3];
                    var countSuccessLogin = list[4];
                    var countSuccReturn = list[5];
					var countPending = list[6];
					
                    $("<span></span>").append("總記錄數:").append(countAllphone)
                        .appendTo("#b1");

                    $("<span></span>").append("總記錄數:").append(countFailSend)
                        .appendTo("#b2");

                    $("<span></span>").append("總記錄數:").append(
                        countGetfailphones).appendTo("#b3");

                    $("<span></span>").append("總記錄數:").append(countSuccessGet)
                        .appendTo("#b4");

                    $("<span></span>").append("總記錄數:")
                        .append(countSuccessLogin).appendTo("#b5");
                    $("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c21");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c22");
                
                }
            });

        });


        $(function() {//解码9
            $.ajax({
                url : "${pageContext.request.getContextPath()}/recordlist_1",
                type : "GET",
                datatype:'json',
                data:{"middlename":12},
                success : function(result) {
                    var list = result.extend.list;
                    var countAllphone = list[0];
                    var countFailSend = list[1];
                    var countGetfailphones = list[2];
                    var countSuccessGet = list[3];
                    var countSuccessLogin = list[4];
                    var countSuccReturn = list[5];
					var countPending = list[6];
					
                    $("<span></span>")

                        .append("總記錄數:").append(countAllphone).appendTo("#b6");

                    $("<span></span>")

                        .append("總記錄數:").append(countFailSend).appendTo("#b7");

                    $("<span></span>").append("總記錄數:").append(
                        countGetfailphones).appendTo("#b8");

                    $("<span></span>").append("總記錄數:").append(countSuccessGet)
                        .appendTo("#b9");

                    $("<span></span>").append("總記錄數:")
                        .append(countSuccessLogin).appendTo("#b10");
                
                    $("<span></span>").append("總記錄數:")
					.append(countSuccReturn).appendTo("#c23");
			
					$("<span></span>").append("總記錄數:")
					.append(countPending).appendTo("#c24");
                
                
                
                }
            });

        });






















        /*  接码6  */
        function deleteAllNum_11() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=11";
            }
        }

        function deleteSuccLogin_11() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=11";
            }
        }

        function deleteFaildSend_11() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=11";
            }
        }

        function deleteSuccGet_11() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=11";
            }
        }

        function getfail_11() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=11";
            }
        }





        /*  接码6  */
        function deleteAllNum_12() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=12";
            }
        }

        function deleteSuccLogin_12() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=12";
            }
        }

        function deleteFaildSend_12() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=12";
            }
        }

        function deleteSuccGet_12() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=12";
            }
        }

        function getfail_12() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=12";
            }
        }


/*        5555555*/




        /*  接码6  */
        function deleteAllNum_6() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=6";
            }
        }

        function deleteSuccLogin_6() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=6";
            }
        }

        function deleteFaildSend_6() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=6";
            }
        }

        function deleteSuccGet_6() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=6";
            }
        }

        function getfail_6() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=6";
            }
        }









        /*  接码7  */
        function deleteAllNum_7() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=7";
            }
        }

        function deleteSuccLogin_7() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=7";
            }
        }

        function deleteFaildSend_7() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=7";
            }
        }

        function deleteSuccGet_7() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=7";
            }
        }

        function getfail_7() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=7";
            }
        }








        /*  接码8  */
        function deleteAllNum_8() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=8";
            }
        }

        function deleteSuccLogin_8() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=8";
            }
        }

        function deleteFaildSend_8() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=8";
            }
        }

        function deleteSuccGet_8() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=8";
            }
        }

        function getfail_8() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=8";
            }
        }








        /*  接码9  */
        function deleteAllNum_9() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=9";
            }
        }

        function deleteSuccLogin_9() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=9";
            }
        }

        function deleteFaildSend_9() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=9";
            }
        }

        function deleteSuccGet_9() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=9";
            }
        }

        function getfail_9() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=9";
            }
        }



        /*  接码10  */
        function deleteAllNum_10() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=10";
            }
        }

        function deleteSuccLogin_10() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=10";
            }
        }

        function deleteFaildSend_10() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=10";
            }
        }

        function deleteSuccGet_10() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=10";
            }
        }

        function getfail_10() {
            if (confirm("确认删除吗?")) {
                window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=10";
            }
        }




        function deleteAllNum() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=1";
			}}

		function deleteSuccLogin() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=1";
			}	}

		function deleteFaildSend() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=1";
			}		}

		function deleteSuccGet() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=1";
			}		}

		function getfail() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=1";
			}		}
		
	
		
		function deleteAllNum_2() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=2";
			}}

		function deleteSuccLogin_2() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=2";
			}	}

		function deleteFaildSend_2() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=2";
			}		}

		function deleteSuccGet_2() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=2";
			}		}

		function getfail_2() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=2";
			}		}
		

		
		function deleteAllNum_3() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=3";
			}}

		function deleteSuccLogin_3() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=3";
			}	}

		function deleteFaildSend_3() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=3";
			}		}

		function deleteSuccGet_3() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=3";
			}		}

		function getfail_3() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=3";
			}		}
		
	
		
		
		
		
		function deleteAllNum_4() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=4";
			}}

		function deleteSuccLogin_4() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=4";
			}	}

		function deleteFaildSend_4() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=4";
			}		}

		function deleteSuccGet_4() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=4";
			}		}

		function getfail_4() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=4";
			}		}
		


		
	
		
		function deleteAllNum_5() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteALLNum_1?middlename=5";
			}}

		function deleteSuccLogin_5() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccLogin_1?middlename=5";
			}	}

		function deleteFaildSend_5() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteFaildSend_1?middlename=5";
			}		}

		function deleteSuccGet_5() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteSuccGet_1?middlename=5";
			}		}

		function getfail_5() {
			if (confirm("确认删除吗?")) {
				window.location.href = "${pageContext.request.getContextPath()}/deleteGetFailLogin_1?middlename=5";
			}		}
		
 
        function SuccRetrun() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=1"; }}	
        function Pending() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=1";}}

        function SuccRetrun_2() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=2"; }}	
        function Pending_2() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=2";}}
    	
        function SuccRetrun_3() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=3"; }}	
        function Pending_3() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=3";}}

        function SuccRetrun_4() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=4";}}	
        function Pending_4() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=4";}}
 

        function SuccRetrun_5() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=5"; }}	
        function Pending_5() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=5";}}

        function SuccRetrun_6() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=6"; }}	
        function Pending_6() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=6";}}
    	
        function SuccRetrun_7() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=7"; }}	
        function Pending_7() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=7";}}

        function SuccRetrun_8() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=8";}}	
        function Pending_8() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=8";}}
 
        function SuccRetrun_9() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=9"; }}	
        function Pending_9() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=9";}}

        function SuccRetrun_10() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=10";}}	
        function Pending_10() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=10";}}
   
        function SuccRetrun_11() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=11"; }}	
        function Pending_11() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=11";}}

        function SuccRetrun_12() {if (confirm("确认删除吗?")) {window.location.href = "${pageContext.request.getContextPath()}/deleteSuccreturn_1?middlename=12";}}	
        function Pending_12() {if (confirm("确认删除吗?")) { window.location.href = "${pageContext.request.getContextPath()}/deletePending_1?middlename=12";}}
        	/* end the shit  */





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	</script>


</body>
</html>