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
	<center><h1> Your Registration is ${status} </h1></center>
	<br>
	<center><h3> <font color='red' face='TimesNewRoman'> ${message} </font> </h3></center>
	<br>
	
	<table align=center>
		<tr>
			<th> Id: </th>
			<td> ${id} </td>
		</tr>
		
		<tr>
			<th> Name: </th>
			<td> ${name} </td>
		</tr>
		
		<tr>
			<th> Branch: </th>
			<td> ${branch} </td>
		</tr>
		
		<tr>
			<th> Gender: </th>
			<td> ${gender} </td>
		</tr>
		
		<tr>
			<th> Phone: </th>
			<td> ${phone} </td>
		</tr>
		
		<tr>
			<th> Email: </th>
			<td>${email} </td>
		</tr>
		
		<tr>
			<th> DOB: </th>
			<td>${dob} </td>
		</tr>
			
	</table>
	
	</body>
</html>