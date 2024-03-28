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
	.css-sf6cf9{
		margin:0px auto;
		width:100%;
		max-width:1120px;
		min-height:calc(100vh-211px);
		box-sizing:border-box;
	}
	.css-yd8sa{
		display:flex;
		flex-direction:column;
		gap:16px;
	}
	.css-1710bvh{
		background-color:rgb(255,255,255);
		padding:16px;
		display:flex;
		justify-content:center;
		border-radius:8px;
		gap:16px;
		
	}
	.css-1d3bbye{
		box-sizing:border-box;
		display:flex;
		flex-flow:wrap;
		width:100%;
		
	}

</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<%
	
	%>
	<div class = "main">
		<div class = "MuiBox-root css-sf6cf9">
			
			<div class = "MuiBox-root css-yd8sa">
				<div class = "MuiBox-root csss-1710bvh">
					<div class = "MuiGrid-root MuiGrid-container css-1d3bbye">
					
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
						<div class = "MuiBox-root css-fnn9lc">
							<div class = "MuiBox-root css-irjokm">
								<img 
									style="border-width:1px;border-style:solid;border-color:rgb(299,231,233);
									border-radius:8px;object-fit:contain;width:100%;height:100%;max-height:442px;
									min-height:351px;cursor:zoom-in"
									src="assets/image_aoquan/<%=s.getAnh()%>">
							
							</div>
						</div>
						
					<%
					}
					%>
					</div>
				</div>
			
			</div>
		
		
		</div>
		
	
	
	
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<jsp:include page="Footer.jsp"></jsp:include>
	
</body>
</html>

