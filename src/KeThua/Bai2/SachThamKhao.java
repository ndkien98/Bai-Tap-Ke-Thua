package KeThua.Bai2;

import java.util.Scanner;

public class SachThamKhao extends Book {
    private int thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, Ngay ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập % thuế : ");
        this.thue = new Scanner(System.in).nextInt();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Thuế : "+this.thue+"%");
    }

    public double tinhThanhTien(){
        return this.getSoLuong()*this.getDonGia()*((this.getDonGia()*this.thue)/100);
    }

}
