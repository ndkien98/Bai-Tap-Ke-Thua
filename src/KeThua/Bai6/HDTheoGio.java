package KeThua.Bai6;

import java.util.Date;
import java.util.Scanner;

public class HDTheoGio extends HoaDon {

    private int soGio;

    public HDTheoGio(String id, Date ngay, String tenKhach, String maPhong, double donGia, int soGio) {
        super(id, ngay, tenKhach, maPhong, donGia);
        this.soGio = soGio;
    }

    public HDTheoGio(int soGio) {
        this.soGio = soGio;
    }

    public HDTheoGio() {
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    public void nhapHDTGG(){
        super.nhap();
        System.out.println("Nhập số giờ : ");
        this.soGio = new Scanner(System.in).nextInt();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Số giờ : "+this.soGio);
    }

    public double thanhTien(){
        if(this.soGio>24 && this.soGio<30){
            return 24*this.getDonGia();
        }else if (this.soGio>30) {
            System.out.println("Chuyển sang hóa đơn ngày ");
            return 0;
        }
        return this.soGio*this.getDonGia();
    }



}
