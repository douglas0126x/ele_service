<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>

<jsp:include page="inc.jsp"></jsp:include>

</head>
<body class="login" style="width:400px; margin:15% auto; background-image:url(${pageContext.request.contextPath}/img/login_background_pic.png);
background-repeat:no-repeat;background-attachment:fixed;background-position:center;background-size:100% 100%;">
	<div  style="width:310px; padding: 10px;">
		<div class="login_head" ></div>
		<div style="padding:30px 0 10px 50px">
		<!-- 
	    <form id="loginForm" action="userController/login.action" method="post"  onkeyup="keyLogin(event)">
	    	<table>
	    		<tr>
	    			<td class="login_user"><input type="text" name="loginName" style="width:500px;"></input></td>
	    		</tr>
	    		<tr>
	    			
	    			<td class="login_lock"><input type="password" name="password" style="width:500px"></input></td>
	    		</tr>
	    	</table>
	    </form>
	     -->
	    </div>
	    <!-- 
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" style="width:180px; background: #00c8f8; color:white;" onclick="submitForm()">登录</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a> 
	    </div>
	     -->
	</div>
	<script>
		function submitForm(){
			$('#loginForm').submit();
		}
		function clearForm(){
			$('#loginForm').form('clear');
		}
		//默认回车登录
		function keyLogin(event)
		{
		  if (event.keyCode == 13)
		  {
		
			  $('#loginForm').submit();
		  }
		}
	</script>
</body>
</html>