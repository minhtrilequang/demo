<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset = UTF-8">
<title>Đăng nhập</title>
<link rel = "stylesheet" href = "dangnhap.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>





		<div class="loginbox">
			<img src="assets/img/loginnew.jpg" class="loginnew">
			<h1>Đăng nhập</h1>
			<form action = "dangnhapController" method = "post">
				<p>Tên khách hàng</p>
				<input type="text" name="txtun"
					placeholder="Email hoặc số điện thoại">
				<p>Mật khẩu</p>
				<input type="password" name="txtpass" placeholder="Mật khẩu">
				<input type="submit" name="th" value="Login"> <a href="#">Quên
					mật khẩu</a><br> <a href="dangkiController">Bạn chưa đăng kí tài khoản?</a>

			</form>
		</div>





</body>

</html>