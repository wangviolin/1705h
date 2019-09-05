<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index2.css"/>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
</head>
<body>
<table>
	<tr>
		<td>商品名称</td>
		<td>商品价格</td>
		<td>商品分类名称</td>
		<td>商品品牌名称</td>
		<td>
			<a href="add.jsp">
				<input type="button" value="添加">
			</a>
		</td>
	</tr>
	<c:forEach items="${list}" var="g">
		<tr>
			<td>${g.gname}</td>
			<td>${g.price}</td>
			<td>${g.cname}</td>
			<td>${g.bname}</td>
			<td>
				<a href="update.jsp?gid=${g.gid}">
					<input type="button" value="修改">
				</a>
				<input type="button" value="删除">
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>