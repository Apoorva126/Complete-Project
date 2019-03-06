<%@page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>


<div class="container">
<form action="<c:url value='Receipt'/>"method="post">

<table class="table table-bordered" width="50%" align="center">
<tr class="success">
<td colspan="2"><center>Payment Detail</center></td>
</tr>
<tr class="info">
<td colspan="2"><center>
    <input type="radio" name="Pmode" value="CC">Credit Card
     <input type="radio" name="Pmode" value="COD">Cash on Delivery
   </center>  </td>
     </tr>
     <tr class="warning">
     <td>Card Number</td>
     <td><input type="text" name="cardno"></td>
     </tr>
      
      <tr class="warning">
     <td>Valid<input type="text" name="Valid"/></td>
     <td>CVV<input type="text" name="CVV"/></td>
     </tr>
     
      <tr class="success">
     <td>Name </td>
     <td><input type="text" name="name"></td>
     </tr>
      <tr class="success">
     <td colspan="2"><center><input type="Submit" value="Pay" class="btn btn-success"/></center></td>
     </tr>
     
     </table>
    </form>
     