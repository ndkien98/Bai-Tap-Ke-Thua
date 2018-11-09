package KeThua.Bai2b;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public static final String TINH_TRANG_MOI = "moi";
    public static final String	TINH_TANG_CU = "cu";

    public SachGiaoKhoa() {
    }

    @Override
    public double thanhTien() {
        if (TINH_TRANG_MOI.equalsIgnoreCase(tinhTrang)) {
            return getSoLuong() * getDonGia();
        }
        return (double) (getDonGia() * getSoLuong() * 0.5);
    }


    @Override
    public void nhapSach() {
        super.nhapSach();
        System.out.println("tinh trang sach");
        this.tinhTrang = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuatSach() {
        super.xuatSach();
        System.out.println("tinh trang" + this.tinhTrang);
        System.out.println("thanh tien" + this.thanhTien());
    }
}
