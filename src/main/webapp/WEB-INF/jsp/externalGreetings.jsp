<%@ page language="java" contentType="text/html charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>External Greetings</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<style>
	        body {font-family: TimesNewRoman, Arial, Helvetica, sans-serif;}
	        * {box-sizing: border-box;}
	        .input-container {
	            display: -ms-flexbox; /* IE10 */
	            display: flex;
	            width: 100%;
	            margin-bottom: 15px;
	        }
	        .input-field {
	            width: 85%;
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
	            width: 80%;
	            opacity: 1;
	            font-family: TimesNewRoman;
				font-size:17px;
	        }
	        .btn:hover {
	            opacity: 1;
	
	        }
		</style>
	</head>
	<body bgcolor="99ff33">
        <center><h1><font color='red' face='TimesNewRoman'><i>Send Wishes to Your External Friends from here behalf of You</i></font></h1></center>
        <form name="Registratoin" method="post" action="/friend" style="max-width:500px;margin:auto">
		<center>	
            <div class="input-container" style="background-color:#ff99ff">
                    <table style="text-align:left">
                        <tr>
                            <td colspan="3">
                                <br>
                            </td>
                        </tr>
                        <tr>
                            <th colspan="3" style="text-align:center">
                                <font face='TimesNewRoman'><h2>Complete the Following Details</h2></font>
                            </th>
                        </tr>
                        <tr>
                            <td colspan="3"><hr></td>
                        </tr>
                        <tr>
                            <td colspan="3">
                                <br>
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Name:</td>
                            <td><input type="text" name="friendName" placeholder="Enter Your Friend Name" class="input-field" required/></td>
                        </tr>
                        <tr>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Ph.Number:</td>
                            <td><input type="number" name="friendPhoneNumber" required class="input-field" placeholder="Enter Your Friend Mobile Nuber"/></td>
                        </tr>
                        <tr>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Email:</td>
                            <td><input type="email" name="friendEmail" placeholder="Enter Your Friend Email Address" class="input-field" required/></td>
                        </tr>
                        <tr>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Subject:</td>
                            <td><input type="text" name="friendMailSubject" placeholder="Eg:Birthday Wishes" class="input-field" required/></td>
                        </tr>
                        <tr>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Message:</td>
                            <td><textarea rows="8" cols="45" name="friendMailMessage" placeholder="Eg:Many More Happy returns of the day" class="input-field" required></textarea></td>
                        </tr>
                        <tr>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Your Name:</td>
                            <td><input type="text" name="friendRefereeName" placeholder="Enter Your Name" class="input-field" required/></td>
                        </tr>
                        <tr>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Your Email:</td>
                            <td><input type="text" name="friendRefereeEmail" placeholder="Enter Your Email" class="input-field" required/></td>
                        </tr>
                        <tr></tr>
                        <tr></tr>
                        <tr>
                            <td colspan="3" style="text-align:center">
                                <button class="btn">Send Wishes</button>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3">
                                <br>
                            </td>
                        </tr>
                        </table>
            </div> 
		</center>
        </form>
    </body>
</html>