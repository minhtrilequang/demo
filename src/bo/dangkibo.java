package bo;

import java.util.ArrayList;

import bean.khachhangbean;

import dao.dangkidao;
import dao.dangnhapdao;

public class dangkibo {
	dangkidao dkdao= new dangkidao();
	dangnhapdao dndao = new dangnhapdao();
	ArrayList<khachhangbean> ds;
	public ArrayList<khachhangbean> getds() throws Exception{
		return ds= dndao.getkh();
		
	}
	public void Them(String hoten,String diachi,String sodienthoai,String email,String tendn,String pass) throws Exception{
		//Kiem tra trung ma
		this.getds();
		for(khachhangbean nv:ds)
			if(nv.getTendn().toLowerCase().trim().equals(
					tendn.toLowerCase().trim()))
				return;
		
		ds.add(new khachhangbean(null, hoten, diachi, sodienthoai, email, tendn, pass));//Them vao bo nho
		dkdao.Them(hoten,diachi,sodienthoai,email,tendn,pass);//them vao csdl
	}
}
