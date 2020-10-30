<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Subscription</title>
<link rel="stylesheet" type="text/css" href="style.css" title="style" />
</head>
<body>
 <div id="main">
    <div id="header">
      <div id="logo">
          <a href="index.html"> <img src="img\logo.png" class="logo1"></a>
        <div id="logo_text">
          <h2>video lending platform</h2>
      </div>
        </div>
      <div id="menubar">
        <ul id="menu">
          <li><a href="./VidViewController">Video Gallery</a></li>
           <li class="selected"><a href="#">Update Subscription</a></li>
          <li><a href="contact.html">Contact Us</a></li>
          <li><a href="#">Sign Out</a></li>
        </ul>
      </div>
    </div>
    
    <div id="site_content">

   
      <div id="content">
        <h1>Please fill the form and submit</h1>  
                  
    	<form action="./update" method="post">
    	<center>
    	<table>
 		
  		  <tr>
 		 	<td>username	: </td>
 		 	<td><input type = "text" name="uname" required></td>
  		  </tr>
  		  <tr>
 		 	<td>email	:</td>
 		 	<td><input type = "email" name="email" required></td>
  		  </tr>
  		  <tr>
 		 	<td>
 		 	<label for="plan">Choose a plan:</label>
 		 	</td>
 		 	<td>
 		 	<select name="plan" id="opt">
  		 	 <option value="bronze">Bronze</option>
  		  	<option value="silver">Silver</option>
  		  	<option value="gold">Gold</option>
  		  	</select>
  		  	</td>
  		  </tr>
  		  <tr>
 		 	<td>Card No	: </td>
 		 	<td><input type = "text" name="card" required></td>
  		  </tr>
  		  <tr>
 		 	<td>Name On The Card	:</td>
 		 	<td><input type = "text" name="name" required></td>
  		  </tr><tr>
 		 	<td>Expiry Date	: </td>
 		 	<td><input type = "date" name="ex_date" required></td>
  		  </tr>
  		  <tr>
 		 	<td>CVV/CVC	:</td>
 		 	<td><input type = "text" name="cvv" required></td>
  		  </tr>
  		  <tr>
  		  <td><input type="submit" value="Update"></td>
  		  
  		  <td><input type ="reset"></td>
  		  </tr>
  		  
  		</table>
	</form>
	</center>
    </div>
    
    </div>
      <!--footer-->
    <div id="content_footer"></div>
    <div id="footer">
      | Copyright &copy; VIDEOMATE.LK | 
    </div>
  </div>
</body>
</html>