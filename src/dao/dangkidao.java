package dao;

import java.sql.PreparedStatement;


public class dangkidao { 
	public int Them(String hoten,String diachi,String sodienthoai,String email,String tendn,String pass) throws Exception{
		//b1:Ket noi vao csdl
		KetNoi kn=new KetNoi();
		kn.ketnoi();
		//b2:tao cau lenh sql
		String sql="insert into KhachHang(hoten,diachi,sodienthoai,email,tendn,pass)  values (?,?,?,?,?,?)";
		//b3:tao cau lenh preparedStatement
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4:Truyen tham so
		cmd.setString(1,hoten);
		cmd.setString(2,diachi);
		cmd.setString(3,sodienthoai);
		cmd.setString(4,email);
		cmd.setString(5,tendn);
		cmd.setString(6,pass);
		//b5:thuc hien cau lenh
		int kq=cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
		
		
	}

}
