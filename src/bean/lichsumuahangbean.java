package bean;

import java.util.Date;

public class lichsumuahangbean{
	private String maaoquan;
	private String tenaoquan;
	private int soluongmua;
	private long thanhtien;
	private Date ngaymua;
	public lichsumuahangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lichsumuahangbean(String maaoquan, String tenaoquan, int soluongmua, long thanhtien, Date ngaymua) {
		super();
		this.maaoquan = maaoquan;
		this.tenaoquan = tenaoquan;
		this.soluongmua = soluongmua;
		this.thanhtien = thanhtien;
		this.ngaymua = ngaymua;
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
	public int getSoluongmua() {
		return soluongmua;
	}
	public void setSoluongmua(int soluongmua) {
		this.soluongmua = soluongmua;
	}
	public long getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
	public Date getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}
	
}