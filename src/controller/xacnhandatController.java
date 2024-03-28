package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.giohangbean;
import bean.khachhangbean;
import bo.giohangbo;
import dao.chitiethoadondao;
import dao.hoadondao;

/**
 * Servlet implementation class thanhtoanController
 */
@WebServlet("/xacnhandatController")
public class xacnhandatController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xacnhandatController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			if(session.getAttribute("dn") == null) {
				response.sendRedirect("dangnhap.jsp");
				
			}else {
				hoadondao hddao = new hoadondao();
				khachhangbean kh = (khachhangbean)session.getAttribute("dn");
				//hddao.ThemHD(kh.getMakhachhang());
				//long maxhd = hddao.maxhd();
				giohangbo g = (giohangbo)session.getAttribute("gh");
				//chitiethoadondao cthddao = new chitiethoadondao();
				/*for(giohangbean i:ghbo.ds) {
					cthddao.Them(i.getMaaoquan(), i.getSoluongmua(), maxhd);
					
				}
				session.removeAttribute("gh");*/
				//response.sendRedirect("thanhtoan.jsp");
				
				
				session.setAttribute("gh", g);
				RequestDispatcher rd = request.getRequestDispatcher("xacnhandat.jsp");
				rd.forward(request, response);
				
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
