<%-- 
    Document   : sign-up
    Created on : 25.02.2016, 0:07:07
    Author     : denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Metro Guide</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	
	<body>
		<img src="img/First_building.jpg" class="station-photo"/>
		<div class="black-layer"></div>
		<div class="top-panel"> 
			<div class="top-panel-center">
                            <div class="logo"> <a href="firstrequest"> <div class="logo-img"> </div> </a> </div>
			</div>
		</div>
		
		<div class="main">
			<div class="maincentral">
				<div class="topspace"></div>
				<div class="bigstationname">
					Some information
				</div>
				
				<form class="sign-up-window" action="signupaction" method="post">
					<div class="sign-tittle"> Регистрация </div>
					<input type="text" class="sign-in-input" placeholder="Имя" name="firstname">
					<input type="text" class="sign-in-input" placeholder="Фамилия" name="lastname">
					<input type="text" class="sign-in-input" placeholder="E-mail" name="email">
					<input type="password" class="sign-in-input" placeholder="Пароль" name="password">
					<input type="submit" value="Зарегистрироваться" class="submit-button">
				</form>
				
				
							
				
			</div>
			<div class="footer">
					KievGuide 2016	
			</div>	
		</div>
	</body>
</html>