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
import dao.khachhangdao;

/**
 * Servlet implementation class thanhtoanController
 */
@WebServlet("/thanhtoanController")
public class thanhtoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public thanhtoanController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			request.setCharacterEncoding("utf-8");

			HttpSession session = request.getSession();

			String hoten = request.getParameter("hoten");
			String diachi = request.getParameter("diachi");
			String sodienthoai = request.getParameter("sdt");
			String email = request.getParameter("email");

			if (session.getAttribute("dn") == null) {
				response.sendRedirect("dangnhap.jsp");

			} else {
				hoadondao hddao = new hoadondao();
				khachhangbean kh = (khachhangbean) session.getAttribute("dn");
				hddao.ThemHD(kh.getMakhachhang());
				khachhangdao khdao = new khachhangdao();
				khdao.CapNhat(hoten, diachi, email, kh.getMakhachhang());

				long maxhd = hddao.maxhd();
				giohangbo gh = new giohangbo();
				gh = (giohangbo) session.getAttribute("gh");
				if (gh != null) {
					chitiethoadondao cthddao = new chitiethoadondao();
					for (giohangbean i : gh.ds) {
						cthddao.Them(i.getMaaoquan(), i.getSoluongmua(), maxhd);

					}
					session.removeAttribute("gh");
				}

				RequestDispatcher rd = request.getRequestDispatcher("thanhtoan.jsp");
				rd.forward(request, response);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
