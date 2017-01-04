<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	
	
	<jsp:body>
	
	<h1>welcome <c:out value="${user.username}"></c:out>, </h1>
	<p>This is sample project Spring MVC Spring security and  Hibernate for mysql connectivity</p>
	<p><b>note :</b> after run this project make changes db.propersie file hibernate.hnb2ddl.auto property create to update
	otherwise every time database drop and create data will be lost
	</p>
	<p>This is an open source project</p>
	
	</jsp:body>
</t:dashboard>
</html>