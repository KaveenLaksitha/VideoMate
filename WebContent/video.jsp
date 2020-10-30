<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@page import = "com.vm.dto.VidDto" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VideoMate - Gallery</title>
<link rel="stylesheet" type="text/css" href="style.css" title="style" />

<script>
var isNS = (navigator.appName == "Netscape") ? 1 : 0;
if(navigator.appName == "Netscape") document.captureEvents(Event.MOUSEDOWN||Event.MOUSEUP);
function mischandler(){
return false;
}
function mousehandler(e){
var myevent = (isNS) ? e : event;
var eventbutton = (isNS) ? myevent.which : myevent.button;
if((eventbutton==2)||(eventbutton==3)) return false;
}
document.oncontextmenu = mischandler;
document.onmousedown = mousehandler;
document.onmouseup = mousehandler;
</script>

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
           <li class="selected"><a href="#">Video Gallery</a></li>
          <li><a href="#">Contact Us</a></li>
          <li><a href="subscription.jsp">Subscription</a></li>
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