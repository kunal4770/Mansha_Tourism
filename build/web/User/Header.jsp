
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="Home.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
       <nav class = "top-nav">
			<ul>
				<li><a href="../home/Login.jsp">Log Out</a></li>
				<li><a>Hello <%=session.getAttribute("email") %></a></li>	
			</ul>
		</nav>
    <!-- HEADER -->
	<div id="header">
		<div class="container">
        	<div align="left">
				<font size="7">
					<p id="title">Mansha Tourism</p>
				</font>
			</div>
		</div>
	</div>
</header>
<div id="navbar">
	<nav class="navbar navbar-default" role="navigation" >
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><a>Welcome to Tourism Management System</a></li>
			</ul>
		</div>
	</nav>
</div>
    </body>
</html>
