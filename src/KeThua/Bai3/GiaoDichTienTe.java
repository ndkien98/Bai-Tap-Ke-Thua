package KeThua.Bai3;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {

    private int LoaiTien;
    private double tiGia;

    public GiaoDichTienTe(int loaiTien, double tiGia) {
        LoaiTien = loaiTien;
        this.tiGia = tiGia;
    }

    public GiaoDichTienTe(String id, Date ngayGD, double donGia, int soLuong, int loaiTien, double tiGia) {
        super(id, ngayGD, donGia, soLuong);
        LoaiTien = loaiTien;
        this.tiGia = tiGia;
    }

    public GiaoDichTienTe() {
    }

    public int getLoaiTien() {
        return LoaiTien;
    }

    public void setLoaiTien(int loaiTien) {
        LoaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public void nhapGDTT(){
        super.nhap();
        System.out.println("Nhập loại giao dịch tiền  : ");
        System.out.println("1 : USD");
        System.out.println("2 : Euro");
        System.out.println("3 : VNĐ");
        this.LoaiTien = new Scanner(System.in).nextInt();
        System.out.println("Nhập tỷ giá : ");
        this.tiGia = new Scanner(System.in).nextDouble();
    }

    public void xuatGDTT(){
        super.xuat();
        if (this.LoaiTien==1){
            System.out.println("Giao dịch tiền USD");
        }else if (this.LoaiTien==2){
            System.out.println("Giao dịch tiền Euro");
        }else if (this.LoaiTien==3){
            System.out.println("Giao dịch tiền VNĐ");
        }
        System.out.println("Tỷ giá : "+this.tiGia);
    }

    public double thanhTienGDT() {
        if (this.LoaiTien == 1 || this.LoaiTien == 2) {
            return this.getSoLuong() * this.getDonGia() * this.tiGia;
        } else
            return this.getSoLuong() * this.getDonGia();
    }




}
