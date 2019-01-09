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

	function toLogin(){
		
		$.ajax({
			url:"${pageContext.request.contextPath }/toLogin",
			data:$("#form").serialize(),
			type:"post",
			dataType:"json",
			success:function(data){
				if(data){
					location="${pageContext.request.contextPath }/list";
				}else{
					alert("登录失败请重新登录")
				}
			}
		})
	}
	
	function zhuche(){
		/*  去添加 用户 表 
		就是添加 用户表的 所有字段
		*/
		location = "${pageContext.request.contextPath }/zhuche";
			
	}
	
</script>
</head>
<body>
		index 》 ============
		<a href="${pageContext.request.contextPath }/order/list" >1111</a>
		
		<center>
			
			<h1>登录页面</h1>
			
			<form  id="form" >
				
				<table>
					<tr>
						<td>
							账号：<input type="text" name="userName" >
						</td>
					</tr>
					
					<tr>
						<td>
							密码：<input type="text" name="userPwd" >
						</td>
					</tr>
					<tr>
						<td>
							<input type="button" value="登录"  onclick="toLogin()" >
							<input type="button" value="注册"  onclick="zhuche()"  >
							<a href="${pageContext.request.contextPath }/list" >
							<input type="button" value="没有账号=直接进入"  >
							</a>
						</td>
					</tr>
					
					
				</table>
				
				
			</form>
			
			
			
		</center>
		
		
</body>
</html>