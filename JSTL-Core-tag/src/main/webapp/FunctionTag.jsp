<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Function tag Example</h1>
	<hr>

	<c:set var="FunctionTagPage" value="Welcom to my  tag page"></c:set>
	<c:if test="${fn:contains(FunctionTagPage,'tag page')}">
		<h4>found tag page</h4>
	</c:if>
	<hr>


	<c:if test="${fn:contains(FunctionTagPage,'tagcore')}">
		<h4>found tagcore</h4>
	</c:if>


	<c:if test="${fn:containsIgnoreCase(FunctionTagPage,'TAG PAGE')}">
		<h4>found TAG PAGE</h4>
	</c:if>
	<hr>

	<c:if test="${fn:endsWith(FunctionTagPage,'page')}">
		<h4>Right it is endswith page</h4>
	</c:if>










</body>
</html>