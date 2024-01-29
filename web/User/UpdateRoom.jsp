
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
        <title>Modify Room</title>
    </head>
    <body>
        <script type="text/javascript">
$(document).ready(function(){
	$('#button').click(function(){
		var hotelName = $('#hotelName').val();
		var roomType = $('#roomType').val();
		var roomSize = $('#roomSize').val();
		var roomCost = $('#roomCost').val();
		var roomDate = $('#roomDate').val();
		var packagename = $('#packagename').val();
		var place = $('#place').val();
		$.ajax({
			type:'POST',
			data:{ hotelName:hotelName,roomType:roomType,roomSize:roomSize,roomCost:roomCost,roomDate:roomDate,packagename:packagename,place:place},
			url:'../ModifyRoom1',
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
				<h2>Modify Room</h2>
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
			    				Hotel Name:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("hotelName1") %>" type="text" id="hotelName" name="hotelName" readonly>
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
								<div class="col-sm-4">
			    				<div class="form-group">
			    				Room Type:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("roomType1") %>" type="text" id="roomType" name="roomType" readonly>
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
								<div class="col-sm-4">
			    				<div class="form-group">
			    				Room Size:
			    				</div>
			    				</div>
			    				<div class="col-sm-4">
			    				<div class="form-group">
			    					<input class="form-control" value="<%=session.getAttribute("roomSize1") %>" type="text" id="roomSize" name="roomSize" readonly>
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
			    					<input class="form-control" type="text" value="<%=session.getAttribute("roomCost1") %>" id="roomCost" name="roomCost" readonly>
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
			    					<input class="form-control" type="date" value="<%=session.getAttribute("roomDate1") %>" id="roomDate" name="roomDate" required="true">
			    				</div>
			    				</div>
			    				</div>
			    				<div class="col-sm-12">
								<div class="col-sm-4">
			    				<div class="form-group">
			    					<div class="text-right"> 
			    						<input type="button" id="button" value="Modify Room" class="btn btn-primary">
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
	</section>
<%@ include file="../home/Footer.jsp" %>
    </body>
</html>
