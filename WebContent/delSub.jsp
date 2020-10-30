<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UnSubscription</title>
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
           <li class="selected"><a href="#">UnSubscription</a></li>
          <li><a href="contact.html">Contact Us</a></li>
          <li><a href="#">Sign Out</a></li>
        </ul>
      </div>
    </div>
    
    <div id="site_content">
    <div id="content">
    
    <h1>Please fill the form and submit</h1>  
    <center>
	
	<form action="./delete" method="post">

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
  		  <td><input type="submit" value="unsubscribe"></td>
  		  
  		  <td><input type ="reset"></td>
  		  </tr>
  		  
  		</table>

  		</form>
  		</div></center>
  		
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