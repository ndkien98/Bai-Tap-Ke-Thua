package KeThua.Bai3;

import java.util.Scanner;

public class QuanLyGiaoDich {

    private GiaoDich [] giaoDiches;
    private int count;

    public QuanLyGiaoDich(int n){
        this.count=n;
        this.giaoDiches = new GiaoDich[n];
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
/*
    public void nhap(){
        for (int i = 0; i <giaoDiches.length ; i++) {
            System.out.println("loại giao dịch ");
            System.out.println("1 : Giao dịch vàng ");
            System.out.println("2 : Giao dịch tiền tệ");
            int n= new Scanner(System.in).nextInt();
            if (n==1){
                giaoDiches[i] = new GiaoDichVang();
                giaoDiches[i].nhap();
            }else if (n==2){
                giaoDiches[i]=new GiaoDichTienTe();
                giaoDiches[i].nhap();
            }
        }
    }

    public void xuat(){
        for (int i = 0; i <giaoDiches.length ; i++) {
            if(giaoDiches[i] instanceof GiaoDichVang){
                giaoDiches[i].xuat();
            }else if (giaoDiches[i] instanceof GiaoDichTienTe){
                giaoDiches[i].xuat();
            }
        }
    }
*/
public void nhap(){
    for (int i = 0; i <giaoDiches.length ; i++) {
        System.out.println("loại giao dịch ");
        System.out.println("1 : Giao dịch vàng ");
        System.out.println("2 : Giao dịch tiền tệ");
        int n= new Scanner(System.in).nextInt();
        if (n==1){
            GiaoDichVang giaoDichVang = new GiaoDichVang();
            giaoDichVang.nhapGDV();
            giaoDiches[i] = new GiaoDichVang();
            giaoDiches[i]=giaoDichVang;
        }else if (n==2){
            GiaoDichTienTe giaoDichTienTe = new GiaoDichTienTe();
            giaoDichTienTe.nhapGDTT();
            giaoDiches[i]=new GiaoDichTienTe();
            giaoDiches[i]=giaoDichTienTe;
        }
    }
}

    public void xuat(){
        for (GiaoDich g:giaoDiches
             ) {
            if(g instanceof GiaoDichVang){
                ((GiaoDichVang) g).xuatGDV();
            }else if (g instanceof GiaoDichTienTe){
                ((GiaoDichTienTe) g).xuatGDTT();
            }
        }
    }

    public void tongSL(){
    int gdv=0,gdtt=0;
        for (GiaoDich g:giaoDiches
             ) {
            if(g instanceof GiaoDichVang) gdv++;
            else if (g instanceof GiaoDichTienTe )gdtt++;
        }

        System.out.println("Tổng số lượng giao dịch vàng : "+gdv);
        System.out.println("Tổng số lương giao dịch tiền tệ : "+gdtt);
    }

    public void xuatDG(){
        for (GiaoDich g:giaoDiches
             ) {
            if(g.getDonGia()>1000000000){
                g.xuat();
                break;
            }
        }
    }


}
