
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Modify Transport</title>
    </head>
    <body>
        <script type="text/javascript">
$(document).ready(function(){
	
	$('#button').click(function(){
		var transportType=$('#transportType').val();
		var vehicleType =$('#vehicleType').val();
		var vehicleName= $('#vehicleName').val();
		var vehicleCost = $('#vehicleCost').val();
		var vehicleDate = $('#vehicleDate').val();
		var packagename = $('#packagename').val();
		var place = $('#place').val();
			$.ajax({
				type:'POST',
				data:{ transportType:transportType,vehicleType:vehicleType, vehicleName:vehicleName, vehicleCost:vehicleCost,vehicleDate:vehicleDate,packagename:packagename,place:place},
				url:'../ModifyTransport1',
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
			  <h2>Update Transport</h2>
			  <div class="panel col-sm-8">
			    <div class="panel-body">
			    	<div class="row">
			    		<div class="col-sm-12">
			    			<form>
			    				<div class="col-sm-12">
								<div class="col-sm-4">
								<div class="form-group">
			    				Package Name:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("packagename") %>" type="text" id="packagename" name="packagename" readonly>
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
								<div class="col-sm-4">
								<div class="form-group">
			    				Place:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("place") %>" type="text" id="place" name="place" readonly>
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    				Transport type:
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
			    				Select Vehicle type:
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
			    				Enter Vehicle Name:
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
			    					<input class="form-control" value="<%=session.getAttribute("vehicleCost") %>" type="text" id="vehicleCost" name="vehicleCost" readonly>
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    				Date:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("vehicleDate") %>" type="date" id="vehicleDate" name="vehicleDate" required="true">
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<div class="text-right"> 
			    						<input type="button" id="button" value="Modify Transport" class="btn btn-primary">
			    					</div>
			    				</div>
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
