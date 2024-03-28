
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
<title>Shopee</title>
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
.banner{
	width: 1220px;
    height: 316px;
    background-color:white;
    border-radius: 16px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin: 20px auto;
    padding: 20px;
    position: relative;
	
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
		<%

		%>
	<div class = "main">
		
		

			
		<div class = "banner" >
		
			<img src = "assets/img/shoppe.jpg" class = "banner-image1" style = "margin-left: 60px;
    width: 1050px;">

		</div>
		
		
		
		<div class="app__container">
		<div class="grid">
			<div class="grid__row app__content">
				<div class="grid__column-2">
					<nav class="category">
						<h3 class="category__heading">
							<i class="category__heading-icon fa-solid fa-list"></i> Mã loại
							sách
						</h3>

						<ul class="category-list">
							<%
							ArrayList<loaiaoquanbean> dsloai = (ArrayList<loaiaoquanbean>) request.getAttribute("dsloai");
							for (loaiaoquanbean l : dsloai) {
							%>

							<li class="category-item"><a class="category-item__link"
								href="aoquanController?ml=<%=l.getMaloai()%>"><%=l.getTenloai()%></a>
							</li>
							<%
							}
							%>


						</ul>
					</nav>
				</div>

				<div class="grid__column-10">
					
			

					<%
					//lay ra tieng viet
					request.setCharacterEncoding("utf-8");
					response.setCharacterEncoding("utf-8");
					//khoi tao ra sach bean lay ds tu servlet
					ArrayList<aoquanbean> ds = (ArrayList<aoquanbean>) request.getAttribute("dsaoquan");

					//lay ra danh sach
					int n = ds.size();
					//lay ra tung doi tuong sach
					for (int i = 0; i < n; i++) {
						aoquanbean s = ds.get(i);
					%>
					<div class="home-product">

						<div class="col">
							<div class="card"
								style="height: 430px; width: 200px; overflow: hidden;">
								<img class="card-img-top"
									style="height: 300px; object-fit: cover;margin-left:15px;"
									src="assets/image_aoquan/<%=s.getAnh()%>">
								<div class="">
									<h5 style="height: 30px; text-align: center;"><%=s.getTenaoquan()%>(Size:<%=s.getSize()%>)</h5>
								
									<p style="height: 30px; text-align: center;">
										Giá bán:<%=s.getGia()%></p>
									<a
										href="giohangController?ma=<%=s.getMaaoquan()%>&ten=<%=s.getTenaoquan()%>&gia=<%=s.getGia()%>&anh=<%=s.getAnh()%>">
										<img src="assets/img/buynow.jpg" style="margin-left: 50px;">
									</a>
								</div>

							</div>

						</div>

					</div>

					<%
					}
					%>
				</div>


				<div class="page" style="margin-left: 250px;">

					<nav aria-label="Page navigation example">
						<ul class="pagination">
							<%
							int sotrang = (int) request.getAttribute("ktt");
							String ml = (String) request.getAttribute("ml");
							for (int i = 1; i < sotrang; i++) {
								if (ml == null) {
							%>


							<li class="page-item"><a class="page-link"
								href="aoquanController?trang=<%=i%>"><%=i%></a> <%
 }
 if (ml != null) {
 %>
							<li class="page-item"><a class="page-link"
								href="aoquanController?trang=<%=i%>&ml=<%=request.getAttribute("ml")%>"><%=i%></a></li>
							<%
							}
							}
							%>



						</ul>
					</nav>

				</div>




			</div>





		</div>
	
		</div>

		



	</div>
		

		<jsp:include page="Footer.jsp"></jsp:include>
		
		


</body>
</html>