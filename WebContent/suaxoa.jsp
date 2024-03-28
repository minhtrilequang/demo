<%@page import="bo.giohangbo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	giohangbo gh = (giohangbo) session.getAttribute("gh");
	String[] gt = request.getParameterValues("c1");
	String maq = request.getParameter("maq");
	String sl = request.getParameter("txtsl");
	
	if (gt != null) {
		for (String c : gt) {
			gh.Xoa(c);
			session.setAttribute("gh", gh);
		}
	} else {
		if (sl == null) {
			if (maq!=null) {
				gh.Xoa(maq); // btn tra lai
			}
			session.setAttribute("gh", gh);
			
		} else {

			gh.Sua(maq, Long.parseLong(sl));
			session.setAttribute("gh", gh);
		
		}
	}
	
	response.sendRedirect("htgio.jsp");
	%>

	

</body>
</html>
