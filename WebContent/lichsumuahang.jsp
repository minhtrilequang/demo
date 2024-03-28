<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@page import="bean.lichsumuahangbean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html;charset = UTF-8">
<style>
	
	
	
</style>

</head>

<body>
<jsp:include page="Header.jsp"></jsp:include>



<table class = "table">
	<thead>
		<tr>
			<td>Mã áo quần</td>
			<td>Tên áo quần</td>
			<td>Số lượng mua</td>
			<td>Thành tiền</td>
			<td>Ngày mua</td>
		
		</tr>
	</thead>

		 <%
		 if (request.getAttribute("ds") != null) {
		 ArrayList<lichsumuahangbean> lsmh = (ArrayList<lichsumuahangbean>) request.getAttribute("ds");
 for (lichsumuahangbean ls : lsmh) {
 %>
 	<tbody>
 	<tr>
			<td><%= ls.getMaaoquan() %></td>
			<td><%= ls.getTenaoquan() %></td>
			<td><%= ls.getSoluongmua() %></td>
			<td><%= ls.getThanhtien() %></td>
			<td><%= ls.getNgaymua()%></td>
		
		</tr>
 	
 	</tbody>

		
		<% 
		}
 		}
		 %>
	
	
	



</table>

</body>
</html>