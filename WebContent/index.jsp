<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%--  <%
 //  session.removeAttribute("user");
    	
    	out.print(session.getAttribute("user"));
    	/* if(session.getAttribute("user")!=null)
    	{ */
    		response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
    		//response.setHeader("Location", "home.jsp");
    /* 	} */
    %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login PAge</title>

<link rel="stylesheet" type="text/css" href="logincss.css">
</head>
<body>
<div class="login-page">
  <div class="form">
      <h1 class = "Head">Login Portal</h1>
    
    <form class="login-form" method="post" action="login">
      <input type="text" placeholder="Roll Number" name="usename" />
      <input type="password" placeholder="Password" name="password"/>
        <button >login</button>
        
      <hr id = "line">
      
     </form>
     <form method="post" action="AfterSignUP.jsp">
      <a href = "AfterSignUP.jsp"><button>sign up</button></a>
      <p class="message">Forgot Password? <a href="forgetpassword.jsp">Click Here</a></p>
    </form>
  </div>
</div>
</body>
</html>
<script>

</script>