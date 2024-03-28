package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.lichsumuahangbean;

public class lichsumuahangdao {
	public ArrayList<lichsumuahangbean> HienThilsmh(long makhachhang) throws Exception{
		//b1:ket noi vao csdl
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh
		
		String sql = "select * from VLichSu where makhachang = ?";
		
		//b3:tao cau lenh
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4:thuc hien cau lenh
		cmd.setLong(1, makhachhang);
		ResultSet rs = cmd.executeQuery();
		ArrayList<lichsumuahangbean> ds = new ArrayList<lichsumuahangbean>();
		while(rs.next()) {
			ds.add(new lichsumuahangbean(rs.getString("maaoquan"),rs.getString("tenaoquan"), rs.getInt("soluongmua"),rs.getLong("ThanhTien"),rs.getDate("ngaymua")));
		}
		
		return ds;
		
		
		
	}
}
