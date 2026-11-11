package nguyenHieuNghia_25659931_58;

import java.time.LocalDate;

public class HangThucPham implements Comparable<HangThucPham> {

    private int id;
    private final String maHang;
    private String tenHang;
    private LocalDate ngaySX;
    private LocalDate ngayHH;
    private double gia;

    private static int demSoLuong = 0;

    public HangThucPham() {
        this.id = ++demSoLuong;
        this.maHang = "MAC_DINH";
        this.tenHang = "Hang mac dinh";
        this.ngaySX = LocalDate.now();
        this.ngayHH = LocalDate.now().plusDays(7);
        this.gia = 1.0;
    }

    public HangThucPham(
            String maHang,
            String tenHang,
            LocalDate ngaySX,
            LocalDate ngayHH,
            double gia) {

        this.id = ++demSoLuong;

        if (maHang == null || maHang.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Ma hang khong duoc de trong!");
        }

        if (tenHang == null || tenHang.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Ten hang khong duoc de trong!");
        }

        if (gia <= 0) {
            throw new IllegalArgumentException(
                    "Gia phai lon hon 0!");
        }

        if (!kiemTraNgaySX(ngaySX)) {
            throw new IllegalArgumentException(
                    "Ngay san xuat khong duoc la ngay tuong lai!");
        }

        if (!kiemTraNgayHH(ngaySX, ngayHH)) {
            throw new IllegalArgumentException(
                    "Ngay het han phai sau ngay san xuat!");
        }

        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.gia = gia;
    }

    private boolean kiemTraNgaySX(LocalDate ngaySX) {
        return ngaySX != null
                && !ngaySX.isAfter(LocalDate.now());
    }

    private boolean kiemTraNgayHH(
            LocalDate ngaySX,
            LocalDate ngayHH) {

        return ngaySX != null
                && ngayHH != null
                && ngayHH.isAfter(ngaySX);
    }

    public int getId() {
        return id;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {

        if (tenHang == null || tenHang.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Ten hang khong duoc rong!");
        }

        this.tenHang = tenHang;
    }

    public LocalDate getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(LocalDate ngaySX) {

        if (!kiemTraNgaySX(ngaySX)) {
            throw new IllegalArgumentException(
                    "Ngay SX khong duoc la ngay tuong lai!");
        }

        if (this.ngayHH != null
                && !kiemTraNgayHH(ngaySX, this.ngayHH)) {

            throw new IllegalArgumentException(
                    "Ngay SX phai truoc ngay HH!");
        }

        this.ngaySX = ngaySX;
    }

    public LocalDate getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(LocalDate ngayHH) {

        if (this.ngaySX == null) {
            throw new IllegalArgumentException(
                    "Chua co ngay SX!");
        }

        if (!kiemTraNgayHH(this.ngaySX, ngayHH)) {
            throw new IllegalArgumentException(
                    "Ngay HH phai sau ngay SX!");
        }

        this.ngayHH = ngayHH;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {

        if (gia <= 0) {
            throw new IllegalArgumentException(
                    "Gia phai lon hon 0!");
        }

        this.gia = gia;
    }

    public boolean kiemTraHH() {

        return LocalDate.now().isAfter(this.ngayHH);
    }

    public String trangThaiChiTiet() {

        LocalDate homNay = LocalDate.now();

        if (homNay.isBefore(ngaySX)) {
            return "Chua san xuat";
        }

        if (homNay.isAfter(ngayHH)) {
            return "Het han";
        }

        if (homNay.isEqual(ngayHH)) {
            return "Het han hom nay";
        }

        long conNgay =
                ngayHH.toEpochDay()
                - homNay.toEpochDay();

        return "Con " + conNgay + " ngay";
    }

    @Override
    public int compareTo(HangThucPham o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {

        return String.format(
                "| %-4d | %-10s | %-18s | %-12s | %-12s | %-10.0f |",
                id,
                maHang,
                tenHang,
                ngaySX,
                ngayHH,
                gia
        );
    }
}
