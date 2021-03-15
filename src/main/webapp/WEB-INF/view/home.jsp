<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>

<html>
<head>
	<meta charset="BIG5">
	<title>Home</title>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/home.css" />
</head>
<body>
	<div>
		<form action="/ProductCatalog/redirect" method="GET">
			<input type="submit" value="get to the catalog">
		</form>
	</div>
</body>
</html>