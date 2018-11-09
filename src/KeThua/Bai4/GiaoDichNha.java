package KeThua.Bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    private int loaiNha;
    private String diaChi;
    private float dienTich;

    public GiaoDichNha(String id, Date ngayGD, double donGia, int loaiNha, String diaChi, float dienTich) {
        super(id, ngayGD, donGia);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }

    public GiaoDichNha(int loaiNha, String diaChi, float dienTich) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }

    public GiaoDichNha() {
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapGDN(){
        super.nhap();
        System.out.println("Nhập loại nhà : ");
        System.out.println("1 : Cao cấp ");
        System.out.println("2 : Thường");
        System.out.println("Nhập địa chỉ ");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.println("Nhập diện tích ");
        this.dienTich = new Scanner(System.in).nextFloat();
    }

    public void xuatGDN(){
        super.xuat();
        if(this.loaiNha==1){
            System.out.println("Loại nhà cao cấp");
        }else System.out.println("Loại nhà thường");
        System.out.println("Địa chỉ "+diaChi);
        System.out.println("Diện tích "+dienTich);
    }

    public double thanhTien(){
        if (this.loaiNha==1) return this.dienTich*this.getDonGia();
        return this.dienTich*this.getDonGia()*(90/100);
    }



}
