<%@ page language="java" contentType="text/html"%>

<%@include file="Header.jsp" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<br> <br>

<form action="<c:url value="/addToCart/${product.productID}" />" >
<table class="table-bordered"> 
 <tr>
   <td rowspan="8"> 
   <img src="<c:url value="/resources/images/${product.productID}.jpg" />" style="max-height:250px;min-height:250px;" alt = "Generic placeholder thumbnail"/>
   </td>
   <td> Product Id </td>
   <td> ${product.productID}</td>
 </tr>
 
 <tr>
   <td> Product Name </td>
   <td> ${product.productName}</td>
 </tr>
 
 <tr>
   <td> Price </td>
   <td> INR ${product.price}/-</td>
 </tr>
 
 <tr>
   <td> Stock </td>
   <td> ${product.stock}</td>
 </tr>
 
  <tr>
   <td> Category Id </td>
   <td> ${product.categoryId}</td>
 </tr>
 
  <tr>
   <td> Supplier </td>
   <td> ${product.supplierId}</td>
 </tr>
 
  <tr>
   <td> Description </td>
   <td> ${product.productDesc}</td>
 </tr>
 <tr>
 <select>
 <td>
 Quantity<select name="quantity">
 <option value="1">1</option>
 <option value="2">2</option>
 <option value="3">3</option>
 <option value="4">4</option>
 <option value="5">5</option>
 <option value="6">6</option>
 
 
 
 
 
 </td></select>
 </tr>
<tr>
  
   <td> <input type="submit" value ="Add To Cart" class="btn btn-success"> </td>
 </tr>
 
</table>
 </form>