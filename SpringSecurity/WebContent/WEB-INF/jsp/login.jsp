<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:loginPageTemplate browserpagetitle="Login">

	<div class="row col-md-4 col-md-offset-4">
		<div class="panel panel-default">
			<div class="panel-heading">
				<strong class="">Login</strong>
			</div>
			<div class="panel-body">
				<c:if test="${not empty msg}">
					<div class="alert alert-${error ? 'danger' : 'info'} alert-sm" 	role="alert">
						<span class="glyphicon glyphicon-${error ? 'exclamation' : 'info'}-sign"></span>
						&nbsp;${msg}
					</div>
				</c:if>
				<form:form action="login" method="POST" class="form-horizontal" role="form">
					<div class="form-group">
						<label for="userName" class="col-sm-4 control-label">User Name</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="userName" name="userName"
								placeholder="User Name" required/>
						</div>
					</div>
					<div class="form-group">
						<label for="password" class="col-sm-4 control-label">Password</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="password" name="password"
								placeholder="Password" required/>
						</div>
					</div>
					<div class="form-check">
						<div class="offset-md-4 form-check-label">
							<input type="checkbox" class="form-check-input" id="rememberMe" name="rememberMe"/>
							Remember Me
						</div>
					</div>
					<div class="form-group last">
						<div class="col-sm-offset-3 col-sm-9">
							<button type="submit" class="btn btn-primary btn-sm pull-right">Sign in</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>

</t:loginPageTemplate>