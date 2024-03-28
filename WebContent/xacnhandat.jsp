<%@page import="bean.khachhangbean"%>
<%@page import="bean.giohangbean"%>
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




<style>
.row {
	margin: 0 -8px;
}

.col {
	padding: 0 8px;
	float: left;
}

.col-3 {
	width: 33.333%;
}

.khoi_hang {
	height: auto;
	width: auto;
	display: flex;
	margin-bottom: 5px;
}

.khoi_hang input {
	margin-top: -10px;
}

.khoi_1_hang {
	display: flex;
}

.khoi_1_hang .btn-sua {
	border: none;
	background: none;
	color: black;
	margin-top: 0px;
}

.khoi_1_hang .btn {
	margin-left: 3px;
	text-decoration: none;
	text-align: center;
	display: inline-block;
	padding: 0px;
	height: 20px;
}

.khoi_1_hang .btn:hover {
	background: orange;
	color: white;
	padding: -5px 1px;
	text-decoration: underline;
}

.btn {
	margin-top: 10px;
}

.btn-xoachon {
	margin-bottom: 10px;
	background: #720000;
	color: white;
}

.btn-xoachon:hover {
	background: #dbdbdb;
	border: 1px solid #720000;
	color: white;
}

.btn-xoatatca {
	margin-bottom: 10px;
	background: #720000;
	color: white;
}

.btn-xoatatca:hover {
	background: #dbdbdb;
	border: 1px solid #720000;
	color: white;
}

.form_3_nut {
	width: 340px;
	display: flex;
	justify-content: space-between;
	margin: 10px auto;
}

.form_3_nut .btn {
	background: none;
}

.form_3_nut .btn-ttmua, .btn-tltoanbo {
	border: 1px solid #dbdbdb;
	margin-right: 5px;
}

.form_3_nut .btn-ttoan {
	border: 1px solid #720000;
	background: #720000;
	color: white;
}

.form_3_nut .btn:hover, .btn-chonmua a:hover {
	background: #dbdbdb;
}

.btn-chonmua {
	margin-top: 20px;
}

.btn-chonmua p, .btn-chonmua a {
	display: inline;
}

.btn-chonmua a {
	text-decoration: none;
	color: white;
	border: 1px solid #720000;
	background: #720000;
	padding: 10px 20px;
	border-radius: 5px;
}

.tenloai {
	background: none;
	border: none;
	text-decoration: none;
}

.tenloai:hover {
	text-decoration: underline;
}

.modal-header1 {
	padding: 15px;
	border-bottom: 1px solid #e5e5e5;
	display: flex;
	flex-shrink: 0;
	justify-content: space-between;
	padding: var(- -bs-modal-header-padding);
	border-bottom: var(- -bs-modal-header-border-width) solid
		var(- -bs-modal-header-border-color);
	border-top-left-radius: var(- -bs-modal-inner-border-radius);
	border-top-right-radius: var(- -bs-modal-inner-border-radius);
}

.mt-10 {
	margin-top: 8px;
}

.un_dxuat {
	display: flex;
	height: 50px;
	line-height: 50px;
	padding-right: 12px;
	color: #9d9d9d;
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	giohangbo g = new giohangbo();
	
	khachhangbean khachhang = new khachhangbean();
	if (session.getAttribute("dn") != null) {
		khachhang = (khachhangbean) session.getAttribute("dn");

	}
	if (session.getAttribute("gh") != null) {
		g = (giohangbo) session.getAttribute("gh");
	%>

	<h2>Form Xác Nhận Đơn Hàng</h2>

	<form action="thanhtoanController" method="post">
		<label for="hoten">Họ Tên:</label> <input type="text" id="fullName"
			name="hoten" required value="<%=khachhang.getHoten()%>"> <label
			for="diachi">Địa Chỉ:</label> <input type="text" id="diachi"
			name="diachi" required value="<%=khachhang.getDiachi()%>">

		<label for="sdt">Số Điện Thoại:</label> <input type="tel" id="phone"
			name="sdt" required value="<%=khachhang.getSodienthoai()%>">
		<label for="email">Email:</label> <input type="email" id="email"
			name="email" required value="<%=khachhang.getEmail()%>"> <input
			type="submit" value="Đặt hàng">
	</form>

	<td width="600" valign="top">
		<p>GIỎ HÀNG CỦA BẠN</p>

		<div
			style="height: 1px; width: 100%; border-bottom: #d6d6d6 1px dotted;">
		</div> <%
 for (giohangbean h : g.ds) {
 %>

		<div class="khoi_hang">
			<input type="checkbox" name="c1" value="<%=h.getMaaoquan()%>">
			<img class="card-img-top" style="height: 70px; object-fit: cover;"
				src="assets/image_aoquan/<%=h.getAnh()%>">


			<p
				style="color: black; font-weight: bold; text-transform: uppercase;"><%=h.getTenaoquan()%>()
			</p>
			<div class="khoi_1_hang">
				<p>
					Giá: <span style="color: #6d2524; font-weight: bold;"> <%=h.getGia()%>đ
					</span> x
				</p>
				<p style="margin-left: 2px;"><%=h.getSoluongmua()%></p>


			</div>


		</div>


		<div
			style="height: 1px; width: 100%; border-bottom: #d6d6d6 1px dotted; margin-top: 10px;"></div>

		<%
		}
		}
		%>



	</td>


</body>
</html>