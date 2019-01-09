<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/exam_12/css/index3.css" >
<script  type="text/javascript" src="/exam_12/js/jquery-1.8.3.js" ></script>
<script type="text/javascript">
	
	function fun1(){
		
		$.ajax({
			url:"${pageContext.request.contextPath}/insertUser",
			data:$("#form").serialize(),
			type:"post",
			dataType:"json",
			success:function(data){
				alert(data);
				alert("注册陈功 请都登录");
				location="${pageContext.request.contextPath}/index.jsp";
			}
		})
	}
	
	
</script>
</head>
<body>
	
	<form id="form"  >
	
	
	<table>
		<tr>
			<td>
			    用户名字	<input type="text"  name="userName" >
			</td>
		</tr>
		<tr>
			<td>
			    用户密码	<input type="text"  name="userPwd" >
			</td>
		</tr>
		<tr>
			<td>
			    用户余额	<input type="text"  name="userMoney" >
			</td>
		</tr>
		<tr>
			<td>
				<input type="button"  value="注册" onclick="fun1()"    >
			</td>
		</tr>
	</table>
	
	</form>
	
	
</body>
</html>