package KeThua.Bai2b;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sach {
    private int maSach;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;
    private Date ngayNhap;


    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
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

    public Sach() {
        this.maSach = 1;
        this.nhaXuatBan = "";
        this.donGia = 1;
        this.soLuong = 1;
    }

    public Sach (int maSach, String nhaXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void nhapSach() {
        System.out.println("nhap ma sach: ");
        this.maSach = new Scanner(System.in).nextInt();
        System.out.println("nhap so luong sach: ");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("nhap vao nha xuat ban sach: ");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
        System.out.println("nhap vao don gia: ");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("nhap vao ngay nhap: ");
        String ngay = new Scanner(System.in).nextLine();
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            this.ngayNhap = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void xuatSach() {
        System.out.println("ma sach: " +this.maSach);
        System.out.println("so luong: " +this.soLuong);
        System.out.println("nha xua ban: " +this.nhaXuatBan);
        System.out.println("don gia: " +this.donGia);
        System.out.print("ngay nhap: " + this.ngayNhap);

    }

    public double thanhTien() {
        return 0;
    }

}
