package bai9;

import java.time.LocalDate;




public class SanPhamThucPham extends SanPham {
	private LocalDate ngayHH;
	
	public LocalDate getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}

	public SanPhamThucPham(String maSP, String tenSP, int giaNhap, LocalDate ngaySX, int soLuongTon, LocalDate ngayHH) {
		super(maSP, tenSP, giaNhap, ngaySX, soLuongTon);
		this.ngayHH = ngayHH;
	}

	public SanPhamThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPhamThucPham(String maSP, String tenSP, int giaNhap, LocalDate ngaySX, int soLuongTon) {
		super(maSP, tenSP, giaNhap, ngaySX, soLuongTon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int GiaBan() {
		if(ngayHH.isBefore(LocalDate.now()))
		{
			return 0;
		}
		return getGiaNhap();
	}

	@Override
	public String toString() {
		return "SanPhamThucPham [ngayHH=" + ngayHH + ", maSP=" + maSP + ", tenSP=" + tenSP + ", giaNhap=" + giaNhap
				+ ", ngaySX=" + ngaySX + ", soLuongTon=" + soLuongTon + ", GiaBan()=" + GiaBan() + "]";
	}
	

}
