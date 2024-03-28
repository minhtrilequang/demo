
<%@page import="java.util.ArrayList"%>
<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.loaiaoquanbean"%>
<%@page import="bo.aoquanbo"%>
<%@page import="bo.loaiaoquanbo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset = UTF-8">
<title>Bootstrap Example</title>

<link rel="stylesheet" href="./assets/css/main.css">
<link rel="stylesheet" href="./assets/css/base.css">
<link rel="stylesheet" href="./assets/images_aoquan">
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
	giohangbo gh = new giohangbo();
	if (session.getAttribute("gh") != null) {
		gh = (giohangbo) session.getAttribute("gh"); }
	
	%>
	<table class="table">
		<tr>
			<td width="200" valign="top">
				<table class="table table-hover">
					<%
					ArrayList<loaiaoquanbean> dsloai = (ArrayList<loaiaoquanbean>) request.getAttribute("dsloai");
					if (dsloai != null) {
						for (loaiaoquanbean l : dsloai) {
					%>
					<tr>
						<td>
							<form action="aoquanController" method="post">
								<button type="submit" name="ml" value="<%=l.getMaloai()%>"
									class="tenloai"><%=l.getTenloai()%></button>
							</form>
						</td>
					</tr>
					<%
					}
					}
				
					%>
				</table>
			</td>
			<td width="600" valign="top">
				<p>GIỎ HÀNG CỦA BẠN</p>

				<div
					style="height: 1px; width: 100%; border-bottom: #d6d6d6 1px dotted;">
				</div> <%
 for (giohangbean h : gh.ds) {
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




						<form method="post" action="suaxoa.jsp?maq=<%=h.getMaaoquan()%>">
							<input
								style="width: 35px; height: 20px; margin-left: 4px; margin-top: 1px;"
								type="number" name="txtsl" value="<%=h.getSoluongmua()%>">
							<button class="btn btn-sua" type="submit" name="btn-sua"
								value="<%=h.getMaaoquan()%>">Cập nhật</button>
						</form>
						<form method="post" action="suaxoa.jsp?maq=<%=h.getMaaoquan()%>">
							<span style="margin: -1px 0 0 2px;">|</span>
							<button class="btn btn-sua" type="submit" name="btn-xoa"
								value="<%=h.getMaaoquan()%>">Trả lại</button>
						</form>
					</div>


				</div>


				<div
					style="height: 1px; width: 100%; border-bottom: #d6d6d6 1px dotted; margin-top: 10px;"></div>

				<%
				}
				%>




				<div class="button" style="display: flex; justify-content: center;">
					<form action="xoatatca.jsp">
						<button class="btn btn-xoatatca" type="submit" name="btn_xoatatca">Trả
							lại toàn bộ sản phẩm</button>
					</form>
					<form action="aoquanController">
						<button class="btn btn-xoatatca" type="submit" name="btn_xoatatca">Tiếp
							tục mua hàng</button>

					</form>

					<a href="xacnhandatController" method="post">
						<button class="btn btn-xoatatca" type="submit" name="xn">Xác
							nhận đặt</button>



					</a>

				
				</div>
				
						<div class = "cost">
 						
							<b>Tổng cộng:<%=gh.TinhTongThanhTien()%>VNĐ
							</b>
						
 				</div>

	

		</tr>
	</table>

</body>
</html>