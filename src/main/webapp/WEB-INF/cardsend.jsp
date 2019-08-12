<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.getContextPath()}/static/jquery-3.3.1/jquery-3.3.1.min.js">
	
</script>
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
</head>
 <style>
 	.mmdd{margin:100px;}
 </style>
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
			<!--   <ul class="nav navbar-nav navbar-right">
			<li><button id="upload" class="a_right  btn-danger">上传文件</button> </li>
          </ul>
          <form class="navbar-form navbar-right s_color" id="uploadForm" enctype="multipart/form-data">
          <input id="file" type="file" name="file" /> 
          </form> -->
		</div>
	</div>
	</nav>

<div class="row col-md-offset-1">
	<div class="mmdd">
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList()">a1卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=1">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(1)">
				删除</button>
			<span id="d1"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList()">a2卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=2">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(2)">删除</button>
			<span id="d2"></span>
		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList()">a3卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=3">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(3)">删除</button>
<span id="d3"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList()">a4卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=4">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(4)">删除</button>
<span id="d4"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList()">a5卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=5">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(5)">
				删除</button>
<span id="d5"></span>

		</div>
		
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList()">a6卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=6">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(6)">
				删除</button>
<span id="d6"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList()">a7卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=7">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(7)">删除</button>
<span id="d7"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList()">a8卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=8">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(8)">删除</button>
<span id="d8"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList()">a9卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=9">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(9)">删除</button>
<span id="d9"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList()">a10卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=10">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(10)">
				删除</button>
<span id="d10"></span>

		</div>
		

	</div>
	
	
	<div class="mmdd">
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_1()">a11卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=11">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(11)">
				删除</button>
<span id="d11"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_1()">a12卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=12">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(12)">删除</button>
<span id="d12"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_1()">a13卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=13">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(13)">删除</button>
<span id="d13"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_1()">a14卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=14">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(14)">删除</button>
<span id="d14"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_1()">a15卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=15">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(15)">
				删除</button>
<span id="d15"></span>

		</div>
		
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_1()">a16卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=16">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(16)">
				删除</button>
<span id="d16"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_1()">a17卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=17">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(17)">删除</button>
<span id="d17"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_1()">a18卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=18">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(18)">删除</button>
<span id="d18"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_1()">a19卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=19">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(19)">删除</button>
<span  id="d19" ></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_1()">a20卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=20">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(20)">
				删除</button>
<span id="d20"></span>

		</div>
		

	</div>
	
	
	<div class="mmdd">
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_2()">a21卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=21">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(21)">
				删除</button>
<span id="d21"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_2()">a22卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=22">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(22)">删除</button>
<span id="d22"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_2()">a23卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=23">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(23)">删除</button>
<span id="d23"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_2()">a24卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=24">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(24)">删除</button>
<span id="d24" ></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_2()">a25卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=25">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(25)">
				删除</button>
<span  id="d25" ></span>

		</div>
		
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_2()">a26卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=26">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(26)">
				删除</button>
<span id="d26"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_2()">a27卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=27">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(27)">删除</button>
<span id="d27"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_2()">a28卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=28">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(28)">删除</button>
<span id="d28"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_2()">a29卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=29">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(29)">删除</button>
<span id="d29"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_2()">a30卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=30">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(30)">
				删除</button>
<span  id="d30"></span>

		</div>
		

	</div>
	
	
	<div class="mmdd">
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_3()">a31卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=31">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(31)">
				删除</button>
<span id="d31"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_3()">a32卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=32">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(32)">删除</button>
<span id="d32" ></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_3()">a33卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=33">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(33)">删除</button>
<span id="d33" ></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_3()">a34卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=34">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(34)">删除</button>
<span id="d34"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_3()">a35卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=35">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(35)">
				删除</button>
<span id="d35"></span>

		</div>
		
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_3()">a36卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=36">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(36)">
				删除</button>
<span id="d36"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_3()">a37卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=37">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(37)">删除</button>
<span  id="d37"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_3()">a38卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=38">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(38)">删除</button>
<span id="d38"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_3()">a39卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=39">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(39)">删除</button>
<span id="d39"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_3()">a40卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=40">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(40)">
				删除</button>
<span id="d40" ></span>

		</div>
		

	</div>

<div class="mmdd">
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_4()">a41卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=41">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(41)">
				删除</button>
