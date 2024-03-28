package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import bo.dangkibo;

/**
 * Servlet implementation class dangkiController
 */
@WebServlet("/dangkiController")
public class dangkiController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public dangkiController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dangkibo dkbo = new dangkibo();
		String hoten = request.getParameter("hoten");
		String diachi = request.getParameter("diachi");
		String sodienthoai = request.getParameter("sodienthoai");
		String email = request.getParameter("email");
		
		String tendn = request.getParameter("tendn");
		String pass = request.getParameter("txtpass");

	
		try {
			if (hoten != "" && diachi != "" && sodienthoai != "" && email != "" && tendn != "" && pass != "" ) {
				dkbo.Them(hoten, diachi, sodienthoai, email, tendn, pass);;
				response.sendRedirect("aoquanController");
				return; 
			} else {
				request.setAttribute("kt", "Vui long nhap day du thong tin");
			}

		} catch (Exception e) {
			request.setAttribute("kt", "Dang ky loi");
		}

		RequestDispatcher rd = request.getRequestDispatcher("dangki.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
