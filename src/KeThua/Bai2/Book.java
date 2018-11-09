package KeThua.Bai2;

import java.util.Scanner;

public class Book {
    private String maSach;
    private Ngay ngayNhap = new Ngay();
    private double donGia;
    private int soLuong;
    private String  nhaXuatBan;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Ngay getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Ngay ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public Book() {
    }

    public Book(String maSach, Ngay ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public void nhap(){
        System.out.println("Nhập mã sách : ");
        this.maSach = new Scanner(System.in).nextLine();
        System.out.println("Ngày nhập sách :");
        ngayNhap.nhap();
        System.out.println("Nhập đơn giá :");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập số lượng : ");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhà xuất bản : ");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
    }

    public void xuat(){
        System.out.println("Mã sách : "+this.maSach);
        ngayNhap.xuat();
        System.out.println("Đơn giá :"+this.donGia);
        System.out.println("Số lượng : "+this.soLuong);
        System.out.println("Nhà xuất bản : "+this.nhaXuatBan);
    }



}
