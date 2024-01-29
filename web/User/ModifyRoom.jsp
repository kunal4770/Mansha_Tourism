
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="../home/Aside.css">
<link rel="stylesheet" type="text/css" href="../home/Home.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modify/Cancel Room</title>
    </head>
    <body>
      <%@ include file ="Header.jsp" %>
<%@ include file ="Aside.jsp" %>
	<section class="section">
		<div class="sectiondev">
		<h2>Modify/ Cancel Room</h2>
			<table class="table table-striped">
				<thead>
					<tr>
					<th>Hotel Name</th>
					<th>Room Type</th>
					<th>Room Size</th>
					<th>Cost</th>
					<th>Date</th>
					<th>Package</th>
					<th>Place</th>
					<th>Modify</th>
					<th>Cancel</th>
					</tr>
				</thead>
				<tbody>
					<%
					  try {
					    	Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
					    	PreparedStatement ps = con.prepareStatement("select * from bookroom where email='"+session.getAttribute("email")+"'");
					    	ResultSet rs = ps.executeQuery();
					    	
					    	while(rs.next()){ %>
					    	<tr>
					    	<td><%=rs.getString(1) %></td>
					    	<td><%=rs.getString(2) %></td>
					    	<td><%=rs.getString(3) %></td>
					    	<td><%=rs.getString(4) %></td>
					    	<td><%=rs.getString(5) %></td>
					    	<td><%=rs.getString(7) %></td>
					    	<td><%=rs.getString(8) %></td>
					    	<td><a href="../ModifyRoom?hotelName=<%=rs.getString(1) %>&roomType=<%=rs.getString(2)%>&roomSize=<%=rs.getString(3)%>&packagename=<%=rs.getString(7) %>&place=<%=rs.getString(8) %>">Modify</a></td>
					    	<td><a href="../CancelRoom?hotelName=<%=rs.getString(1) %>&roomType=<%=rs.getString(2)%>&roomSize=<%=rs.getString(3)%>&packagename=<%=rs.getString(7) %>&place=<%=rs.getString(8) %>">Cancel</a></td>
					    	</tr>
					    	<%} %>
					    	<% 
					    	}
					    	catch (Exception e) {
					    		e.printStackTrace();
					    	}%>
				</tbody>
			</table>
			
		</div>	
	</section>
<%@ include file="../home/Footer.jsp" %>  
    </body>
</html>
