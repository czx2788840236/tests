<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 判断是否为第一页 -->
			<c:if test="${page.isFirstPage==true}">
				<input type="button" value="上一页" disabled="disabled">
			</c:if>
			<c:if test="${page.isFirstPage!=true}">
				<input type="button" value="上一页" onclick="jumpPage('${page.prePage}')">
			</c:if>
			<c:if test="${page.isLastPage==true}">
				<input type="button" value="下一页" disabled="disabled">
			</c:if>
			<c:if test="${page.isLastPage!=true}">
				<input type="button" value="下一页" onclick="jumpPage('${page.nextPage}')">
			</c:if>
			<c:forEach items="${page.navigatepageNums }" var="navigatepageNum">
				<input type="button" value="${navigatepageNum }" onclick="jumpPage('${navigatepageNum}')">
			</c:forEach>
			<input type="button" value="首页" onclick="jumpPage('${page.navigateFirstPage}')">
			<input type="button" value="末页" onclick="jumpPage('${page.navigateLastPage}')">
			当前是第${page.pageNum }页&nbsp;一共有${page.total }条数据&nbsp;一共有${page.pages }页
</body>
</html>