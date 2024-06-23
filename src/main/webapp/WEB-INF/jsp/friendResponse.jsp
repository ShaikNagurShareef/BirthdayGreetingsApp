<%@ page language="java" contentType="text/html charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Registration Response</title>
		
		<style>
			table, th, td {
			  border: 1px solid white;
			  border-collapse: collapse;
			}
			th, td {
			  padding-top: 10px;
			  padding-bottom: 10px;
			  padding-left: 30px;
			  padding-right: 30px;
			}
		</style>
		
	</head>
	<body bgcolor="99ff33">
	<br><br>
	<center><h1> Friend Registration is ${status} </h1></center>
	<br>
	<center><h3> <font color='red' face='TimesNewRoman'> ${message} </font> </h3></center>
	<br>
	
	<table align=center>
		<tr>
			<th> Name: </th>
			<td> ${name} </td>
		</tr>
		
		<tr>
			<th> Phone: </th>
			<td> ${phone} </td>
		</tr>
		
		<tr>
			<th> email: </th>
			<td> ${email} </td>
		</tr>
		
		<tr>
			<th> Subject: </th>
			<td> ${esubject} </td>
		</tr>
		
		<tr>
			<th> Message: </th>
			<td> ${emessage} </td>
		</tr>
		
		<tr>
			<th> Your Name: </th>
			<td>${fname} </td>
		</tr>
		
		<tr>
			<th> Your Email: </th>
			<td>${femail} </td>
		</tr>
			
	</table>
	
	<br>
	<center><h3> <font color='blue' face='TimesNewRoman'> Thank You for Registering your friend...<br>Greetings will be sent in 5 Minuits... </font> </h3></center>
	<br>
	
	</body>
</html>