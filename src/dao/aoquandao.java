package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import bean.aoquanbean;

public class aoquandao {
	public ArrayList<aoquanbean> getaoquan() throws Exception{
		ArrayList<aoquanbean> ds = new ArrayList<aoquanbean>();
		//b1:ket noi vao csdl 
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "select * from AoQuan";
		//b3:tao cau lenh
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4:thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		//b5:Duyet rs de dua vao mang ds
		while(rs.next()) {
			String maaoquan = rs.getString("maaoquan");
			String tenaoquan = rs.getString("tenaoquan");
			long soluong = rs.getLong("soluong");
			long gia = rs.getLong("gia");
			String size = rs.getString("size");
			String maloai = rs.getString("maloai");
			String mau = rs.getString("mau");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			
			ds.add(new aoquanbean(maaoquan, tenaoquan, null, null, size, maloai, mau, anh, ngaynhap));
			
			
		}
		//b6:thuc hien cua lenh
		rs.close();
		kn.cn.close();
		return ds;
		
		
		
	}
	public int CapNhatSL(String maaoquan,long slsua) throws Exception{
		//b1:ket noi vao csdl
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "update AoQuan set soluong = ? where maaoquan = ?";
		//b3:tao cau lenh PreparedStatement
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4:truyen tham so
		cmd.setLong(1, slsua);
		cmd.setString(2, maaoquan);
		int kq = cmd.executeUpdate();
		//b4:thuc hien cau lenh
		cmd.close();
		kn.cn.close();
		return kq;
	}
	public ArrayList<aoquanbean> Tim_SQl(String key,int bd,int kt)throws Exception{
		ArrayList<aoquanbean> ds = new ArrayList<aoquanbean>();
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "select * from AoQuan where tenaoquan collate Latin1_General_CI_AI like ? order by maaoquan offset ? rows fetch next ? rows only";
		//b3:tao cau lenh
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, "%"+key+"%");
		cmd.setInt(2, bd);
		cmd.setInt(3, kt);
		//b4: thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		//b5:duyet rs de dua vao mang ds
		while(rs.next()) {
			String maaoquan = rs.getString("maaoquan");
			String tenaoquan = rs.getString("tenaoquan");
			Long soluong = rs.getLong("soluong");
			Long gia = rs.getLong("gia");
			String size = rs.getString("size");
			String ml = rs.getString("maloai");
			String mau  = rs.getString("mau");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			ds.add(new aoquanbean(maaoquan, tenaoquan, soluong, gia, size, mau, mau, anh, ngaynhap));
		}
		rs.close();
		kn.cn.close();
		return ds;
		 
	}
	
	public ArrayList<aoquanbean> TimMa_SQL(String maloai,int bd,int kt) throws Exception{
		ArrayList<aoquanbean> ds = new ArrayList<aoquanbean>();
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "select * from AoQuan where maloai = ? order by maaoquan offset ? rows fetch next ? rows only";
		//b3:tao cau lenh
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		cmd.setInt(2, bd);
		cmd.setInt(3, kt);
		//b4:thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		//b5:duyet rs de dua vao mang ds;
		while(rs.next()) {
			String maaoquan = rs.getString("maaoquan");
			String tenaoquan = rs.getString("tenaoquan");
			Long soluong = rs.getLong("soluong");
			Long gia = rs.getLong("gia");
			String size = rs.getString("size");
			String ml = rs.getString("maloai");
			String mau  = rs.getString("mau");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			ds.add(new aoquanbean(maaoquan, tenaoquan, soluong, gia, size, maloai, mau, anh, ngaynhap));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public ArrayList<aoquanbean> PhanTrang(int bd,int kt) throws Exception{
		ArrayList<aoquanbean> ds = new ArrayList<aoquanbean>();
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "select * from AoQuan order by maaoquan offset ? rows fetch next ? rows only";
		//b3:tao cau lenh
		PreparedStatement cmd= kn.cn.prepareStatement(sql);
		cmd.setInt(1, bd);
		cmd.setInt(2, kt);
		//b4:thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		//b5:duyet rs de dua vao mang ds;
		while(rs.next()) {
			String maaoquan = rs.getString("maaoquan");
			String tenaoquan = rs.getString("tenaoquan");
			Long soluong = rs.getLong("soluong");
			Long gia = rs.getLong("gia");
			String size = rs.getString("size");
			String maloai = rs.getString("maloai");
			String mau  = rs.getString("mau");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			ds.add(new aoquanbean(maaoquan, tenaoquan, soluong, gia, size, maloai, mau, anh, ngaynhap));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}

}
