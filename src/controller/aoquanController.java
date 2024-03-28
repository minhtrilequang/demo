package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.aoquanbean;
import bo.aoquanbo;
import bo.loaiaoquanbo;

/**
 * Servlet implementation class aoquanController
 */
@WebServlet("/aoquanController")
public class aoquanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public aoquanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			loaiaoquanbo lbo = new loaiaoquanbo();
			aoquanbo abo = new aoquanbo();
			request.setAttribute("dsloai", lbo.getLoai());
			
			ArrayList<aoquanbean> ds = abo.getaoquan();
			String ml = request.getParameter("ml");
			String key = request.getParameter("txttk");
			if(ml != null)
				ds = abo.TimMa(ml);
			else if(key != null)
				ds = abo.Tim(key);
			
			
			int kichthuoc = 9;
			int bd = (request.getParameter("trang")!=null)?Integer.parseInt(request.getParameter("trang"))*kichthuoc-kichthuoc:0;
			ArrayList<aoquanbean> ds_pt = abo.PhanTrang(bd,kichthuoc);
			if(ml!=null) {
				ds = abo.TimMa(ml);
				ds_pt = abo.TimMa_SQL(ml, bd, kichthuoc);
				
			}
			if(key!=null) {
				ds = abo.Tim(key);
				ds_pt = abo.Tim_SQL(key, bd, kichthuoc);
				
			}
			int sotrang = ds.size()/kichthuoc;
			if(sotrang % kichthuoc !=0) {
				sotrang +=1;
			}
			
			request.setAttribute("ml", ml);
			request.setAttribute("key", ds);
			request.setAttribute("ktt", sotrang);
			request.setAttribute("dsaoquan",ds_pt);
			
			RequestDispatcher rd = request.getRequestDispatcher("Menu.jsp");
			rd.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
