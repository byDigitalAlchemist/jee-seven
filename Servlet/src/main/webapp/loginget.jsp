<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link href="resources/lib/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<br>
	<div class="container-fluid">
		<div class="panel panel-success">
			<div class="panel-heading" align="center">
				<h4>
					<b><font color="black" style="font-family: Segoe UI;">Connect</font> </b>
				</h4>
			</div>
			<div class="panel-body" align="center">

				<div class="container "   style='/*margin-top: 2%; margin-bottom: 2%;*/' >

					<div class="panel panel-success" style="max-width: 35%;"
						align="left">

						<div class="panel-heading form-group">
							<b><font color="LimeGreen"> Login Form</font> </b>
						</div>

						<div class="panel-body">

							<form action="LoginServlet" method="post">
								<div class="form-group">
									<label for="inputTxtEmail">User Name</label> 
									<input	type="text" class="form-control" name="txtUserName" id="txtUserName" placeholder="Enter User Name" required="required">
								</div>
								<div class="form-group">
									<label for="inputTxtPassword">Password</label> 
									<input	type="password" class="form-control" name="txtPass" id="txtPass" placeholder="Password" required="required">
								</div>
								
								
								<fieldset class="form-group row">
							      <legend class="col-form-legend col-sm-2" for="exampleCheckBox">Sex</legend>
							      <div class="col-sm-10">
							        <div class="form-check">
							          <label class="form-check-label">
							            <input class="form-check-input" type="radio" name="gender" id="radioGender1" value="Male" checked>
							            Male							            
							          </label>
							        </div>
							        <div class="form-check">
							          <label class="form-check-label">
							            <input class="form-check-input" type="radio" name="gender" id="radioGender2" value="Female">
							            Female
							          </label>
							        </div>
							        <div class="form-check disabled">
							          <label class="form-check-label">
							            <input class="form-check-input" type="radio" name="gender" id="radioGender3" value="Confidential" disabled>
							            Confidential
							          </label>
							        </div>
							      </div>
							    </fieldset>
							    
							    <div class="form-check form-check-inline">
							    	<label for="inputTxtEmail">Hobbies</label>
							    </div>
							    <div class="form-check form-check-inline">
								  <label class="form-check-label">
								    <input class="form-check-input" type="checkbox" id="checkBoxMovies" value="option1"> Movies
								  </label>
								</div>
								<div class="form-check form-check-inline">
								  <label class="form-check-label">
								    <input class="form-check-input" type="checkbox" id="checkBoxOnlineGames" value="option2"> Online-Games
								  </label>
								</div>
								<div class="form-check form-check-inline disabled">
								  <label class="form-check-label">
								    <input class="form-check-input" type="checkbox" id="checkBoxTraveling" value="option3" disabled> Traveling
								  </label>
								</div>
								
								
								<div class="form-group">
							    	<label for="selectCountry">Country</label>
								    <select class="form-control" id="selectCountry" name="selectCountry">
								      <option value="USA">USA</option>
								      <option value="UK">UK</option>
								      <option value="Australia">Australia</option>
								      <option value="Pakistan">Pakistan</option>
								      <option value="South Africa">South Africa</option>
								    </select>
							  </div>
							  <div class="form-group">
							    <label for="multipleSelectKids">Kids</label>
							    <select multiple class="form-control" id="selectMultipleKids" name="selectKids">
							      <option value="1">1</option>
							      <option value="2">2</option>
							      <option value="3">3</option>
							      <option value="4">4</option>
							      <option value="5">5</option>
							    </select>
							  </div>
							  
							  
							  <div class="form-group">
							    <label for="txtAreaDescription">Tell us about yourself</label>
							    <textarea class="form-control" id="txtAreaDescr" rows="2"></textarea>
							  </div>


							<div class="form-group text-center" >
								<button type="submit" id="btnRegister" style="/*width: 100%;*/ font-size: 1.1em;" class="btn btn-large btn btn-success btn-lg ">
									<b>Login</b>
								</button>
								<button type="reset"  id="btnClear" style="/*width: 100%;*/ font-size: 1.1em;" class="btn btn-large btn btn-success btn-lg ">
									<b>Clear</b>
								</button>
							</div>

							</form>

						</div>
						
						
					</div>

				</div>

			</div>
			<div class="panel-footer" align="center">
				<font style="color: #111">Copyright @2K <a href="http://anwaarlabs.com/">anwaarlabs.com</a>, All Rights Reserved.</font>
			</div>
		</div>
	</div>

</body>
</html>