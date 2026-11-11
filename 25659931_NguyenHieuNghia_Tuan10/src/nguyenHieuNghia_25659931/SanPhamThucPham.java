package nguyenHieuNghia_25659931;

import java.time.LocalDate;

public class SanPhamThucPham extends SanPham{
	private LocalDate ngayHH;
	private double giaBan;
	public SanPhamThucPham(String maSp, String tenSp, LocalDate ngaySX, double gia, int soLuong, LocalDate ngayHH,
			double giaBan) {
		super(maSp, tenSp, ngaySX, gia, soLuong);
		this.ngayHH = ngayHH;
		this.giaBan = giaBan;
	}
	public LocalDate getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		if (ngaySX.isAfter(ngayHH)) {
			this.giaBan = 0;
		}
		this.giaBan = gia + (gia * 0.05);
	}
	
	@Override
	public String loaiSP() {
		return "Thuc pham";
	}
	@Override
	public String toString() {
		return super.toString() + " | " + loaiSP();
	}
	
	
	
	

}
