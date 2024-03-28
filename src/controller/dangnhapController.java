package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachhangbean;
import bean.taikhoanbean;
import bo.dangnhapbo;

/**
 * Servlet implementation class dangnhapController
 */
@WebServlet("/dangnhapController")
public class dangnhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhapController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dangnhapbo dnbo = new dangnhapbo();
		String un = request.getParameter("txtun");
		String pass = request.getParameter("txtpass");
		try {
			if(un != null && pass != null) {
				for(khachhangbean x:dnbo.getDangNhap()) {
					if(un.equals(x.getTendn()) && pass.equals(x.getPass())) {
						
						
						HttpSession session = request.getSession();
						session.setAttribute("dn", x);
						response.sendRedirect("aoquanController");
						return;

					} else
						request.setAttribute("kt", "dang nhap sai");
					
				} 
				}
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		RequestDispatcher rd = request.getRequestDispatcher("dangnhap.jsp");
		rd.forward(request, response);
	}
	
			
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
