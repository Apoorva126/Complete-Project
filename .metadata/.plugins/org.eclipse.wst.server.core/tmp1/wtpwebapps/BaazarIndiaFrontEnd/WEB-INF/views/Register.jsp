<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp"%>
    
<html>
<head>
<title>Signup</title>

</head>
<body>
<center>
<h1>
<b>
<u style="background-color: red;">
REGISTRATION FORM
</u>
</b>
</h1>
<form style="background-color: skyblue;">
<table>
<tr><td>Name </td> <td>:<input type="text" placeholder="please enter Name"/></td></tr>
<tr><td>Age </td> <td>:<input type="number" placeholder="please enter your age"/></td></tr>
<tr><td>Password   </td> <td>:<input type="password" placeholder="please enter password"></td></tr>
<tr><td>Confirm Password   </td> <td>:<input type="password" placeholder="please re-enter password"></td></tr>
</table>
<button type="submit" form="form1" value="Submit">Register</button>


</form>
</center>


</body>
</html>