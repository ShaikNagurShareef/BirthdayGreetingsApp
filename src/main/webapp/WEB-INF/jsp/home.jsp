<%@ page language="java" contentType="text/html charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>BirthdayGreetingsApp</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<style>
			/* Universal Style */
			*{
			    box-sizing: border-box;
			}
			
			/* Style the body */
			body {
			    font-family: TimesNewRoman;
			    margin: 0;
			}
			
			/* Header/logo Title */
			.header {
			    padding: 5px;
			    text-align: center;
			    background: #99ff33;
			    color: red;
			}
			
			/* Increase the font size of the heading */
			.header h1 {
			    font-size: 40px;
			}
			
			/* Style the top navigation bar */
			.navbar {
			    overflow: hidden;
			    background-color: #6600ff;
			}
			
			/* Style the navigation bar links */
			.navbar a {
			    float: left;
			    display: block;
			    color: white;
			    text-align: center;
			    padding: 14px 20px;
			    text-decoration: none;
			}
			
			/* Right-aligned link */
			.navbar a.right {
			    float: right;
			}
			
			/* Change color on hover */
			.navbar a:hover {
			    background-color: #ddd;
			    color: black;
			}
			
			/* Column container */
			.row {  
			    display: -ms-flexbox; /* IE10 */
			    display: flex;
			    -ms-flex-wrap: wrap; /* IE10 */
			    flex-wrap: wrap;
			}
			
			/* Create two unequal columns that sits next to each other */
			/* Sidebar/left column */
			.side {
			    -ms-flex: 25%; /* IE10 */
			    flex: 25%;
			    background-color: #99ff33;
			    padding: 15px;
			}
			
			/* Main column */
			.main {   
			    -ms-flex: 70%; /* IE10 */
			    flex: 70%;
			    background-color: white;
			    padding: 25px;
			}
			
			/* Fake image, just for this example */
			.fakeimg {
			    background-color: #ff99ff;
			    width: 100%;
			    padding: 20px;
			}
			
			/* Footer */
			.footer {
			    padding: 10px;
			    text-align: center;
			    background: #6600ff;
			    color: white;
			}
			
			/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
			@media screen and (max-width: 700px) {
			    .row {   
			        flex-direction: column;
			    }
			}
			
			/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
			@media screen and (max-width: 400px) {
			    .navbar a {
			        float: none;
			        width: 100%;
			    }
			}
			.dropdown {
			    float: left;
			    overflow: hidden;
			    }
			    .dropdown .dropbtn {
			        font-size: 16px;    
			        color: white;
			        padding: 14px 16px;
			        background-color: inherit;
			        font-family: inherit;
			            border:0;
			    }
			    .dropdown:hover .dropbtn {
			        background-color: #ddd;
			        color:black;
			    }
			    .dropdown-content {
			        display: none;
			        position: absolute;
			        background-color: #6600ff;
			        min-width: 110px;
			    }
			
			    .dropdown-content a {
			        float: none;
			        color: white;
			        padding: 12px 16px;
			        text-decoration: none;
			        display: block;
			        text-align: left;
			    }
			    .dropdown-content a:hover {
			        background-color: #ddd;
			    }
			
			    .dropdown:hover .dropdown-content {
			        display: block;
			    }
			
			</style>
	</head>
	<body>
	
		<div class="header">
			<img src="static/Images/logo.png" alt="<h2>VIGNAN'S Deemed to be UNIVERSITY</h2>"/>
		  	<h1>Birthday Greetings App</h1>
		</div>
		
		<div class="navbar">
		    <a href="/home" target="_self">Home</a>
		  <div class="dropdown">
		    <button class="dropbtn">Registration 
		      <i class="fa fa-caret-down"></i>
		    </button>
		    <div class="dropdown-content">
		    	<a href="studentRegistrationForm" target="main_page">Student</a>
		    	<a href="employeeRegistrationForm" target="main_page">Employee</a>
		    </div>
		  </div>
		  
		  <div class="dropdown">
		    <button class="dropbtn">Greetings 
		      <i class="fa fa-caret-down"></i>
		    </button>
		    <div class="dropdown-content">
		      	<a href="/studentGreetings" target="main_page">Student Greetings</a>
		      	<a href="/employeeGreetings" target="main_page">Employee Greetings</a>
		    	<a href="/monthlyGreetings" target="main_page">Monthly Greetings</a>
		    </div>
		  </div>
		  	<a href="externalGreetings" target="main_page">External Greetings</a>
			<a href="login" target="main_page">Send Wishes</a>
		</div>
		
		<div class="row">
		  <div class="side">
		      <center><h2>Importance of Birthday</h2></center>
		      <div class="fakeimg" style="height:230px;">First of all, I think “Happy birthday” is more appropriate for thanking your parents/primary caregivers for taking care of you since that day and so forth since it is our day of birth.
			  Something along the lines of, “Congratulations” instead of “Happy Birthday” is more appropriate and more accurately conveys what I am actually trying to say.</div>
		      <center><h3>Quotations on Birthday</h3></center>
		      <div class="fakeimg" style="height:90px;">The more you praise and celebrate your life, the more there is in life to celebrate.</div><br>
		
			  <center><img src="static/Images/Quote1.jpg" alt="Happy Bithday"/></center>
			  <br><div class="fakeimg" style="height:90px;">Age is a case of mind over matter. If you don't mind, it don't matter.</div><br>
		          <br><center><img src="static/Images/Quote2.jpg" alt="Happy Birthday"/></center><br><br>
			  <div class="fakeimg" style="height:100px;">Today you are you! That is truer than true! There is no one alive who is you-er than you!</div><br><br>
		          <br><center><img src="static/Images/Images.gif" alt="Happy Birthday"/></center>
		  </div>
		  <div class="main">
		  <iframe src="studentRegistrationForm" style="height:850px;width:100%;border:none;" name="main_page" class="main"></iframe>
		  <center><h2>Inspirational Birthday Quotes</h2></center>
		  <center><h4>***Another year older and another reason to celebrate!***<br>***Get your birthday card message with one of these inspirational birthday quotes***</h4></center><div class="fakeimg" style="height:500px;">
			<ul>
				<li>“Count your life by smiles, not tears. Count your age by friends, not years. Happy birthday!”</li>
				<li>“Happy birthday! I hope all your birthday wishes and dreams come true.”</li>
				<li>“A wish for you on your birthday, whatever you ask may you receive, whatever you seek may you find, whatever you wish may it be fulfilled on your birthday and always. Happy birthday!”</li>
				<li>“ Another adventure filled year awaits you. Welcome it by celebrating your birthday with pomp and splendor. Wishing you a very happy and fun-filled birthday!”</li>
				<li>“May the joy that you have spread in the past come back to you on this day. Wishing you a very happy birthday!”</li>
				<li>“Happy birthday! Your life is just about to pick up speed and blast off into the stratosphere. Wear a seat belt and be sure to enjoy the journey. Happy birthday!”</li>
				<li>“This birthday, I wish you abundant happiness and love. May all your dreams turn into reality and may lady luck visit your home today. Happy birthday to one of the sweetest people I’ve ever known.”</li>
				<li>“May you be gifted with life’s biggest joys and never-ending bliss. After all, you yourself are a gift to earth, so you deserve the best. Happy birthday.”</li>
				<li>“Count not the candles…see the lights they give. Count not the years, but the life you live. Wishing you a wonderful time ahead. Happy birthday.”</li>
				<li>“Forget the past; look forward to the future, for the best things are yet to come.”</li>
				<li>“Birthdays are a new start, a fresh beginning and a time to pursue new endeavors with new goals. Move forward with confidence and courage. You are a very special person. May today and all of your days be amazing!”</li>
				<li>“Your birthday is the first day of another 365-day journey. Be the shining thread in the beautiful tapestry of the world to make this year the best ever. Enjoy the ride.”</li>
				<li>“Be happy! Today is the day you were brought into this world to be a blessing and inspiration to the people around you! You are a wonderful person! May you be given more birthdays to fulfill all of your dreams!”</li>
			</ul>
			</div>  
		  </div>
		</div>
		<div class="footer">
		    <h4>Designed & Devoleped by Shaik Reshma (211FD01053) & Ch. Lakshmi Bhargavi (211FD01012) <br>Master of Computer Applications - Department of Information Technology <br> Vignan's Foundation for Science Technology & Research (Deemed to be) University</h4>
		</div>
	</body>
</html>