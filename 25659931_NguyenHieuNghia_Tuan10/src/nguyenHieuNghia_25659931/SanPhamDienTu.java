package nguyenHieuNghia_25659931;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham{
	private int tgbh;
	private double giaBan;
	public SanPhamDienTu(String maSp, String tenSp, LocalDate ngaySX, double gia, int soLuong, int tgbh,
			double giaBan) {
		super(maSp, tenSp, ngaySX, gia, soLuong);
		this.tgbh = tgbh;
		this.giaBan = giaBan;
	}
	public int getTgbh() {
		return tgbh;
	}
	public void setTgbh(int tgbh) {
		this.tgbh = tgbh;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = gia + (gia * 0.1) + (tgbh * 50000);
	}
	
	@Override
	public String loaiSP() {
		return "Dien tu";
	}
	@Override
	public String toString() {
		return super.toString() + " | " + loaiSP();
	}
	
	
	
	
	

}
