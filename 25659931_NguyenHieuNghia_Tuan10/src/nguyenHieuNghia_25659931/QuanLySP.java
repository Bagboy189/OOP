package nguyenHieuNghia_25659931;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class QuanLySP {
	List<SanPham> ql;
	public QuanLySP() {
		ql = new ArrayList<>();
	}
	
	
	public List<SanPham> getQl() {
		return new ArrayList<SanPham>(ql);
	}


	public SanPham timTheoMa(String ma) {
		for (SanPham sp : ql) {
			if(sp.getMaSp().equalsIgnoreCase(ma)) {
				return sp;
			}
		}
		return null;
	}
	
	public boolean themSanPham(SanPham sp) {
		if (sp == null) {
			return false;
		}
		if (timTheoMa(sp.getMaSp()) != null) {
			return false;
		}
		return ql.add(sp);
	}
	
	public boolean xoaSanPham(String ma) {
			SanPham p = timTheoMa(ma);
			if (p==null) {
				return false;
			}
			return ql.remove(p);
	}
	
	public boolean suaSoLuongTon(String ma, int sl) {
		SanPham p =timTheoMa(ma);
		if (p==null) {
			return false;
		}
		p.setSoLuong(sl);
		return true;
		
	}
	
	public void xuatSanPhamTheoLoai(String loai) {
		if (ql.isEmpty()) {
			return;
		}
		
		for (SanPham sp : ql) {
			if (sp.loaiSP().equalsIgnoreCase(loai)) {
				System.out.println(sp);
			}
		}
	}
	
	public void xuatSanPhamGiaBanCaoNhat() {
		double max = 0;
		SanPham e = null;
		if (ql.isEmpty()) {
			return;
		}
		for (SanPham sp : ql) {
			if (sp.getGia() > max) {
				max = sp.getGia();
				e = sp;
			}
		}
		System.out.println(e);
	}
}
