
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
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
        <title>Update Profile</title>
    </head>
    <body>
        <script type="text/javascript">
$(document).ready(function(){
	$('#button').click(function(){
		var name= $("#name").val();
		var email = $('#email').val();
		var mobile = $('#mobile').val();
		$.ajax({
			type:'POST',
			data:{ name:name,email:email,mobile:mobile},
			url:'../UpdateProfile',
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
			  <h2>Profile</h2>
			  <div class="panel col-sm-8">
			    <div class="panel-body">
			    	<div class="row">
			    		<div class="col-sm-4">
			    			<form>
			    			<%try{
			    				Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
						    	PreparedStatement ps = con.prepareStatement("select name,mobile from register where email='"+session.getAttribute("email")+"'");
						    	ResultSet rs = ps.executeQuery();
						    	
						    	while(rs.next()){
						    		session.setAttribute("name", rs.getString(1));
						    		session.setAttribute("mobile", rs.getString(2));
						    	}
			    				}catch(Exception e){
			    					e.printStackTrace();
			    				}%>
			    				<div class="form-group">
			    				Name:
			    				</div>
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="name" name="name" required="true" value ="<%=session.getAttribute("name")%>">
			    				</div>
			    				<div class="form-group">
			    				Email ID:
			    				</div>
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="email" name="email" required="true" readonly value ="<%=session.getAttribute("email")%>">
			    				</div>
			    				<div class="form-group">
			    				Mobile:
			    				</div>
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="mobile" name="mobile" required="true" value ="<%=session.getAttribute("mobile")%>">
			    				</div>
			    				<div class="form-group">
			    					<div class="text-right"> 
			    						<input type="button" id="button" value="Update" class="btn btn-primary">
			    					</div>
			    				</div>
			    				<div id="validation"></div>
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
