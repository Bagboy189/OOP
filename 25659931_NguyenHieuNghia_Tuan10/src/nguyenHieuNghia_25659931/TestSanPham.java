package nguyenHieuNghia_25659931;

import java.time.LocalDate;
import java.util.Scanner;

public class TestSanPham {
	public static void main (String[] args) {
		
		QuanLySP ql = new QuanLySP();
		
		ql.themSanPham(new SanPhamDienTu("001", "Dien thoai", LocalDate.of(2026, 5, 3), 4000000, 50, 360, 0));
		ql.themSanPham(new SanPhamDienTu("002", "May tinh", LocalDate.of(2026, 5, 3), 40000000, 50, 360, 0));
		ql.themSanPham(new SanPhamThucPham("003", "Sua chua", LocalDate.of(2026, 7, 17), 15000, 20, LocalDate.of(2027, 7, 17), 0));
		ql.themSanPham(new SanPhamThucPham("004", "Sua hop", LocalDate.of(2026, 7, 17), 15000, 20, LocalDate.of(2027, 7, 17), 0));
		
		System.out.println(ql);
	}
}
