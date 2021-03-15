<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Product</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Product Form</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Product</h3>
	
		<form:form action="save-product" modelAttribute="product" method="POST">
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>Name:</label></td>
						<td><form:input path="name" /></td>
					</tr>
				
					<tr>
						<td><label>Description:</label></td>
						<td><form:input path="description" /></td>
					</tr>

					<tr>
						<td><label>Price:</label></td>
						<td><form:input path="price" /></td>
					</tr>
					<tr>
						<td><label>Discount Percent:</label></td>
						<td><form:input path="discountPercent" /></td>
					</tr>
					
					<tr>
						<td><label>Category:</label></td>
						<td><form:input path="categoryName" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/catalog/product-list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










