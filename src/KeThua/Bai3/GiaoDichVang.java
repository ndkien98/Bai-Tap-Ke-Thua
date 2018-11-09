package KeThua.Bai3;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {

    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang() {
    }

    public GiaoDichVang(String id, Date ngayGD, double donGia, int soLuong ,String loaiVang) {
        super(id, ngayGD, donGia, soLuong);
        this.loaiVang=loaiVang;
    }

    public void nhapGDV(){
        super.nhap();
        System.out.println("Nhập loại vàng :");
        this.loaiVang = new Scanner(System.in).nextLine();
    }

    public void xuatGDV(){
        super.xuat();
        System.out.println("Loại vàng :"+loaiVang);
    }

    public double thanhTienGDV(){
        return this.getSoLuong()*this.getDonGia();
    }

}
