<%@ page language="java" contentType="text/html" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@include file="Header.jsp" %>



<form:form action="InsertProduct" modelAttribute="product" method="post" enctype="multipart/form-data">  
<table align="center" class="table-bordered">
  
  <tr>
    <td colspan="2"> <center>Product Info </center> </td>
  </tr>
  
  <tr>
    <td> Product Name </td>
    <td> <form:input path="productName"/></td>
  </tr>
   
  <tr>
    <td> Price </td>
    <td> <form:input path="price"/></td>
  </tr>
  
  <tr>
    <td> Stock </td>
    <td> <form:input path="stock"/></td>
  </tr>
  
  
  
  <tr>
     <td> Supplier </td>
     <td> <form:input path="supplierId" /> </td>
  </tr>
  
  <tr>
     <td> Product Description </td>
     <td> <form:input path="productDesc" /> </td>
  </tr>
  
  
  
  <tr>
     <td colspan="2"> <center><input type="submit" value="InsertProduct" /> </center> </td>
  </tr>
     
</table>
</form:form>

<table class="table-bordered">
    <tr>
      <td> Product Id &nbsp</td>
      <td> Product Name &nbsp</td>
      <td> Price &nbsp</td>
      <td> Stock &nbsp</td>
      <td> Supplier &nbsp</td>
      <td> Operations </td>
    </tr>
    
   <c:forEach items = "${productList}" var="product" >
     <tr>
       <td> <center> ${product.productID}  </center> </td>
       <td> <center>  ${product.productName} </center> </td>
       <td>  <center> ${product.price} </center> </td>
       <td>  <center> ${product.stock} </center> </td>
       <td>  <center> ${product.supplierId} </center> </td>
       
       <td> <a href="<c:url value='/editProduct/${product.productID}'/>" class="btn btn-success"> EDIT </a> /
       <td> <a href="<c:url value='/deleteProduct/${product.productID}'/>" class="btn btn-danger"> DELETE </a> </td>
     </tr>
   </c:forEach>
</table> 
</body>
</html>