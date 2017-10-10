<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%-- Supports three types of alerts: warning/error/info --%>
		<div class="alert alert-${param.noticeType eq 'warning' ? 'warning' : (param.noticeType eq 'error' ? 'danger' : 'info' )}">
		<div class="glyphicon glyphicon-${param.noticeType eq 'warning' ? 'warning' : (param.noticeType eq 'error' ? 'exclamation' : 'info' )}-sign"></div>
				${param.noticeMessage}
		</div>