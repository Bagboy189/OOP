package nguyenHieuNghia_25659931;

import java.time.LocalDate;

public abstract class SanPham {
	protected String maSp;
	protected String tenSp;
	protected LocalDate ngaySX;
	protected double gia;
	protected int soLuong;
	
	public SanPham(String maSp, String tenSp, LocalDate ngaySX, double gia, int soLuong) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.ngaySX = ngaySX;
		this.gia = gia;
		this.soLuong = soLuong;
	}

	public String getMaSp() {
		return maSp;
	}

	public void setMaSp(String maSp) {
		this.maSp = maSp;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public abstract String loaiSP();
	
	

	@Override
	public String toString() {
		return String.format("[%s] TEN:%s | NGAYSX:%s | GIA:%,.0fVND | SL:%d |",
				maSp, tenSp, ngaySX, gia, soLuong);
	}
	
	
	
	
}
