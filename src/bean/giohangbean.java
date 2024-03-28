package bean;

import java.security.KeyStore.PrivateKeyEntry;

public class giohangbean {
	private String maaoquan;
	private String tenaoquan;
	private Long gia;
	private Long soluongmua;
	private Long thanhtien;
	private String anh;
	
	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public giohangbean(String maaoquan, String tenaoquan, Long gia, Long soluongmua, Long thanhtien, String anh) {
		super();
		this.maaoquan = maaoquan;
		this.tenaoquan = tenaoquan;
		this.gia = gia;
		this.soluongmua = soluongmua;
		this.thanhtien = thanhtien;
		this.anh = anh;
	}
	
	
	
	
	public String getMaaoquan() {
		return maaoquan;
	}

	public void setMaaoquan(String maaoquan) {
		this.maaoquan = maaoquan;
	}

	public String getTenaoquan() {
		return tenaoquan;
	}

	public void setTenaoquan(String tenaoquan) {
		this.tenaoquan = tenaoquan;
	}

	public Long getGia() {
		return gia;
	}

	public void setGia(Long gia) {
		this.gia = gia;
	}

	public Long getSoluongmua() {
		return soluongmua;
	}

	public void setSoluongmua(Long soluongmua) {
		this.soluongmua = soluongmua;
	}

	public Long getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(Long thanhtien) {
		this.thanhtien = thanhtien;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public void setSoluongmua(long slm) {
		this.soluongmua = slm;
		
	}

	
	
	
}
