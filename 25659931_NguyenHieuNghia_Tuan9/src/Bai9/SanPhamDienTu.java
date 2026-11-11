package buiquangChanh;
import java.time.LocalDate;

public class SanPhamDienTu extends SanPham{
	private int thoigianBH;
	
	public int getThoigianBH() {
		return thoigianBH;
	}

	public void setThoigianBH(int thoigianBH) {
		this.thoigianBH = thoigianBH;
	}


	public SanPhamDienTu(String maSP, String tenSP, int giaNhap, LocalDate ngaySX, int soLuongTon, int thoigianBH) {
		super(maSP, tenSP, giaNhap, ngaySX, soLuongTon);
		this.thoigianBH = thoigianBH;
	}

	@Override
	public int GiaBan() {
		return getGiaNhap()+((getGiaNhap()*10)/100)+getThoigianBH()*50000;
	}

	@Override
	public String toString() {
		return "SanPhamDienTu [thoigianBH=" + thoigianBH + ", maSP=" + maSP + ", tenSP=" + tenSP + ", giaNhap="
				+ giaNhap + ", ngaySX=" + ngaySX + ", soLuongTon=" + soLuongTon + ", GiaBan()=" + GiaBan() + "]";
	}
	

}
