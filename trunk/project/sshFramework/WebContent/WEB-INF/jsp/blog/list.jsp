<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>博客列表</title>
</head>
<body>
<table width="600px">
	<tr>
		<th>id</th>
		<th>title</th>
		<th>description</th>
		<th>adTime</th>
	</tr>
	<c:forEach items="${blogList}" var="blog">
		<tr>
			<td>${blog.id}</td>
			<td>${blog.title}</td>
			<td>${blog.description}</td>
			<td>${blog.adTime}</td>
		</tr>
	</c:forEach>
</table>
<form action="/blog!doAdd" method="post">
	<table>
		<tr>
			<td>title</td>
			<td><input name="title"/></td>
		</tr>
		<tr>
			<td>description</td>
			<td>
				<textarea rows="10" cols="30" name="description"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="保存"/></td>
		</tr>
	</table>
</form>
</body>
</html>