package KeThua.Bai1;

import java.util.Scanner;

public class XeNoiThanh extends ChuyenXe {

    private int soTuyen;
    private int soKmDaDi;

    public XeNoiThanh(int soTuyen, int soKmDaDi) {
        this.soTuyen = soTuyen;
        this.soKmDaDi = soKmDaDi;
    }

    public XeNoiThanh(String id, String tenTX, int soXe, long doanhThu, int soTuyen, int soKmDaDi) {
        super(id, tenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDaDi = soKmDaDi;
    }

    public XeNoiThanh() {
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDaDi() {
        return soKmDaDi;
    }

    public void setSoKmDaDi(int soKmDaDi) {
        this.soKmDaDi = soKmDaDi;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" +
                "soTuyen=" + soTuyen +
                ", soKmDaDi=" + soKmDaDi +
                '}';
    }

    public void nhap(){
        super.Nhap();
        System.out.println("Nhập số tuyến : ");
        this.soTuyen = new Scanner(System.in).nextInt();
        System.out.println("Nhập số km đi được :");
        this.soKmDaDi = new Scanner(System.in).nextInt();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Số tuyến : "+this.soTuyen);
        System.out.println("Số km đã đi : "+this.soKmDaDi);
    }


}
