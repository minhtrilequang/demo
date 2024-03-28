<%@page import="bo.dangnhapbo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset = UTF-8">
<title>Đăng kí</title>
<link rel="stylesheet" href="dangnhap.css">
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

	
	<%
	String a = (String) request.getAttribute("kt");
	dangnhapbo dnbo = new dangnhapbo();
	%>
	
	<div class = "dangkibox loginbox">
		<img src = "assets/img/loginnew.jpg" class = "loginnew">
		<h1>Đăng kí tài khoản</h1>
		<form action = "dangkiController" method = "post">
		
			<p>Họ tên khách hàng</p>
			<input type = "text" name = "hoten" placeholder = "Mời nhập tên khách hàng">
			<p>Địa chỉ khách hàng</p>
			<input type = "text" name = "diachi" placeholder = "Mời nhập địa chỉ khách hàng">
			<p>Số điện thoại </p>
			<input type = "text" name = "sodienthoai" placeholder = "Số điện thoại khách hàng là">
			<p>Email</p>
			<input type = "text" name = "email" placeholder = "Mời nhập email">
			<p>Tài khoản</p>
			<input type = "text" name = "tendn" placeholder = "Mời nhập tên khách hàng">
			<p>Mật khẩu</p>
			<input type = "password" name = "txtpass" placeholder = "Mật khẩu">
		
			<input type = "submit" name = 'th' value = "Đăng kí">

		</form>
		
	
	
	</div>
	
		
</body>
</html>