package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import bean.khachhangbean;


public class khachhangdao {
	/*public khachhangbean ktdn(String tendn,String pass ) throws Exception{
		KetNoi kn=new KetNoi();
		kn.ketnoi();
		String sql="select*from khachhang where tendn=? and pass = ?";
		PreparedStatement cmd=kn.cn.prepareStatement(sql);
		cmd.setString(1, tendn);
		cmd.setString(2, pass);
		ResultSet rs=cmd.executeQuery();
		khachhangbean kh=null;
		if(rs.next()) {
			
			
		}
		
	} */
	
	public int CapNhat(String hoten, String diachi, String email, long makh) throws Exception {
		// b1:ket noi vao csdl
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		// b2:tao cau lenh sql
		String sql = "update khachhang set hoten = ?, diachi = ?, email = ? where makhachang = ?";
		// b3:Tao cau lenh PreparedStatement
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		// b4:Truyen tham so
		cmd.setString(1, hoten);
		cmd.setString(2, diachi);
		cmd.setString(3, email);
		cmd.setLong(4, makh);
		int kq = cmd.executeUpdate();
		// b5:thuc hien cau lenh
		cmd.close();
		kn.cn.close();
		return kq;

	}

}
