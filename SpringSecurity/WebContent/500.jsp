<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:generalPageTemplate browserpagetitle="Server Error">

		<jsp:include page="notice.jsp">
			<jsp:param name="noticeRender" value="true" />
			<jsp:param name="noticeType" value="error" />
			<jsp:param name="noticeMessage"
				value="An unexpected error occurred. Report this issue to the support team." />
		</jsp:include>

</t:generalPageTemplate>