package KeThua.Bai4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {

    private String id;
    private Date ngayGD;
    private double donGia;

    public GiaoDich(String id, Date ngayGD, double donGia) {
        this.id = id;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
    }

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

    public void nhap(){
        System.out.println("Nhập mã giao dịch :");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày :");
        String ngay = new Scanner(System.in).nextLine();

        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.ngayGD = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập đơn giá :");
        this.donGia = new Scanner(System.in).nextDouble();
    }

    public void xuat(){
        System.out.println("Mã giao dịch "+id);
        System.out.println("Ngày giao dịch "+ngayGD);
        System.out.println("Đơn giá : "+donGia);
    }


}
