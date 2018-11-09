package KeThua.Bai6;

import java.util.Date;
import java.util.Scanner;

public class HDTheoNgay extends HoaDon {

    private int soNgay;

    public HDTheoNgay(String id, Date ngay, String tenKhach, String maPhong, double donGia, int soNgay) {
        super(id, ngay, tenKhach, maPhong, donGia);
        this.soNgay = soNgay;
    }

    public HDTheoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public HDTheoNgay() {
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public void nhapHDTN(){
        super.nhap();
        System.out.println("Nhập số ngày :");
        this.soNgay = new Scanner(System.in).nextInt();
    }

    public void xuatHDTN(){
        super.xuat();
        System.out.println("Số ngày :"+this.soNgay);
    }

    public double thanhTien(){
        if(this.soNgay>7){
            return (7*this.getDonGia())+((this.soNgay-7)*this.getDonGia())*(20/100);
        }
        return this.soNgay*this.getDonGia();
    }
}
