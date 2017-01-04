<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sign in Login</title>
        <link href="<c:url value='/resources/css/login.css' />" rel="stylesheet"></link>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
        <script type="text/javascript" src="<c:url value='/resources/js/funtions/login.js' />"></script>
    </head>
 
    <body>
		<div class="login-page">
			<div class="form">
		      <font color="red">
				<span style="align: center">
					<c:if test="${not empty param['error']}"> 
					    <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" /> 
					</c:if>
				</span>
		      </font>
			  <form class="register-form" id="registerForm" action="#" method="post">
			    <input type="text" placeholder="name" id="username" autocomplete="off"/>
			    <input type="password" placeholder="password" id="password"/>
			    <input type="email" placeholder="email address" id="email" autocomplete="off"/>
			    <input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
			    <button>create</button>
			    <p class="message">Already registered? <a href="#" onclick="toggle_visibility(); return false;" class="message">Sign In</a></p>
			    </form>
			    <form class="login-form" action="<c:url value='/login' />" method="post">
			      <input type="text" name="username" placeholder="username" autocomplete="off"/>
			      <input type="password" name="password" placeholder="password"/>
			      <input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />
			      <button>login</button>
			      <p class="message">Not registered? <a href="#" onclick="toggle_visibility(); return false;" class="message">Create an account</a></p>
			    </form>
			</div>
		</div>
 
    </body>
</html>