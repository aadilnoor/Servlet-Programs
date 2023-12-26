<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL CORE TAGS EXAMPLE</h1>
	<c:out value="KHAN AADIL"></c:out>

	<c:import url="navbar.jsp" var="data"></c:import>
	<!-- import tag is use to one resourse to another resourse using -->
	<h1>
		<c:out value="${ data}"></c:out>
	</h1>

	<!-- Set tag is use to variable Set -->
	<c:set var="result" value="${300*2}" scope="session"></c:set>
	Before :
	<c:out value="${ result}"></c:out>
	<c:remove var="result" />
	After :
	<c:out value="${ result}"></c:out>


	<c:catch var="exception">
		<%
		String name = null;
		name.toUpperCase();
		%>
	</c:catch>

	<c:if test="${exception!=null }">
		<p>${exception}</p>
		<p>${exception.message}</p>
	</c:if>
	<c:set value="${17 }" var="age"></c:set>

	<c:choose>
		<c:when test="${age>10 }">
			<h1>Adult</h1>
		</c:when>

		<c:when test="${age<10 }">
			<h1>child</h1>
		</c:when>

		<c:otherwise>
			<h1>Invalid age</h1>
		</c:otherwise>
	</c:choose>

	<c:forEach var="num" begin="1" end="10">
		<c:out value="${num }"></c:out>
	</c:forEach>
	<p>

		<c:forTokens items="AADIL-NOOR-BCA-STUDENT" delims="-" var="newString">
			<c:out value="${newString }"></c:out><p>
		</c:forTokens>

		<c:url value="/index.jsp" var="pageUrl">
			<c:param name="email" value="demo@gmail.com"></c:param>
			<c:param name="pass" value="demo123"></c:param>
		</c:url>
		${pageUrl}

		<%-- <c:redirect url = "http://www.google.com"></c:redirect> --%>
</body>
</html>