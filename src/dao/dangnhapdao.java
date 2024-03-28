package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.khachhangbean;


public class dangnhapdao {
	

	public ArrayList<khachhangbean> getDangNhap() throws Exception{
		ArrayList<khachhangbean> ds = new ArrayList<khachhangbean>();
		//b1:Ket noi vao csdl
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "select * from KhachHang";
		//b3:tao cau lenh 
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4:thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		//b4:duyet rs de dua vao mang ds
		while(rs.next()) {
			Long makhachhang = rs.getLong("makhachang");
			String hoten =rs.getString("hoten");
			String diachi=rs.getString("diachi");
			String sodienthoai=rs.getString("sodienthoai");
			String email = rs.getString("email");
			String tendn = rs.getString("tendn");
			String pass = rs.getString("pass");
			
			ds.add(new khachhangbean(makhachhang,hoten,diachi,sodienthoai,email,tendn,pass));
			
		}
		rs.close();
		kn.cn.close();
		return ds;
	}

	public ArrayList<khachhangbean> getkh() throws Exception {
		ArrayList<khachhangbean> ds = new ArrayList<khachhangbean>();
		//b1:Ket noi vao csdl
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "select * from KhachHang";
		//b3:tao cau lenh 
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4:thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		//b4:duyet rs de dua vao mang ds
		while(rs.next()) {
			Long makhachhang = rs.getLong("makhachang");
			String hoten =rs.getString("hoten");
			String diachi=rs.getString("diachi");
			String sodienthoai=rs.getString("sodienthoai");
			String email = rs.getString("email");
			String tendn = rs.getString("tendn");
			String pass = rs.getString("pass");
			
			ds.add(new khachhangbean(makhachhang,hoten,diachi,sodienthoai,email,tendn,pass));
			
		}
		rs.close();
		kn.cn.close();
		return ds;
	}

}
