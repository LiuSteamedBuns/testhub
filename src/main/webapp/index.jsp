<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Longin</title>
<script type="text/javascript"src="${pageContext.request.getContextPath()}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript"src="${pageContext.request.getContextPath()}/static/js/Barrett.js"></script>
<script type="text/javascript"src="${pageContext.request.getContextPath()}/static/js/BigInt.js"></script>
<script type="text/javascript"src="${pageContext.request.getContextPath()}/static/js/RSA.js"></script>
<script type="text/javascript"src="${pageContext.request.getContextPath()}/static/js/jsencrypt.min.js"></script>

<link href="static/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" /> 
<link href="static/font-awesome-4.7.0/css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>	
		<div class="login-box">
			<form class="login-form" action="${pageContext.request.getContextPath()}/login" method="post" >
				<h1>Welcome</h1>
				<input class="txtb" type="text" name="username" placeholder="Username">
				<input class="txtb"	type="password" id="password" name="password" placeholder="Password" > 
				<input class="login-btn" type="submit" " value="Login">
			</form>
		</div>
<script type="text/javascript">
function rsalogin() {
	var thisPwd = document.getElementById("password").value;
	bodyRSA();
	var result = encryptedString(key, encodeURIComponent(thisPwd));
	//result为需要传输到后台以解密的密文，自己在复制到Test.java里测试
	console.log(result);
	//alert(encodeURIComponent(thisPwd)+"\r\n"+result);  
	//loginForm.action = "loginCHK.jsp?result=" + result;
	//loginForm.submit();

	}
	var key;

</script>


</body>
</html>












