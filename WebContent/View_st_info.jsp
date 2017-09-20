<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="home.css">
<title>Insert title here</title>
</head>

<body>
 
<nav>
  
   <ul class="menu">
  
    <li><a href="#">Registered Courses</a></li>
    
  <%--  <h1>  <% out.print("user is "+ session.getAttribute("user")); %></h1> --%>
    <li><a href="#">View Courses</a></li>
    <li><form action="" method="post"><button><a href="s_update.jsp">update</a></button></li>
    
    <li>
      <a href="#">View Information</a>
      <ul>
        <li><a href="">View Faculty Information</a></li>
        <li><form action="View_Info" method="post"><button><a href="#">View Your Information</a></button></form></li>
        <li><a href="#">View Fee Records</a></li>
        <li><a href="#">View History</a></li>
      </ul>
    </li>
    <li>
      <a href="#">Log Out</a>
      
       
    </li>
  </ul>
</nav>
<p>THis is body <%out.print(request.getAttribute("abc")); %></p>

</body>

</html>