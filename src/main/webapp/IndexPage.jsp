<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Legion Bank-Cash Back Offer</title>
</head>
<body>
<h1>Enter your Login Details</h1>
<form method="post" action="CashBackOffer">
<center><table>
<table border="3">
<tr>
<td><b>Customer Id:</b></td>
<td> <input id="customerId" name="customerId" type="text" pattern="[a-zA-Z0-9]{7}" title="7 character alpha numeric" placeholder="Enter Pan Number" required  ></td>
</tr>
<tr>
<tr>
<td><b>Password:</b></td>
<td> <input id="password" name="password" type="password"  required  ></td>
</tr>
<tr>
<td colspan="2"><center><button id="submit" name="submit" type="submit" >Login</button></center></td></tr>
</table></center>
</form>
</body>
</html>