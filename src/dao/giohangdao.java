package dao;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangdao {
	public ArrayList<giohangbean> ds = new ArrayList<giohangbean>();
	public void Them(String maq,String taq,long gia) {
		int n = ds.size();
		long soluongthem = 0;
			for(int i = 0; i < n;i++) {
				if(ds.get(i).getMaaoquan().toLowerCase().trim().equals(maq.toLowerCase().trim())) {
					soluongthem = ds.get(i).getSoluongmua()+1;
					ds.get(i).setSoluongmua(soluongthem);
					long thanhtien = ds.get(i).getGia()*ds.get(i).getSoluongmua();
					ds.get(i).setThanhtien(thanhtien);
					return;
				}
			}
		giohangbean h = new giohangbean(maq, maq, soluongthem, gia, soluongthem, taq);
		ds.add(h);
	}
	
	public long Tongtien() {
		int n = ds.size();
		long s = 0;
		for(int i = 0; i < n;i++) {
			s = s + ds.get(i).getThanhtien();
		}
		return s;
	}
	
	public void Xoa(int index) {
		if(index >= 0 && index < ds.size()) {
			ds.remove(index);
		}
	}
	
	public void XoaTatCa() {
		ds.clear();
		
		
	}
 
}
