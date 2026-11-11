package nguyenHieuNghia_25659931_58;

import java.time.LocalDate;

public class QuanLyThucPham {

    private HangThucPham[] danhSach;
    private int soLuong;
    private int khaNang;

    private static final int KICH_THUOC_BAN_DAU = 5;

    public QuanLyThucPham() {
        this.khaNang = KICH_THUOC_BAN_DAU;
        this.danhSach = new HangThucPham[khaNang];
        this.soLuong = 0;
    }

    private void moRongMang() {
        int kichThuocMoi = khaNang * 2;

        HangThucPham[] mangMoi =
            new HangThucPham[kichThuocMoi];

        for (int i = 0; i < soLuong; i++) {
            mangMoi[i] = danhSach[i];
        }

        danhSach = mangMoi;
        khaNang = kichThuocMoi;

        System.out.println(
            "Da mo rong mang len "
            + khaNang
            + " phan tu"
        );
    }

    public int timViTriTheoMa(String maHang) {

        for (int i = 0; i < soLuong; i++) {

            if (danhSach[i]
                    .getMaHang()
                    .equalsIgnoreCase(maHang)) {

                return i;
            }
        }

        return -1;
    }

    public int timViTriTheoID(int id) {

        for (int i = 0; i < soLuong; i++) {

            if (danhSach[i].getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public boolean them(HangThucPham h) {

        if (h == null) {
            System.out.println(
                "Loi: Hang thuc pham khong duoc null!"
            );
            return false;
        }

        if (timViTriTheoMa(h.getMaHang()) != -1) {

            System.out.println(
                "Loi: ma hang '"
                + h.getMaHang()
                + "' da ton tai!"
            );

            return false;
        }

        if (soLuong == khaNang) {
            moRongMang();
        }

        danhSach[soLuong] = h;
        soLuong++;

        return true;
    }

    public boolean xoa(int id) {

        int viTri = timViTriTheoID(id);

        if (viTri == -1) {

            System.out.println(
                "Khong tim thay hang co ID: "
                + id
            );

            return false;
        }

        for (int i = viTri; i < soLuong - 1; i++) {
            danhSach[i] = danhSach[i + 1];
        }

        danhSach[soLuong - 1] = null;
        soLuong--;

        return true;
    }

    public boolean sua(
        int id,
        String tenMoi,
        LocalDate ngaySXMoi,
        LocalDate ngayHHMoi,
        double giaMoi
    ) {

        int viTri = timViTriTheoID(id);

        if (viTri == -1) {

            System.out.println(
                "Khong tim thay hang co ID: "
                + id
            );

            return false;
        }

        HangThucPham h = danhSach[viTri];

        try {
            h.setTenHang(tenMoi);
            h.setNgaySX(ngaySXMoi);
            h.setNgayHH(ngayHHMoi);
            h.setGia(giaMoi);

            return true;

        } catch (IllegalArgumentException e) {

            System.out.println(
                "Loi khi sua: "
                + e.getMessage()
            );

            return false;
        }
    }

    public HangThucPham timTheoId(int id) {

        int viTri = timViTriTheoID(id);

        if (viTri == -1) {
            return null;
        }

        return danhSach[viTri];
    }

    public void sapXepTheoGia(boolean tangDan) {

        for (int i = 0; i < soLuong - 1; i++) {

            for (int j = i + 1; j < soLuong; j++) {

                boolean canDoi;

                if (tangDan) {
                    canDoi =
                        danhSach[i].getGia()
                        > danhSach[j].getGia();
                } else {
                    canDoi =
                        danhSach[i].getGia()
                        < danhSach[j].getGia();
                }

                if (canDoi) {

                    HangThucPham temp = danhSach[i];

                    danhSach[i] = danhSach[j];

                    danhSach[j] = temp;
                }
            }
        }

        System.out.println(
            "Da sap xep theo gia "
            + (tangDan
                ? "tang dan"
                : "giam dan")
        );
    }

    public void sapXepTheoNgaySanXuat(
        boolean tangDan
    ) {

        for (int i = 0; i < soLuong - 1; i++) {

            for (int j = i + 1; j < soLuong; j++) {

                boolean canDoi;

                if (tangDan) {

                    canDoi =
                        danhSach[i]
                            .getNgaySX()
                            .isAfter(
                                danhSach[j].getNgaySX()
                            );

                } else {

                    canDoi =
                        danhSach[i]
                            .getNgaySX()
                            .isBefore(
                                danhSach[j].getNgaySX()
                            );
                }

                if (canDoi) {

                    HangThucPham temp = danhSach[i];

                    danhSach[i] = danhSach[j];

                    danhSach[j] = temp;
                }
            }
        }

        System.out.println(
            "Da sap xep theo ngay SX "
            + (tangDan
                ? "tang dan"
                : "giam dan")
        );
    }

    public void sapXepTheoNgayHetHan(
        boolean tangDan
    ) {

        for (int i = 0; i < soLuong - 1; i++) {

            for (int j = i + 1; j < soLuong; j++) {

                boolean canDoi;

                if (tangDan) {

                    canDoi =
                        danhSach[i]
                            .getNgayHH()
                            .isAfter(
                                danhSach[j].getNgayHH()
                            );

                } else {

                    canDoi =
                        danhSach[i]
                            .getNgayHH()
                            .isBefore(
                                danhSach[j].getNgayHH()
                            );
                }

                if (canDoi) {

                    HangThucPham temp = danhSach[i];

                    danhSach[i] = danhSach[j];

                    danhSach[j] = temp;
                }
            }
        }

        System.out.println(
            "Da sap xep theo ngay HH "
            + (tangDan
                ? "tang dan"
                : "giam dan")
        );
    }

    public QuanLyThucPham timTheoTienTo(
        String tuKhoa
    ) {

        QuanLyThucPham ketQua =
            new QuanLyThucPham();

        if (tuKhoa == null) {
            return ketQua;
        }

        String tk = tuKhoa.toLowerCase();

        for (int i = 0; i < soLuong; i++) {

            if (danhSach[i]
                    .getTenHang()
                    .toLowerCase()
                    .startsWith(tk)) {

                ketQua.them(danhSach[i]);
            }
        }

        return ketQua;
    }

    public QuanLyThucPham timTheoHauTo(
        String tuKhoa
    ) {

        QuanLyThucPham ketQua =
            new QuanLyThucPham();

        if (tuKhoa == null) {
            return ketQua;
        }

        String tk = tuKhoa.toLowerCase();

        for (int i = 0; i < soLuong; i++) {

            if (danhSach[i]
                    .getTenHang()
                    .toLowerCase()
                    .endsWith(tk)) {

                ketQua.them(danhSach[i]);
            }
        }

        return ketQua;
    }

    public QuanLyThucPham timGanGiong(
        String tuKhoa
    ) {

        QuanLyThucPham ketQua =
            new QuanLyThucPham();

        if (tuKhoa == null) {
            return ketQua;
        }

        String tk = tuKhoa.toLowerCase();

        for (int i = 0; i < soLuong; i++) {

            if (danhSach[i]
                    .getTenHang()
                    .toLowerCase()
                    .contains(tk)) {

                ketQua.them(danhSach[i]);
            }
        }

        return ketQua;
    }

    public QuanLyThucPham trichLocTheoNgaySanXuat(
        LocalDate tuNgay,
        LocalDate denNgay
    ) {

        QuanLyThucPham ketQua =
            new QuanLyThucPham();

        if (tuNgay == null || denNgay == null) {
            return ketQua;
        }

        for (int i = 0; i < soLuong; i++) {

            LocalDate ngaySX =
                danhSach[i].getNgaySX();

            if (!ngaySX.isBefore(tuNgay)
                    && !ngaySX.isAfter(denNgay)) {

                ketQua.them(danhSach[i]);
            }
        }

        return ketQua;
    }

    public QuanLyThucPham trichLocTheoNgayHetHan(
        LocalDate tuNgay,
        LocalDate denNgay
    ) {

        QuanLyThucPham ketQua =
            new QuanLyThucPham();

        if (tuNgay == null || denNgay == null) {
            return ketQua;
        }

        for (int i = 0; i < soLuong; i++) {

            LocalDate ngayHH =
                danhSach[i].getNgayHH();

            if (!ngayHH.isBefore(tuNgay)
                    && !ngayHH.isAfter(denNgay)) {

                ketQua.them(danhSach[i]);
            }
        }

        return ketQua;
    }

    public int tinhTongSoLuong() {
        return soLuong;
    }

    public double tinhTongGiaTri() {

        double tong = 0;

        for (int i = 0; i < soLuong; i++) {
            tong += danhSach[i].getGia();
        }

        return tong;
    }

    public void thongKeTheoThang() {

        if (soLuong == 0) {

            System.out.println(
                "Danh sach rong."
            );

            return;
        }

        int[] demTheoThang = new int[13];

        for (int i = 0; i < soLuong; i++) {

            int thang =
                danhSach[i]
                    .getNgaySX()
                    .getMonthValue();

            demTheoThang[thang]++;
        }

        System.out.println(
            "THONG KE SAN PHAM THEO THANG SAN XUAT:"
        );

        for (int t = 1; t <= 12; t++) {

            if (demTheoThang[t] > 0) {

                System.out.println(
                    "Thang "
                    + t
                    + ": "
                    + demTheoThang[t]
                    + " san pham"
                );
            }
        }
    }

    public void hienThiDanhSach() {

        if (soLuong == 0) {

            System.out.println(
                "Danh sach rong."
            );

            return;
        }

        System.out.println(
            "\n+------+------------+--------------------+--------------+--------------+------------+"
        );

        System.out.println(
            "| ID   | Ma hang    | Ten hang           | Ngay SX      | Ngay HH      | Gia        |"
        );

        System.out.println(
            "+------+------------+--------------------+--------------+--------------+------------+"
        );

        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSach[i]);
        }

        System.out.println(
            "+------+------------+--------------------+--------------+--------------+------------+"
        );

        System.out.println(
            "Tong: "
            + soLuong
            + " san pham.\n"
        );
    }

    public int laySoLuong() {
        return soLuong;
    }
}
