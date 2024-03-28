package bean;

public class taikhoanbean {
	private String TenDangNhap;
	
	private String MatKhau;
	private boolean Quyen;
	public taikhoanbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTenDangNhap() {
		return TenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.TenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		this.MatKhau = matKhau;
	}
	public boolean isQuyen() {
		return Quyen;
	}
	public void setQuyen(boolean quyen) {
		this.Quyen = quyen;
	}
	public taikhoanbean(String tenDangNhap, String matKhau, boolean quyen) {
		super();
		this.TenDangNhap = tenDangNhap;
		this.MatKhau = matKhau;
		this.Quyen = quyen;
	}
	
	
	
	
	
	
}
