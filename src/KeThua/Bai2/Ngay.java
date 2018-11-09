package KeThua.Bai2;

import java.util.Scanner;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public Ngay() {
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void nhap(){
        System.out.println("Nhập ngày : ");
        this.ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhập tháng :");
        thang = new Scanner(System.in).nextInt();
        System.out.println("Nhập năm :");
        nam = new Scanner(System.in).nextInt();
    }

    public void xuat(){
        System.out.println(this.ngay+"/"+this.thang+"/"+this.nam);
    }

}
