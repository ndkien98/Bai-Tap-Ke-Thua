package KeThua.Bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {

    private int loaiDat;
    private float dienTich;

    public GiaoDichDat(String id, Date ngayGD, double donGia, int loaiDat, float dienTich) {
        super(id, ngayGD, donGia);
        this.loaiDat = loaiDat;
        this.dienTich = dienTich;
    }

    public GiaoDichDat(int loaiDat, float dienTich) {
        this.loaiDat = loaiDat;
        this.dienTich = dienTich;
    }

    public GiaoDichDat() {
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapGDD(){
        super.nhap();
        System.out.println("Lại đất :");
        System.out.println("1 :A");
        System.out.println("2 :B");
        System.out.println("3 :C");
        this.loaiDat = new Scanner(System.in).nextInt();
        System.out.println("Nhập diện tích :");
        this.dienTich = new Scanner(System.in).nextInt();
    }

    public void xuatGDD(){
        super.xuat();
        if(this.loaiDat==1){
            System.out.println("Loại đất "+"A");
        }else if (this.loaiDat==2){
            System.out.println("Loại đất B");

        }else if (this.loaiDat==3){
            System.out.println("Loại đất C");
        }
        System.out.println("Diện tích :"+this.dienTich);
    }

    public double thanhTien(){
        if(this.loaiDat ==1) return this.dienTich*this.getDonGia()*1.5;
        else return this.dienTich*this.getDonGia();
    }



}

