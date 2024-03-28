package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.KetNoi;

public class hoadondao{
	public int ThemHD(Long makh) throws Exception{
		//b1:Ket noi vao csdl
		KetNoi kn=new KetNoi();
		kn.ketnoi();
		String sql = "insert into HoaDon (makhachang,ngaymua) values (?,?)";
		PreparedStatement cmd=kn.cn.prepareStatement(sql);
		cmd.setLong(1, makh);
		Date n1 = new Date();//lay ngay trong may ra
		SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd");
		String tam=dd.format(n1);//doi ngay ra chuoi theo dd
		Date n2 = dd.parse(tam);//doi chuoi ra lai ngay util
		//doi ngay util sang ngay sql
		
		cmd.setDate(2, new java.sql.Date(n2.getTime()));
		int kq=cmd.executeUpdate();
		cmd.close();kn.cn.close();
		return kq;
	
	
		
		
		
		
		
		
		
		
		
	}
	public long maxhd() throws Exception {
		KetNoi kn=new KetNoi();
		kn.ketnoi();
		String sql="select max(maHoaDon) as maxhd from hoadon";
		PreparedStatement cmd=kn.cn.prepareStatement(sql);
		ResultSet rs=cmd.executeQuery();
		long max = 0;
		if(rs.next()) {
			max=rs.getLong("maxhd");
			
			
		}rs.close();kn.cn.close();
		return max;
	}
		
		
	}
