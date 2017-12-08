<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<title>Student page</title>
</head>
<body>
	<div class="container">
		<div class="row text-center">
			<h2 class="text-center">"${message}"</h2>
		</div>
		<div class="row text-center">
			<a href="${pageContext.request.contextPath}/" class="btn btn-primary"
				role="button">View students</a>
		</div>
	</div>
</body>
</html>