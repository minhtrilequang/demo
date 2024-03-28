package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class KetNoi {
	public Connection cn;
	public void ketnoi() throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url= "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=QuanLyAoQuan;user=sa; password=123";
		cn = DriverManager.getConnection(url);
		System.out.println("da ket noi");
		
	}

}
