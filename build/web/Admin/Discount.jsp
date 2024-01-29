
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
        <title>Add Discount</title>
    </head>
    <body>
      <script type="text/javascript">
$(document).ready(function(){
	$('#addDiscount').click(function(){
		var packagename = $('#packagename').find('option:selected').text();
		var discount = $('#discount').val();
		$.ajax({
			type:'POST',
			data:{ packagename:packagename,discount:discount},
			url:'../Discount',
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
			  <h2>Add Discount</h2>
			  <div class="panel col-sm-10">
			    <div class="panel-body">
			    	<div class="row">
			    		<form>
			    			<div class="col-sm-8">
			    				<div class="col-sm-4">
			    					<div class="form-group">
			    						Select Package:
			    					</div>
			    				</div>
			    				<div class="col-sm-4">
			    					<div class="form-group">
					    				<%
					    				try {
					    					Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
					    					PreparedStatement ps = con.prepareStatement("select DISTINCT packagename from package");
					    					ResultSet rs = ps.executeQuery();
					    					
					    						%>
					    						<select name="packagename" id=packagename class="form-control">
					    						<%while(rs.next()){ %>
					    							<option value="<%=rs.getString(1)%>" ><%=rs.getString(1) %></option>
					    							<%} %>
					    						</select>
					    						<% 
					    					
					    				}
					    				catch (Exception e) {
					    					e.printStackTrace();
					    				}
					    				%>
			    					</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-8">
			    				<div class="col-sm-4">
				    				<div class="form-group">
										<p id="label">Enter Discount:</p>
				    				</div>
				    			</div>
			    				<div class="col-sm-4">
			    					<div class="form-group">
			    						<input class="form-control" type="text" id="discount" name="discount" required="true">
			    					</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-8">	
				    			<div class ="col-sm-8">
				    				<div class="form-group">
				    					<div class="text-right">
				    					<input type="button" id="addDiscount" value="Add Discount" class="btn btn-primary">
					    			</div>
					    			</div>
				    			</div>
			    			</div>
			    			<div class="col-sm-8">	
			    			<div id="validation"></div>
			    			</div>
			    		</form>
			    	</div>
			    </div>
			  </div>
			</div>
		</div>
	</section>
<%@ include file="../home/Footer.jsp" %>
    </body>
</html>
