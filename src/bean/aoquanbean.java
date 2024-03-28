package bean;

import java.sql.Date;

public class aoquanbean {
	private String maaoquan;
	private String tenaoquan;
	private Long soluong;
	private Long gia;
	private String size;
	private String maloai;
	private String mau;
	private String anh;
	private Date ngaynhap;
	public aoquanbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public aoquanbean(String maaoquan, String tenaoquan, Long soluong, Long gia, String size, String maloai, String mau,
			String anh, Date ngaynhap) {
		super();
		this.maaoquan = maaoquan;
		this.tenaoquan = tenaoquan;
		this.soluong = soluong;
		this.gia = gia;
		this.size = size;
		this.maloai = maloai;
		this.mau = mau;
		this.anh = anh;
		this.ngaynhap = ngaynhap;
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
	public Long getSoluong() {
		return soluong;
	}
	public void setSoluong(Long soluong) {
		this.soluong = soluong;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getMau() {
		return mau;
	}
	public void setMau(String mau) {
		this.mau = mau;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public Date getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	
	
}