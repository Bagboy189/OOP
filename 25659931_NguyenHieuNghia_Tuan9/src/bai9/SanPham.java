package bai9;


import java.time.LocalDate;



public abstract class SanPham {
	protected String maSP,tenSP;
	protected int giaNhap;
	protected LocalDate ngaySX;
	protected int soLuongTon;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) throws Exception {
		if(maSP==null)
		{
			throw new Exception("Ma san pham khong duoc de trong");
		}
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(int giaNhap) throws Exception {
		this.giaNhap = giaNhap;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public SanPham(String maSP, String tenSP, int giaNhap, LocalDate ngaySX, int soLuongTon) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaNhap = giaNhap;
		this.ngaySX = ngaySX;
		this.soLuongTon = soLuongTon;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public abstract int GiaBan();
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", giaNhap=" + giaNhap + ", ngaySX=" + ngaySX
				+ ", soLuongTon=" + soLuongTon + "]";
	}
	
	

}
