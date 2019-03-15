<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>List Customers</title>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>
	
	
	<div id="wrapper">
		<div id="header">
		
		<h2>Customer Relationship Manager</h2>
		
		</div>
		<div id="container">
			<div id="content">
			<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;" class="add-button">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
					
				</tr>
			
				<c:forEach var="customer" items="${customers}">
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${customer.id}"></c:param>
				</c:url>
				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${customer.id}"></c:param>
				</c:url>
				<tr>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					<td>${customer.email}</td>
					<td><a href="${updateLink}">Update</a> | <a href="${deleteLink}" onclick="if(!(confirm('Are you sure want to delete?'))) return false;">Delete</a></td>
					
				</tr>
				</c:forEach>
			
			</table>
			
			
			
			</div>
		
		
		
		</div>
	</div>





</body>
</html>