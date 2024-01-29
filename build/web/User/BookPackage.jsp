
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
        <title>Book Package</title>
    </head>
    <body>
       <script type="text/javascript">
$(document).ready(function(){
	var persons = $('#noofPersons').val();
	var cost = $('#packageCost').val();
	var totalcost = cost* persons;
	$('#totalcost').val(totalcost);
	
	$('#noofPersons').change(function(){
		var persons = $('#noofPersons').val();
		var totalcost = cost* persons;
		$('#totalcost').val(totalcost);
	});
	
	$('#button').click(function(){
		var packagename = $('#packagename').val();
		var place = $('#place').val();
		var days = $('#days').val();
		var packageCost = $('#packageCost').val();
		var noofPersons = $('#noofPersons').val();
		var totalcost = $('#totalcost').val();
		$.ajax({
			type:'POST',
			data:{ packagename:packagename, place:place, days:days, packageCost:packageCost,noofPersons:noofPersons,totalcost:totalcost},
			url:'../BookPackage',
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
			  <h2>Book Package</h2>
			  <div class="panel col-sm-12">
			    <div class="panel-body">
			    	<div class="row">
			    		<div class="col-sm-8">
			    			<form>
			    			<div class="col-sm-8">
			    				<div class="col-sm-4">
			    					<div class="form-group">
			    					Package Name:
			    					</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" type="text" value="<%=session.getAttribute("packagename") %>" id="packagename" name="packagename" readonly>
			    				</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Package Place:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" type="text" value="<%=session.getAttribute("place") %>" id="place" name="place" readonly>
			    				</div>
			    			</div>
			    			</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Number Of Days:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" type="text" value="<%=session.getAttribute("days") %>" id="days" name="days" readonly>
			    				</div>
			    			</div>
			    			</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Cost:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" type="text" value="<%=session.getAttribute("packageCost") %>" id="packageCost" name="packageCost" readonly>
			    				</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				No Of Persons:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="1" type="text" id="noofPersons" name="noofPersons" required>
			    				</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    				Total Cost:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="totalcost" name="totalcost" readonly>
			    				</div>
			    				</div>
			    			</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-4">
			    				<div class="form-group">
			    					<div class="text-right"> 
			    						<input type="button" id="button" value="Book Package" class="btn btn-primary">
			    					</div>
			    				</div>
			    			</div>
			    			</div>
			    			<div class="col-sm-8">
			    			<div class="col-sm-8">
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
