<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@page import = "com.vm.dto.VidDto" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VideoMate - test</title>
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
          <li><a href="index.jsp">Home</a></li>
           <li class="selected"><a href="#">Video Gallery</a></li>
          <li><a href="contact.html">Contact Us</a></li>
          <li><a href="#">View Cart</a></li>
          <li><a href="#">Sign Out</a></li>
        </ul>
      </div>
    </div>
    
    <div id="site_content">
        <!--sidebar-->
      <div class="sidebar">
        <h3>Search</h3>
        <form method="post" action="#" id="search_form">
          <p>
            <input class="search" type="text" name="search_field" placeholder="Enter keywords....." />
            <input name="search" type="image" style="border: 0; margin: 0 0 -9px 5px;" src="img\search.png" alt="Search" title="Search" />
          </p>
          <center><h3>Cart</h3></center>
        <h4>New Website Launched</h4>
        <br />
        <center>
        <button class="btn2"><a href="#" >purchase</a></center>
        </button>
        </form>
        
      </div>
      <div id="content">
        <h1>Welcome to the VideoMate!</h1>
   
        	<%
        	List<VidDto> list = (ArrayList<VidDto>)request.getAttribute("list");
        	%>
    
        	<%
        	for(int i=0;i<list.size();i++){
        		
        		VidDto dto = list.get(i);
        		String id = dto.getId();
        		String name = dto.getFileName();
        	%>
        		
            	<video controls class="media"><source src="./VidDownload?id=<%=id%>"></video>
            	<form action="./VideoDownload" method="get">
            	<input type="hidden" value = <%=id%> name="vidId">
            	<input type ="submit" value="download" class="btn">
            	</form>
            	
        	<%}
        	%>      
    
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