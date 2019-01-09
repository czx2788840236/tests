<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script  type="text/javascript" src="/exam_12/js/jquery-1.8.3.js" ></script>
<script type="text/javascript">
	
	function fun1(userId,goodsId,goodsNum){
		/* 
			这里 要做的就是  拿着两个id 去修改 中间表数据 加一
			有两种方法 一种是 用ajax 另一中是 修改液面数据 然后后台进行操作
		*/
		
		location = "${pageContext.request.contextPath}/toUpdateZhongjian?goodsId="+goodsId+"&userId="+userId+"&goodsNum="+goodsNum;
	}
	function fun2(userId,goodsId,goodsNum){
		/* 
			这里 要做的就是  拿着两个id 去修改 中间表数据 加一
			有两种方法 一种是 用ajax 另一中是 修改液面数据 然后后台进行操作
		*/
		location = "${pageContext.request.contextPath}/toUpdateZhongjia?goodsId="+goodsId+"&userId="+userId+"&goodsNum="+goodsNum;
	}
	
	/*  删除  */
	function deleteGoods(userId,goodsId){
		location = "${pageContext.request.contextPath}/deleteGoods?goodsId="+goodsId+"&userId="+userId ;
	}
	
	
</script>
</head>
<body>
	${user }
	<center>
		<h1> 
		用户名字 ==${user.userName}   
		用户编号 ==${user.userId}
		   
		<a href="javascript:history.go(-1)" >
		
			<input type="button" value="返回查看商品"  >
		</a>
		 </h1>
		
		<table cellspacing="1" border="1" >
			<tr>
				<td>用户id</td>
				<td>商品id</td>
				<td>商品名称</td>
				<td>商品品牌</td>
				<td>数量</td>
				<td>小计</td>
				<td>操作</td>
			</tr>
				
				<c:forEach items="${user.goodss }" var="h" >
					
					<tr>
						<td>${user.userId }</td>
						<td>${h.goodsId }</td>
						<td>${h.goodsName }</td>
						<td>${h.goodsLogoCn }</td>
						<td>
						<input value="-" type="button"  onclick="fun1(${user.userId },${h.goodsId },${h.goodsNum })" >
							${h.goodsNum }
						<input value="+" type="button" onclick="fun2(${user.userId },${h.goodsId },${h.goodsNum })" >
						</td>
						<td>
							${h.goodsPrice * h.goodsNum }
						</td>
						<td>
							<input type="button" value="删除商品" onclick="deleteGoods(${user.userId },${h.goodsId })"   >
						</td>
						
					</tr>
				</c:forEach>
		</table>
	
	
	
	</center>
	
</body>
</html>