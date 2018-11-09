package KeThua.Bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {

    private String id;
    private Date ngayGD;
    private double donGia;
    private int soLuong;


    public GiaoDich() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
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

    public GiaoDich(String id, Date ngayGD, double donGia, int soLuong) {
        this.id = id;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void nhap(){
        System.out.println("Nhập id :");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào ngày nhập :");
        String ngay = new Scanner(System.in).nextLine();
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            this.ngayGD = dateFormat.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập vào đơn giá :");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập số lượng :");
        this.soLuong = new Scanner(System.in).nextInt();

    }

    public void xuat(){
        System.out.println("Mã giao dịch :"+id);
        System.out.println("ngày giao dịch : "+ngayGD);
        System.out.println("Đơn giá :"+donGia);
        System.out.println("Số lượng :"+soLuong);
    }


}
