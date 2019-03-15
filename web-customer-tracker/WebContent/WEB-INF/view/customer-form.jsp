<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/add-customer-style.css">
</head>
<body>
		<div id="wrapper">
		<div id="header">
		
		<h2>Save Customer</h2>
		
		</div>
		<div id="container">
			<div id="content">
			
			<form:form action="processForm" modelAttribute="customer" method="POST">
			
			<form:hidden path="id"/>
		<table>
		<tr>
			<td>First Name</td>
			<td><form:input path="firstName"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><form:input path="lastName"/></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" class="save"/></td>
		</tr>
	
		</table>
		
		</form:form>
			
			
			
			<p>
			<a href="${pageContext.request.contextPath}">Back to List</a>
			
			</p>
			</div>
		
		
		
		</div>
	</div>

		
		
		
		
		
		
		
</body>
</html>