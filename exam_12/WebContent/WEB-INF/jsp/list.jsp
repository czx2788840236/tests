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
	/*  session的曲芷范围 就是 一次请求之内 都可以取到 */
	
	function fun1(){
		
		var userName = $("[name='userName']").val();
		if(userName == null || userName == ''){
			alert("您还没有登录请登录");
			location="${pageContext.request.contextPath }/index.jsp";			
			
		}else{
			/*  这里就是添加购物车 
				就是添加中建表 添加 用户id 与 数组对应关系
			*/
			var str = "";
			alert("添加购物车,您的用户名是");
			$("[name='goodsIds']:checked").each(function(){
			  	str +=  ","+  this.value ;
			})
			str = str.substring(1);
			
			 var userId =	$("[name='userId']").val();
			alert(userId);
			alert(str);
			
			$.ajax({
				
				url:"${pageContext.request.contextPath }/insertGoods",
				data:{"userId":userId,"str":str},
				type:"post",
				dataType:"json",
				success:function(data){
					if(data){
						alert("添加成功");
						location="${pageContext.request.contextPath }/list";
					}else{
						alert("添加失败");
					}
					
				}
			})
			
		}
		
	}
	
	/*  查看购物车  
		这里要做的 就是
		关联查询 根据 用户id 和 数据 然后 显示出来
	*/
	function fun2(){
		var userId =  $("[name='userId']").val();
		location = "${pageContext.request.contextPath }/lookUser?userId="+userId;
	}
	
	
	
</script>
</head>
<body>
	
	${list }
	<br>
	用户名 ${user.userName }        用户余额  ${user.userMoney }
	<table>
		<tr>
			<td colspan="11" >
					<form  action="${pageContext.request.contextPath }/list"  method="post" >
						根据3个查询<input  type="text" name="goodsName" >
						<input type="submit" value="查询"  >
					</form>
					
					<input type="button" value="加入购物车"  onclick="fun1()"    > 
					<input type="button" value="查询购物车"    onclick="fun2()"  > 
					
					<input type="hidden" value="${user.userName }"  name="userName"  >
					<input type="hidden" value="${user.userMoney }"  name="userMoney" >
					<input type="text" value="${user.userId }"  name="userId" >
					
			</td>
		</tr>
		<tr>
			<td>商品id</td>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>中文品牌</td>
			<td>英文品牌</td>
			<td>价格</td>
			<td>销量</td>
			<td>库存</td>
		</tr>
		
		<c:forEach items="${list }" var="h"  >
			
			<tr>
				<td>${h.goodsId }
					<input  type="checkbox" value="${h.goodsId }"  name="goodsIds" >
				</td>
				<td>${h.goodsCode }</td>
				<td>${h.goodsName }</td>
				<td>${h.goodsLogoCn }</td>
				<td>${h.goodsLogoEn }</td>
				<td>${h.goodsPrice }</td>
				<td>${h.goodsSales }</td>
				<td>${h.goodsStock }</td>
			</tr>
			
		</c:forEach>
		
		
	</table>
	
	
	

</body>
</html>