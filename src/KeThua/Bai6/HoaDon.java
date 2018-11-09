package KeThua.Bai6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {

    private String id;
    private Date ngay;
    private String tenKhach;
    private String maPhong;
    private double donGia;

    public HoaDon(String id, Date ngay, String tenKhach, String maPhong, double donGia) {
        this.id = id;
        this.ngay = ngay;
        this.tenKhach = tenKhach;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public HoaDon() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        System.out.println("Nhập mã hóa đơn ");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày :");
        String Ngay = new Scanner(System.in).nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.ngay=dateFormat.parse(Ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập tên khách hàng : ");
        this.tenKhach = new Scanner(System.in).nextLine();
        System.out.println("Nhập mã phòng : ");
        this.maPhong = new Scanner(System.in).nextLine();
        System.out.println("Nhập đơn giá :");
        this.donGia = new Scanner(System.in).nextDouble();
    }

    public void xuat(){
        System.out.println("Mã hóa đơn "+this.id);
        System.out.println("Ngày "+this.ngay);
        System.out.println("Tên khách : "+this.tenKhach);
        System.out.println("Mã phòng : "+this.maPhong);
        System.out.println("Đơn giá "+this.donGia);
    }




}

