package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaiaoquanbean;

public class loaiaoquandao {
	public ArrayList<loaiaoquanbean> getloai() throws Exception{
		ArrayList<loaiaoquanbean> ds = new ArrayList<loaiaoquanbean>();
		//b1:ket noi vao csdl
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql = "select * from LoaiAoQuan";
		//b3:tao cau lenh
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4:thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		//b5:duyet rs de dua vao mang ds
		while(rs.next()) {
			String maloai = rs.getString("maloai");
			String tenloai = rs.getString("tenloai");
			ds.add(new loaiaoquanbean(maloai, tenloai));
		}
		rs.close();
		kn.cn.close();
		return ds;
		
	}

}
