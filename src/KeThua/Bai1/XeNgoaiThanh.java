package KeThua.Bai1;

import java.util.Scanner;

public class XeNgoaiThanh extends ChuyenXe {

    private String noiDen;
    private int soNgayDiDuoc;

    public XeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XeNgoaiThanh(String id, String tenTX, int soXe, long doanhThu, String noiDen, int soNgayDiDuoc) {
        super(id, tenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XeNgoaiThanh() {
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                '}';
    }

    public void nhap(){
        super.Nhap();
        System.out.println("Nhập nơi đến : ");
        this.noiDen = new Scanner(System.in).nextLine();
        System.out.println("Nhập số ngày đi được ");
        this.soNgayDiDuoc = new Scanner(System.in).nextInt();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Nơi đến :"+this.noiDen);
        System.out.println("Số ngày đi được : "+this.soNgayDiDuoc);
    }

}
