
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
        <title>Book Transport</title>
    </head>
    <body>
        <script type="text/javascript">
$(document).ready(function(){
	$('#packagename').change(function(){
		var packagename =$('#packagename').find('option:selected').text();
		$('#packagetable').show();
		$.ajax({
			type:'POST',
			data:{ packagename:packagename},
			url:'../SelectPlace',
			success: function(result){
				$('#placebox').html(result);
			}
		});	
	});
	
	$('#button').click(function(){
		var transportType = $('#transportType').val();
		var vehicleType = $('#vehicleType').val();
		var vehicleName = $('#vehicleName').val();
		var vehicleCost = $('#vehicleCost').val();
		var vehicleDate = $('#vehicleDate').val();
		var packagename = $('#packagename').find('option:selected').text();
		var place = $('#placebox').find('option:selected').text();
		$.ajax({
			type:'POST',
			data:{ transportType:transportType,vehicleType:vehicleType,vehicleName:vehicleName,vehicleCost:vehicleCost,vehicleDate:vehicleDate, packagename:packagename, place:place},
			url:'../BookTransport',
			success: function(result){
				$('#validation').html(result);
			}
		});	
	});
});
</script>
<%@ include file ="Header.jsp" %>
<%@ include file ="Aside.jsp" %>
	<section class="section">
		<div class="sectiondev">
			<div class="container">
				<h2>Book Transport</h2>
				<div class="panel col-sm-8">
					<div class="panel-body">
						<div class="row">
							<div class="col-sm-12">
								<form >
								<div class="col-sm-12">
			    				<div class="col-sm-4">
								<div class="form-group">
			    				Select Package Name:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<%
						    		try {
						    			Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
						    			PreparedStatement ps = con.prepareStatement("select DISTINCT packagename from bookpackage where email='"+session.getAttribute("email")+"'");
						    			ResultSet rs = ps.executeQuery();
						    		%>
						    			<select name="packagename" id="packagename" class="form-control">
						    			<option value="select">select</option>
						    			<%while(rs.next()){ %>
						    				<option value="<%=rs.getString(1)%>" ><%=rs.getString(1) %></option>
						    			<%} %>
						    			</select>
						    			<% 
						    			}
						    		catch (Exception e) {
						    			e.printStackTrace();
						    			}%>
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
			    				<div class="col-sm-4">
								<div class="form-group">
			    				Select Place:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<select id="placebox" class="form-control">
			    					<option value="select">Select</option>
			    					</select>
			    				</div>
			    				</div>
			    				</div>
								<div class="col-sm-12">
			    				<div class="col-sm-4">
								<div class="form-group">
			    				Transport Type:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("transportType") %>" type="text" id="transportType" name="transportType" readonly>
			    				</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-12">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Vehicle Type:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("vehicleType") %>" type="text" id="vehicleType" name="vehicleType" readonly>
			    				</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-12">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Vehicle Name:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("vehicleName") %>" type="text" id="vehicleName" name="vehicleName" readonly>
			    				</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-12">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Cost:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" type="text" value="<%=session.getAttribute("vehicleCost") %>" id="vehicleCost" name="vehicleCost" readonly>
			    				</div>
			    				</div>
			    				</div>
			    			<div class="col-sm-12">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Select Date:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" type="Date" id="vehicleDate" name="vehicleDate" required="true">
			    				</div>
			    				</div>
			    				</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    					<div class="text-right"> 
			    						<input type="button" id="button" value="Book Transport" class="btn btn-primary">
			    					</div>
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
			    				<div class="col-sm-12">
			    				<div id="validation"></div>
			    				</div>
			    				</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			
			</div>
		</div>
	</section>
<%@ include file="../home/Footer.jsp" %>
    </body>
</html>