<span id="d41" ></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_4()">a42卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=42">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(42)">删除</button>
<span id="d42"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_4()">a43卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=43">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(43)">删除</button>
<span id="d43"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_4()">a44卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=44">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(44)">删除</button>
<span id="d44"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_4()">a45卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=45">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(45)">
				删除</button>
<span id="d45"></span>

		</div>
		
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_4()">a46卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=46">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(46)">
				删除</button>
<span id="d46"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_4()">a47卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=47">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(47)">删除</button>
<span id="d47"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_4()">a48卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=48">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(48)">删除</button>
<span id="d48"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_4()">a49卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=49">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(49)">删除</button>
<span id="d49"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_4()">a50卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=50">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(50)">
				删除</button>
<span id="d50"></span>

		</div>
		

	</div>


<div class="mmdd">
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_5()">a51卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=51">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(51)">
				删除</button>
<span id="d51"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_5()">a52卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=52">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(52)">删除</button>
<span id="d52"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_5()">a53卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=53">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(53)">删除</button>
<span id="d53"></span>

		</div>
		<div class="btn-group-vertical ddgg" role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_5()">a54卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=54">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(54)">删除</button>
<span id="d54" ></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_5()">a55卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=55">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(55)">
				删除</button>
<span id="d55"></span>

		</div>
		
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-primary" onclick="cardSendList_5()">a56卡发明细</button>
			<button type="button" class="btn btn-primary">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=56">导出</a>
			</button>
			<button type="button" class="btn btn-primary" onclick="delecak(56)">
				删除</button>
<span id="d56"></span>

		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-success" onclick="cardSendList_5()">a57卡发明细</button>
			<button type="button" class="btn btn-success">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=57">导出</a>
			</button>
			<button type="button" class="btn btn-success" onclick="delecak(57)">删除</button>
<span id="d57"></span>

		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-info" onclick="cardSendList_5()">a58卡发明细</button>
			<button type="button" class="btn btn-info">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=58">导出</a>
			</button>
			<button type="button" class="btn btn-info" onclick="delecak(58)">删除</button>
<span id="d58"></span>
		</div>
		<div class="btn-group-vertical ddgg"   role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-warning" onclick="cardSendList_5()">a59卡发明细</button>
			<button type="button" class="btn btn-warning">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=59">导出</a>
			</button>
			<button type="button" class="btn btn-warning" onclick="delecak(59)">删除</button>
	<span id="d59"></span>
		</div>
		<div class="btn-group-vertical ddgg"  role="group"
			aria-label="接码一">
			<button type="button" class="btn btn-danger" onclick="cardSendList_5()">a60卡发明细</button>
			<button type="button" class="btn btn-danger">
				<a
					href="${pageContext.request.getContextPath()}/excel_downCard?middletag=60">导出</a>
			</button>
			<button type="button" class="btn btn-danger" onclick="delecak(60)">
				删除</button>
			<span id="d60"></span>
		</div>
		

	</div>

