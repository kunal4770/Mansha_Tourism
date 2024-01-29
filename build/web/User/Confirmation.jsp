
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
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
        <title>Confirmation</title>
    </head>
    <body>
       <%@ include file ="Header.jsp" %>
<%@ include file ="Aside.jsp" %>
	<section class="section">
		<div class="sectiondev">
			<h2>Confirmation Details</h2>
			<%
			String packagename="";
			String place="";
			String packagecost ="";
			int foodcost=0;
			int roomcost=0;
			int transportcost=0;
			String email = (String) session.getAttribute("email");
			System.out.println(email);
			
			%>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Package</th>
						<th>Place</th>
						<th>Package Cost</th>
						<th>Room Cost</th>
						<th>Food Cost</th>
						<th>Transport Cost</th>
						<th>Payment</th>
					</tr>
				</thead>
				<tbody>
						<%try{
							Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
							PreparedStatement ps = con.prepareStatement("select * from bookpackage where email='"+email+"'");
							ResultSet rs = ps.executeQuery();
							while(rs.next()){
								packagename = rs.getString(1);
								place = rs.getString(2) ;
								packagecost= rs.getString(3);
								
								%>
								<tr>
								<td><%=packagename %></td>
								<td><%=place%></td>
								<td><%=packagecost %></td>
								<%
								Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
								PreparedStatement ps1 = con1.prepareStatement("select * from bookroom where email='"+email+"' and packagename = '"+packagename+"' and place='"+place+"'");
								ResultSet rs1 = ps1.executeQuery();
								while(rs1.next()){
									roomcost =rs1.getInt(4);
									%>
									<td><%=roomcost %></td>
									<%
								}
								Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                Connection con2=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
								PreparedStatement ps2 = con2.prepareStatement("select * from bookfood where email='"+email+"' and packagename = '"+packagename+"' and place='"+place+"'");
								ResultSet rs2 = ps2.executeQuery();
								while(rs2.next()){
									foodcost = rs2.getInt(5);
									%>
									<td><%=foodcost %></td>
									<% 
								}
								Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                Connection con3=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
								PreparedStatement ps3 = con3.prepareStatement("select * from booktransport where email='"+email+"' and packagename = '"+packagename+"' and place='"+place+"'");
								ResultSet rs3 = ps3.executeQuery();
								while(rs3.next()){
									transportcost =rs3.getInt(4);
									%>
									<td><%=transportcost %></td>
									<% 
								}
								%>
								<td><a href="Payment.jsp?packagecost=<%=packagecost%>&packagename=<%=packagename%>&place=<%=place%>">Pay</a><td>
								<%
							}
						}
						catch(Exception e){
							e.printStackTrace();
						}
						%>
						
					</tr>
				</tbody>
			</table>
		</div>
	</section>
<%@ include file="../home/Footer.jsp" %>
    </body>
</html>
