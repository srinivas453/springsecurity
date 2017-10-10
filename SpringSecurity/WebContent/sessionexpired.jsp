<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:loginPageTemplate browserpagetitle="Session Expired">

		<div class="jumbotron">
			<h1>Session Expired</h1>
			<p>
				Your session has been timed out due to inactivity. You may return to the <a href='<c:url  value="login"/>'>application</a>
			</p>
		</div>

</t:loginPageTemplate>