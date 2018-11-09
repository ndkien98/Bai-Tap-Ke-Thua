package KeThua.Bai2b;

import java.util.Scanner;

public class QuanLySach {
    private Sach[] danhSachCacLoaiSach;
    private int n;
    private int count;
    private double tong;

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public QuanLySach() {
        danhSachCacLoaiSach = new Sach[100];
        count = 0;
    }

    public void themSach() {
        System.out.println("lua chon nhap sach" +
                "1: sach giao khoa" +
                "2: sach tham khao");
        this.n = new Scanner(System.in).nextInt();
        System.out.println("so luong can nhap");
        this.count = new Scanner(System.in).nextInt();
        switch (this.n){
            case 1:
                for (int i = 0; i < count; i++) {
                    danhSachCacLoaiSach[i] = new SachGiaoKhoa();
                    danhSachCacLoaiSach[i].nhapSach();
                }break;
            case 2:
                for (int i = 0; i < count; i++) {
                    danhSachCacLoaiSach[i] = new SachThamKhao();
                    danhSachCacLoaiSach[i].nhapSach();
                }break;
            default: break;
        }

    }


    public void xuatDanhSach(){
        for (int i = 0; i < count; i++) {
            danhSachCacLoaiSach[i].xuatSach();
        }
    }

    public double tinnhTongThanhTienSachGiaoKhoa() {

        for (int i = 0; i < count; i++) {
            this.tong += danhSachCacLoaiSach[i].thanhTien();
        }
        return this.tong;
    }



    public boolean sachCanTim(){
        for (int i = 0; i < count; i++) {
            if (danhSachCacLoaiSach[i].getNhaXuatBan().equals("x")) {
                danhSachCacLoaiSach[i].xuatSach();
            }
        }return false;
    }


}
