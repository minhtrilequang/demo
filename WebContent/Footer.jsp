<%@page import="dao.aoquandao"%>
<%@page import="bean.aoquanbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.loaiaoquanbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bo.aoquanbo"%>
<%@page import="bo.loaiaoquanbo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset = UTF-8">
<title>Bootstrap Example</title>
<link rel="stylesheet" type="png" href="./assets/img/netfilx.png">
<link rel="stylesheet" href="./assets/css/main.css">
<link rel="stylesheet" href="./assets/css/base.css">
<link rel="stylesheet" href="./assets/images_aoquan">

<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap"
	rel="stylesheet">
<!-- <link rel="stylesheet" href="./assets/fontawesome-free-6.4.2-web/css/all.min.css"> -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>




</head>
<body>
	<footer class="footer">
		<div class="grid">
			<div class="grid__row">
				<div class="grid__column-2-4">
					<h3 class="footer__heading">Chăm sóc khách hàng</h3>
					<ul class="footer__list">
						<li class="footer-item"><a href="" class="footer-item__link">Trung
								tâm trợ giúp</a></li>
						<li class="footer-item"><a href="" class="footer-item__link">Shop
								Mall</a></li>
						<li class="footer-item"><a href="" class="footer-item__link">Hướng
								dẫn mua hàng</a></li>
					</ul>
				</div>
				<div class="grid__column-2-4">
					<h3 class="footer__heading">Giới thiệu</h3>
					<ul class="footer__list">
						<li class="footer-item"><a href="" class="footer-item__link">Giới
								thiệu</a></li>
						<li class="footer-item"><a href="" class="footer-item__link">Tuyển
								dụng</a></li>
						<li class="footer-item"><a href="" class="footer-item__link">Điều
								khoản</a></li>
					</ul>
				</div>
				<div class="grid__column-2-4">
					<h3 class="footer__heading">Danh mục</h3>
					<ul class="footer__list">
						<li class="footer-item"><a href="" class="footer-item__link">Áo thun cao cấp 2023
								</a></li>
						<li class="footer-item"><a href="" class="footer-item__link">Áo bomber xịn 2023
								</a></li>
						<li class="footer-item"><a href="" class="footer-item__link">Áo polo thanh lịch 
								</a></li>
					</ul>

				</div>
				<div class="grid__column-2-4">
					<h3 class="footer__heading">Theo dõi</h3>
					<ul class="footer__list">
						<li class="footer-item"><a
							href="https://www.facebook.com/minhtri.lequang.54/"
							class="footer-item__link"> <i class="fa-brands fa-facebook"></i>
								Facebook
						</a></li>
						<li class="footer-item"><a href="https://www.instagram.com/"
							class="footer-item__link"> <i class="fa-brands fa-instagram"></i>
								Instagram
						</a></li>

					</ul>

				</div>
				<div class="grid__column-2-4">
					<h3 class="footer__heading">Vào cửa hàng trên ứng dụng</h3>
					<div class="footer__download">
						<img src="./assets/img/qr.png" alt="Download QR"
							class="footer__download-qr">
						<div class="footer__download-apps">
							<a href="" class="footer__download-app-link"> <img
								src="./assets/img/ggplay.png" alt="Google play"
								class="footer__download-app-img">
							</a> <a href="" class="footer__download-app-link"> <img
								src="./assets/img/appstore.png" alt="App store"
								class="footer__download-app-img">

							</a>

						</div>
					</div>
				</div>


			</div>

			<div class="footer__bottom">
				<div class="grid">
					<p class="footer__text">2023 - Bản quền thuộc về Minh Trí Lê
						Quang</p>

				</div>
			</div>
	</footer>

</body>
</html>