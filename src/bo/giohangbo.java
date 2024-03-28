package bo;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean> ds = new ArrayList<giohangbean>();
	
	//Ham them:them 1 hang vao gio
	public void Them(String maaoquan,String tenaoquan,Long soluongmua,Long gia,String anh) throws Exception{
		for(int i = 0;i < ds.size();i++) {
			if(ds.get(i).getMaaoquan().toLowerCase().trim().equals(maaoquan.toLowerCase().trim())) {
				ds.get(i).setSoluongmua(soluongmua+ds.get(i).getSoluongmua());
				
				return;
			}
		}
		giohangbean gh = new giohangbean(maaoquan, tenaoquan, soluongmua, gia, gia, anh);
		ds.add(gh);
		
	}
	
	//ham xoa 1 mat hang ra khoi gio:xoa 1 phan tu trong ds
	public void Xoa(String maq) throws Exception{
		int n = ds.size();
		for(int i = 0;i < n;i++) {
			if(ds.get(i).getMaaoquan().toLowerCase().trim().equals(maq.toLowerCase().trim())) {
				ds.remove(i);
				return;
			}
		}
	}
	
	//ham sua
	public void Sua(String maq,Long soluongmua) {
		int n = ds.size();
		for(int i = 0 ; i < n;i++) {
			if(ds.get(i).getMaaoquan().toLowerCase().trim().equals(maq.toLowerCase().trim())) {
				long slm = soluongmua;
				ds.get(i).setSoluongmua(slm);
				long g = ds.get(i).getGia();
				long tt = slm*g;
				ds.get(i).setThanhtien(tt);
				return;
			}
		}
	}
	
	//ham xoa tat ca
	public ArrayList<giohangbean> xoatatca() throws Exception{
		ds.clear();
		return ds;
		
	}
	
	//ham tinh tong thanh tien
	
	public double TinhTongThanhTien() {
		double tongThanhTien = 0;
		for(giohangbean gioHang:ds) {
				//tongThanhTien +=  gioHang.getThanhtien();
				tongThanhTien += gioHang.getSoluongmua() * gioHang.getGia();
		}
		return tongThanhTien;
	}
}
