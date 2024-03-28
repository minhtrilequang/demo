package bean;

public class khachhangbean {
	private Long makhachhang;
	private String hoten;
	private String diachi;
	private String sodienthoai;
	private String email;
	private String tendn;
	private String pass;
	public khachhangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public khachhangbean(Long makhachhang, String hoten, String diachi, String sodienthoai, String email, String tendn,
			String pass) {
		super();
		this.makhachhang = makhachhang;
		this.hoten = hoten;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.email = email;
		this.tendn = tendn;
		this.pass = pass;
	}

	public Long getMakhachhang() {
		return makhachhang;
	}
	public void setMakhachhang(Long makhachhang) {
		this.makhachhang = makhachhang;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTendn() {
		return tendn;
	}
	public void setTendn(String tendn) {
		this.tendn = tendn;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
