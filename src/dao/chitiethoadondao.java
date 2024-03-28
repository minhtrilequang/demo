package dao;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import dao.KetNoi;


public class chitiethoadondao{
	public int Them(String MaAoQuan,long SoLuongMua,long MaHoaDon) throws Exception{
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		String sql = "insert into ChiTietHoaDon values (?,?,?)";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
			cmd.setString(1, MaAoQuan);
			cmd.setLong(2, SoLuongMua);
			cmd.setLong(3, MaHoaDon);
			int kq = cmd.executeUpdate();
			cmd.close();
			kn.cn.close();
			return kq;
		
			
	}

}