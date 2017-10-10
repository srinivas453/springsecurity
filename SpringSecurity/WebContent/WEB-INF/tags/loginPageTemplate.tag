<%@ tag description="No Session Page template" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="browserpagetitle" required="true"%>

<html>
	<head>
		<title>${browserpagetitle}</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		
		<link rel="stylesheet" type="text/css" href="<c:url value='resources/css/jquery-ui.css'/>"/>
		<link rel="stylesheet" type="text/css" href="<c:url value='resources/css/bootstrap.css'/>"/>
		<link rel="stylesheet" type="text/css" href="<c:url value='resources/css/application.css'/>"/>
		<link rel="icon" type="image/png" sizes="96x96" href="<c:url value='/resources/images/logo.png'/>"/>
		
		<script src="<c:url value='resources/js/jquery.min.js'/>"></script>
		<script src="<c:url value='resources/js/jquery-ui.js'/>"></script>
		
		<script type="text/javascript">
			// Change JQueryUI plugin names to fix name collision with Bootstrap.
			$.widget.bridge('uitooltip', $.ui.tooltip);
			$.widget.bridge('uibutton', $.ui.button);
		</script>
		
		<script src="<c:url value='resources/js/bootstrap.min.js'/>"></script>
	</head>
	<body>
		<div id="pageheader">
			<div class="navbar navbar-inverse">
				<div class="navbar-header">
					<img src= "<c:url value='resources/images/logo.png'/>" class="navbar-brand" />		
				</div>
				<div class="header-border"></div>
			</div>
		</div>
		
		<div id="body" class="container base-container">
			<jsp:doBody />
		</div>
		
		<div id="pagefooter"></div>
	</body>
</html>