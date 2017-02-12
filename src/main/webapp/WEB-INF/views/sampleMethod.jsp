<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Common method here for implementation</title>
</head>
<body>

 <!-- Spring Security check login and roll -->
 
 <sec:authorize var="loggedIn" access="isAuthenticated()" />
	<c:choose>
	    <c:when test="${loggedIn}">
	        You are loged in
	    </c:when>
	    <c:otherwise>
	        You are logged out
	    </c:otherwise>
	</c:choose>
 <!-- Spring Security check login and roll -->

</body>
</html>