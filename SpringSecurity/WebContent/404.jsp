<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:generalPageTemplate browserpagetitle="Page Not Found">

		<jsp:include page="notice.jsp">
			<jsp:param name="noticeRender" value="true" />
			<jsp:param name="noticeType" value="error" />
			<jsp:param name="noticeMessage"
				value="The page you requested was not found. If you believe this to be an error, report this issue to the support team." />
		</jsp:include>

</t:generalPageTemplate>