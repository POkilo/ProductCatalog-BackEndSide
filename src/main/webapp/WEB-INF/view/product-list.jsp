<!-- directive attribute -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Products</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Catalog</h2>
			
		
		</div>
	</div>
	
	<div id="container">
		<c:url var="updateLink" value="/catalog/update-product-form">
			<c:param name="productId" value="${tempProduct.id}" />
		</c:url>	
		<a href="add-product-form" class="add-button">Add Product</a>
		<div id="content">
		
			<!-- 
			<input type="button" value="Add Student"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
			<!--  add our html table here -->
			
			<!-- @@@@@@loop of product in each category -->
			<c:forEach var="tempCategory" items="${byCategories}">
		
			
			<table>
				<tr>
					<td> ${tempCategory.get(0).category.name.toUpperCase()} </td>
					<td><a href='add-product-form' class="add-button">Add Product ${tempCategory.get(0).category.name}</a></td>
				</tr>
			
				<tr>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Discount Percent</th>
					<th>Current Price</th>
				</tr>
				
				<!-- loop over and print our customers -->
				
					<!-- @@@@@@loop of product in each category -->
					<c:forEach var="tempProduct" items="${tempCategory}">
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/catalog/update-product-form">
						<c:param name="productId" value="${tempProduct.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/catalog/delete-product">
						<c:param name="productId" value="${tempProduct.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempProduct.name} </td>
						<td> ${tempProduct.description} </td>
						<td> ${tempProduct.price} </td>
						<td> ${tempProduct.discountPercent} </td>
						<td> ${tempProduct.currentPrice} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a>
						</td>
						
					</tr>
					</c:forEach>
			
				
				</c:forEach>
			
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









