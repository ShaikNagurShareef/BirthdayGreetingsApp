<%@ page language="java" contentType="text/html charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
		<style>
			body {font-family: Arial, Helvetica, sans-serif;}
			* {box-sizing: border-box;}
			.input-container {
			    display: -ms-flexbox; /* IE10 */
			    display: flex;
			    width: 100%;
			    margin-bottom: 15px;
			}
			.Gen {
			    display: -ms-flexbox; /* IE10 */
			    display: flex;
			    width: 5%;
			    margin-bottom: 15px;
			}
			.icon {
			    padding: 10px;
			    background: #ff99ff;
			    color: white;
			    min-width: 50px;
			    text-align: center;
			}
			.input-field {
			    width: 85%;
			    padding: 10px;
			    outline: none;
			}
			.input-field1 {
			    width: 30%;
			    padding: 10px;
			    outline: none;
			}
			.input-field2 {
			    width: 53%;
			    padding: 10px;
			    outline: none;
			}
			.input-field:focus {
			    border: 2px solid #07FB46;
			}
			/* Set a style for the submit button */
			.btn {
			    background-color:#DDDFDA;
			    color: black;
			    padding: 15px 20px;
			    border: none;
			    cursor: pointer;
			    width: 30%;
			    opacity: 1;
				font-family: TimesNewRoman;
				font-size:17px;
			}
			.btn:hover {
			    opacity: 5;
			}
		</style>
		<script type="text/javascript">
		    function validate_form() {
	            if (!(/^\d{10}$/).test(document.Registratoin.Ph_No.value)) {
	                alert("You have entered an invalid Mobile Number")
	                return (false)
	        	}
	        	alert("Sucessfully Submitted");
		    }
		    function isNumberKey(evt) {
	            var charCode = (evt.which) ? evt.which : event.keyCode;
	            if (charCode != 46 && charCode > 31 &&
	                (charCode < 48 || charCode > 57)) {
	                alert("Enter Number");
	                return false;
	            }
	            return true;
		    }
		</script>
	</head>
	<body bgcolor="99ff33">
		<form name="Registratoin" method="post" action="/student" style="max-width:500px;margin:auto" onsubmit="return validate_form();">
			<center><h1><font color='red' face='TimesNewRoman'><i>Student Registration Form</i></font></h1></center>
			<marquee>Please Complete the below Registration Form</marquee>
			<br><br>
			<div style="background-color:#ff99ff; color:black">
			<div style="border:2px blue;background-color:#ff99ff">
			<br>
			<center><h1><font color='black' face='TimesNewRoman'>Registration Form</font></h1></center>
			<hr>
			</div>
			<div class="input-container">
				<i class="fa fa-user icon"></i>
				<input class="input-field" type="text" placeholder="Enter Your Name" name="studentName" value="" required/>
			</div>
			<div class="input-container">
				<i class="fa fa-address-card icon"></i>
				<input class="input-field" type="text" placeholder="Enter Your Registration Number" name="studentId" value="" required/>
			</div>
			<div class="input-container">
				<i class="fa fa-file-o icon"></i>
			<select name="studentBranch" class="input-field1" required>
				<option value="">Select</option>
				<option value="Agriculture">Agriculture</option>
				<option value="Automobile">Automobile</option>
				<option value="BioTechnology">BioTechnology</option>
				<option value="Chemical">Chemical</option>
				<option value="Civil">Civil</option>
				<option value="CSE">CSE</option>
				<option value="ECE">ECE</option>
				<option value="EEE">EEE</option>
				<option value="IT">IT</option>
				<option value="Mechanical">Mechanical</option>
				<option value="MBA">MBA</option>
				<option value="MCA">MCA</option>
			</select>
		    <i class="fa fa- file"></i>
		    <b>&nbsp&nbsp&nbsp&nbsp<font color='black' face='TimesNewRoman' size="4">Gender:</font></b>&nbsp&nbsp
			<input type="radio" name="studentGender" value="Male" class="Gen" required><font size="3">Male</font>
			<input type="radio" name="studentGender" value="Female" class="Gen" required><font size="3">Female</font>
			</div>
			<div class="input-container">
				<i class="fa fa-phone icon"></i>
				<input class="input-field" type="text" placeholder="Enter Your Mobile Number" name="studentPhoneNumber" value="" required/>
			</div>
			<div class="input-container">
				<i class="fa fa-envelope icon"></i>
				<input class="input-field" type="email" placeholder="Enter Your Email" name="studentEmail" value="" required/>
			</div>
				<font color='black' face='TimesNewRoman' size="4"><b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSelect your Date of Birth:</b></font><br>
			<div class="input-container">
				<i class="fa fa-calendar icon"></i>
				<input class="input-field" type="date" placeholder="Date of Birth" name="studentDOB" value="" required/>
			</div>
			<center> <br> <input type="submit" value="Submit" class="btn"/> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="reset" value="Reset" class="btn"/> </center> <br> <br>
			</div>
		</form>
	</body>
</html>