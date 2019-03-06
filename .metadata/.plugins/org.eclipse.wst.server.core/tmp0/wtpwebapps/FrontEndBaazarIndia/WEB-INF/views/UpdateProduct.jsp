<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>
<body>
<form action ="<c:url value='/UpdateProduct'/>" method="post">
<table align="center" class="table">
<tr>
<td colspan="2">
<center><h3>Product</h3></center>
</td>
<tr>
<td>Product Id</td>
<td><input type="text" name="catId" value=${product.productID} readonly/></td>
</tr>


<tr>
<td>Product Name</td>
<td><input type="text" name="catName" value=${product.productName}/></td>
</tr>
<tr>
<td>Product Desc </td>
<td><input type="text" name="catDesc" value=${product.productDesc}/></td>
</tr>
<tr>

<td colspan="2">
<center><input type="submit" value="Update Product"/></center>
</td> 
</tr>
</table>
</form>