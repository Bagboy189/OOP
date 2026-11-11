package bai9;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		QuanLiSanPham ql= new QuanLiSanPham();
		ql.themSP(new SanPhamThucPham("TP01","Rau",5000, LocalDate.of(2026, 3, 10),5,LocalDate.of(2026, 5, 13)));
		ql.themSP(new SanPhamThucPham("TP02","Thit",15000, LocalDate.of(2026, 3, 10),5,LocalDate.of(2026, 5, 13)));
		ql.themSP(new SanPhamThucPham("TP01","Trung",3000, LocalDate.of(2026, 3, 10),5,LocalDate.of(2026, 5, 13)));
		ql.themSP(new SanPhamDienTu("DT01","DienThoai",15000000, LocalDate.of(2026, 3, 10),5,5));
		ql.themSP(new SanPhamDienTu("DT02","MayTinh",25000000, LocalDate.of(2026, 3, 10),5,5));
		System.out.println("===DanhSachSanPham===");
		System.out.println(ql);
		System.out.println("===XoaSP===");
		ql.xoaSP("TP01");
		System.out.println(ql);
		System.out.println("===SuaSoLuongTon");
		ql.suaSoLuongTon("TP02", 10);
	}

}