</div>












	<script type="text/javascript">
		/* 开发开始 */

		function delecak(pn) {
			if (confirm("确定删除【卡发"+pn+"】的数据吗")) {
				
				window.location.href = "${pageContext.request.getContextPath()}/deletecak?middletag="+pn;
			}
		}
	
		
		
		

		function cardSendList() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/cardSendList",
				type : "GET",
				datatype:'json',
				data:{"numlist":"1-2-3-4-5-6-7-8-9-10"},
				success : function(result) {
					console.log(result);
					var list = result.extend.list;
					console.log(list);
					var list1 = list[0];
					var list2 = list[1];
					var list3 = list[2];
					var list4 = list[3];
					var list5 = list[4];
					var list6 = list[5];
					var list7 = list[6];
					var list8 = list[7];
					var list9 = list[8];
					var list10 = list[9];
					$("#d1").empty();$("#d2").empty();$("#d3").empty();$("#d4").empty();$("#d5").empty();
					$("#d6").empty();$("#d7").empty();$("#d8").empty();$("#d9").empty();$("#d10").empty();
					$("<span></span>").append("总记录").append(list1).appendTo(
							"#d1");
					$("<span></span>").append("总记录").append(list2).appendTo(
							"#d2");
					$("<span></span>").append("总记录").append(list3).appendTo(
							"#d3");
					$("<span></span>").append("总记录").append(list4).appendTo(
							"#d4");
					$("<span></span>").append("总记录").append(list5).appendTo(
							"#d5");
					$("<span></span>").append("总记录").append(list6).appendTo(
							"#d6");
					$("<span></span>").append("总记录").append(list7).appendTo(
							"#d7");
					$("<span></span>").append("总记录").append(list8).appendTo(
							"#d8");
					$("<span></span>").append("总记录").append(list9).appendTo(
							"#d9");
					$("<span></span>").append("总记录").append(list10).appendTo(
							"#d10");

				}

			})
		}
		 
		

		function cardSendList_1() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/cardSendList",
				type : "GET",
				datatype:'json',
				data:{"numlist":"11-12-13-14-15-16-17-18-19-20"},
				success : function(result) {
					console.log(result);
					var list = result.extend.list;
					console.log(list);
					var list1 = list[0];
					var list2 = list[1];
					var list3 = list[2];
					var list4 = list[3];
					var list5 = list[4];
					var list6 = list[5];
					var list7 = list[6];
					var list8 = list[7];
					var list9 = list[8];
					var list10 = list[9];
					$("#d11").empty();$("#d12").empty();$("#d13").empty();$("#d14").empty();$("#d15").empty();
					$("#d16").empty();$("#d17").empty();$("#d18").empty();$("#d19").empty();$("#d20").empty();
					$("<span></span>").append("总记录").append(list1).appendTo(
							"#d11");
					$("<span></span>").append("总记录").append(list2).appendTo(
							"#d12");
					$("<span></span>").append("总记录").append(list3).appendTo(
							"#d13");
					$("<span></span>").append("总记录").append(list4).appendTo(
							"#d14");
					$("<span></span>").append("总记录").append(list5).appendTo(
							"#d15");
					$("<span></span>").append("总记录").append(list6).appendTo(
							"#d16");
					$("<span></span>").append("总记录").append(list7).appendTo(
							"#d17");
					$("<span></span>").append("总记录").append(list8).appendTo(
							"#d18");
					$("<span></span>").append("总记录").append(list9).appendTo(
							"#d19");
					$("<span></span>").append("总记录").append(list10).appendTo(
							"#d20");

				}

			})
		}
		 
		
		
		
		
		

		function cardSendList_2() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/cardSendList",
				type : "GET",
				datatype:'json',
				data:{"numlist":"21-22-23-24-25-26-27-28-29-30"},
				success : function(result) {
					console.log(result);
					var list = result.extend.list;
					console.log(list);
					var list1 = list[0];
					var list2 = list[1];
					var list3 = list[2];
					var list4 = list[3];
					var list5 = list[4];
					var list6 = list[5];
					var list7 = list[6];
					var list8 = list[7];
					var list9 = list[8];
					var list10 = list[9];
					$("#d21").empty();$("#d22").empty();$("#d23").empty();$("#d24").empty();$("#d25").empty();
					$("#d26").empty();$("#d27").empty();$("#d28").empty();$("#d29").empty();$("#d30").empty();
					$("<span></span>").append("总记录").append(list1).appendTo(
							"#d21");
					$("<span></span>").append("总记录").append(list2).appendTo(
							"#d22");
					$("<span></span>").append("总记录").append(list3).appendTo(
							"#d23");
					$("<span></span>").append("总记录").append(list4).appendTo(
							"#d24");
					$("<span></span>").append("总记录").append(list5).appendTo(
							"#d25");
					$("<span></span>").append("总记录").append(list6).appendTo(
							"#d26");
					$("<span></span>").append("总记录").append(list7).appendTo(
							"#d27");
					$("<span></span>").append("总记录").append(list8).appendTo(
							"#d28");
					$("<span></span>").append("总记录").append(list9).appendTo(
							"#d29");
					$("<span></span>").append("总记录").append(list10).appendTo(
							"#d30");

				}

			})
		}
		 
		
		
		
		

		function cardSendList_3() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/cardSendList",
				type : "GET",
				datatype:'json',
				data:{"numlist":"31-32-33-34-35-36-37-38-39-40"},
				success : function(result) {
					console.log(result);
					var list = result.extend.list;
					console.log(list);
					var list1 = list[0];
					var list2 = list[1];
					var list3 = list[2];
					var list4 = list[3];
					var list5 = list[4];
					var list6 = list[5];
					var list7 = list[6];
					var list8 = list[7];
					var list9 = list[8];
					var list10 = list[9];
					$("#d31").empty();$("#d32").empty();$("#d33").empty();$("#d34").empty();$("#d35").empty();
					$("#d36").empty();$("#d37").empty();$("#d38").empty();$("#d39").empty();$("#d40").empty();
					$("<span></span>").append("总记录").append(list1).appendTo(
							"#d31");
					$("<span></span>").append("总记录").append(list2).appendTo(
							"#d32");
					$("<span></span>").append("总记录").append(list3).appendTo(
							"#d33");
					$("<span></span>").append("总记录").append(list4).appendTo(
							"#d34");
					$("<span></span>").append("总记录").append(list5).appendTo(
							"#d35");
					$("<span></span>").append("总记录").append(list6).appendTo(
							"#d36");
					$("<span></span>").append("总记录").append(list7).appendTo(
							"#d37");
					$("<span></span>").append("总记录").append(list8).appendTo(
							"#d38");
					$("<span></span>").append("总记录").append(list9).appendTo(
							"#d39");
					$("<span></span>").append("总记录").append(list10).appendTo(
							"#d40");

				}

			})
		}
		 
		
		

		function cardSendList_4() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/cardSendList",
				type : "GET",
				datatype:'json',
				data:{"numlist":"41-42-43-44-45-46-47-48-49-50"},
				success : function(result) {
					console.log(result);
					var list = result.extend.list;
					console.log(list);
					var list1 = list[0];
					var list2 = list[1];
					var list3 = list[2];
					var list4 = list[3];
					var list5 = list[4];
					var list6 = list[5];
					var list7 = list[6];
					var list8 = list[7];
					var list9 = list[8];
					var list10 = list[9];
					$("#d41").empty();$("#d42").empty();$("#d43").empty();$("#d44").empty();$("#d45").empty();
					$("#d46").empty();$("#d47").empty();$("#d48").empty();$("#d49").empty();$("#d50").empty();
					$("<span></span>").append("总记录").append(list1).appendTo(
							"#d41");
					$("<span></span>").append("总记录").append(list2).appendTo(
							"#d42");
					$("<span></span>").append("总记录").append(list3).appendTo(
							"#d43");
					$("<span></span>").append("总记录").append(list4).appendTo(
							"#d44");
					$("<span></span>").append("总记录").append(list5).appendTo(
							"#d45");
					$("<span></span>").append("总记录").append(list6).appendTo(
							"#d46");
					$("<span></span>").append("总记录").append(list7).appendTo(
							"#d47");
					$("<span></span>").append("总记录").append(list8).appendTo(
							"#d48");
					$("<span></span>").append("总记录").append(list9).appendTo(
							"#d49");
					$("<span></span>").append("总记录").append(list10).appendTo(
							"#d50");

				}

			})
		}
		 
		
		
		
		

		function cardSendList_5() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/cardSendList",
				type : "GET",
				datatype:'json',
				data:{"numlist":"51-52-53-54-55-56-57-58-59-60"},
				success : function(result) {
					console.log(result);
					var list = result.extend.list;
					console.log(list);
					var list1 = list[0];
					var list2 = list[1];
					var list3 = list[2];
					var list4 = list[3];
					var list5 = list[4];
					var list6 = list[5];
					var list7 = list[6];
					var list8 = list[7];
					var list9 = list[8];
					var list10 = list[9];
					$("#d51").empty();$("#d52").empty();$("#d53").empty();$("#d54").empty();$("#d55").empty();
					$("#d56").empty();$("#d57").empty();$("#d58").empty();$("#d59").empty();$("#d60").empty();
					$("<span></span>").append("总记录").append(list1).appendTo(
							"#d51");
					$("<span></span>").append("总记录").append(list2).appendTo(
							"#d52");
					$("<span></span>").append("总记录").append(list3).appendTo(
							"#d53");
					$("<span></span>").append("总记录").append(list4).appendTo(
							"#d54");
					$("<span></span>").append("总记录").append(list5).appendTo(
							"#d55");
					$("<span></span>").append("总记录").append(list6).appendTo(
							"#d56");
					$("<span></span>").append("总记录").append(list7).appendTo(
							"#d57");
					$("<span></span>").append("总记录").append(list8).appendTo(
							"#d58");
					$("<span></span>").append("总记录").append(list9).appendTo(
							"#d59");
					$("<span></span>").append("总记录").append(list10).appendTo(
							"#d60");

				}

			})
		}
		 
		
		
		
		
		
		
		
		
		
		
	</script>

</body>
</html>