
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
        <title>Add Package</title>
    </head>
    <body>
       <script type="text/javascript">
$(document).ready(function(){
	$('#button').click(function(){
		var packagename = $('#packagename').val();
		var place = $('#place').val();
		var days = $('#days').val();
		var packageCost = $('#packageCost').val();
		$.ajax({
			type:'POST',
			data:{ packagename:packagename, place:place, days:days, packageCost:packageCost},
			url:'../Package',
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
			  <h2>Add Package</h2>
			  <div class="panel col-sm-8">
			    <div class="panel-body">
			    	<div class="row">
			    		<div class="col-sm-4">
			    			<form>
			    				<div class="form-group">
			    				Enter Package Name:
			    				</div>
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="packagename" name="packagename" required="true">
			    				</div>
			    				<div class="form-group">
			    				Enter Package Place:
			    				</div>
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="place" name="place" required="true">
			    				</div>
			    				<div class="form-group">
			    				Enter Number Of Days:
			    				</div>
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="days" name="days" required="true">
			    				</div>
			    				<div class="form-group">
			    				Enter Cost:
			    				</div>
			    				<div class="form-group">
			    					<input class="form-control" type="text" id="packageCost" name="packageCost" required="true">
			    				</div>
			    				<div class="form-group">
			    					<div class="text-right"> 
			    						<input type="button" id="button" value="Add Package" class="btn btn-primary">
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