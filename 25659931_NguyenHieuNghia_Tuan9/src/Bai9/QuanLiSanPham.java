package buiquangChanh;

import java.util.ArrayList;

public class QuanLiSanPham {
	ArrayList<SanPham> ds;
	private SanPham kq;

	public ArrayList<SanPham> getDs() {
		return ds;
	}

	public void setDs(ArrayList<SanPham> ds) {
		this.ds = ds;
	}
	
	public QuanLiSanPham()
	{
		ds=new ArrayList<SanPham>(2);
	}
	public boolean themSP(SanPham p )
	{
		if(p==null)
			return false;
		for(SanPham sp: ds)
		{
			if(sp.maSP.equalsIgnoreCase(p.maSP))
				return false;
		}
		ds.add(p);
		return true;
	}
	public  boolean xoaSP(String maSP)
	{
		for(SanPham sp: ds)
		{
			if(sp.maSP.equalsIgnoreCase(maSP))
			{
				ds.remove(sp);
				return true ;
			}
		}
		return false;
	}
	public boolean suaSoLuongTon(String maSP, int soLuongMoi)
	{
		for(SanPham sp: ds)
		{
			if(sp.maSP.equalsIgnoreCase(maSP))
			{
				sp.setSoLuongTon(soLuongMoi);
				return true;
			}
		}
		return false ; 
		
	}
	public void xuatSanPhamTheoLoai(String loai)
	{
		if(loai == "SanPhamThucPham")
		{
		for (SanPham sp: ds)
		{
			if(sp instanceof SanPhamThucPham)
			{
				System.out.println(sp);
			}
		}
		}
		if(loai == "SanPhamDienTu")
		{
		for (SanPham sp: ds)
		{
			if(sp instanceof SanPhamDienTu)
			{
				System.out.println(sp);
			}
		}
		}
	}
	public void SanPhamGiaCaoNhat()
	{
		kq = null;
		for (SanPham sp: ds)
		{
			if(sp.GiaBan()>kq.GiaBan())
			{
				sp=kq;
			}
		}
		System.out.println(kq);
	}

	@Override
	public String toString() {
		return "QuanLiSanPham [ds=" + ds + ", kq=" + kq + ", getDs()=" + getDs() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
