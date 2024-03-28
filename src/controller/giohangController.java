package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import bo.giohangbo;
import bo.loaiaoquanbo;


@WebServlet("/giohangController")
public class giohangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public giohangController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			HttpSession session = request.getSession();
			loaiaoquanbo lbo = new loaiaoquanbo();
			request.setAttribute("dsloai", lbo.getLoai());
			
			String maaoquan = request.getParameter("ma");
			String tenaoquan = request.getParameter("ten");
			String gia = request.getParameter("gia");
			String soluong = "1";
			String anh = request.getParameter("anh");
			
			
			
			giohangbo g =  new giohangbo();
			//them moi hang vao gio
			if(maaoquan != null && tenaoquan != null && gia != null) {
				if((session).getAttribute("gh") == null) {
					(session).setAttribute("gh", g);
				}
				
				g = (giohangbo) session.getAttribute("gh");
				//ham them 
				g.Them(maaoquan, tenaoquan, Long.parseLong(gia), Long.parseLong(soluong), anh);
				session.setAttribute("gh", g);
			}else {
				//lay thong tin gio hang trong session(liet ke)
				g = (giohangbo)session.getAttribute("gh");
				
			}
			String but = request.getParameter("btn_xoachon");
			String[] gt = request.getParameterValues("c1");
			if(but != null) {
				if(gt != null) {
					for(String c:gt) {
						g.Xoa(c);
					}
				}
			}
			session.setAttribute("gh", g);
			RequestDispatcher rd = request.getRequestDispatcher("htgio.jsp");
			rd.forward(request, response);
			
			
		}catch (Exception e) {
			e.printStackTrace();
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
