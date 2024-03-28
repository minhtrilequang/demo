package bo;

import java.util.ArrayList;

import bean.khachhangbean;
import bean.taikhoanbean;
import dao.dangnhapdao;


public class dangnhapbo {
	dangnhapdao dnhapdao= new dangnhapdao();
	ArrayList<khachhangbean> ds;
	public ArrayList<khachhangbean> getDangNhap() throws Exception{
		ds = dnhapdao.getDangNhap();
		return ds;
		
	}

}
