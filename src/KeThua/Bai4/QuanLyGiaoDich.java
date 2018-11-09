package KeThua.Bai4;

import KeThua.Bai1.QLX;

import java.util.Scanner;

public class QuanLyGiaoDich {
    private GiaoDich []giaoDichs;
    private int count;
    private int tongGDD=0;
    private int tongGDN=0;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public QuanLyGiaoDich(int n){
        this.count=n;
        this.giaoDichs = new GiaoDich[this.count];
    }

    public void nhap(){
        for (int i = 0; i <giaoDichs.length ; i++) {
            System.out.println("Nhập vào loại giao dịch :");
            System.out.println("1 : giao dịch đất");
            System.out.println("2 : giao dịch nhà ");
            int n = new Scanner(System.in).nextInt();
            if(n==1){
                GiaoDichDat giaoDichDat = new GiaoDichDat();
                giaoDichDat.nhapGDD();
                giaoDichs[i] = new GiaoDichDat();
                giaoDichs[i]=giaoDichDat;
            }else if (n==2){
                GiaoDichNha giaoDichNha = new GiaoDichNha();
                giaoDichNha.nhapGDN();
                giaoDichs[i] = new GiaoDichNha();
                giaoDichs[i] = giaoDichNha;
            }
        }
    }

    public void xuat(){
        for (GiaoDich g:giaoDichs
             ) {
            if(g instanceof GiaoDichDat){
                ((GiaoDichDat) g).xuatGDD();
            }else if (g instanceof GiaoDichNha){
                ((GiaoDichNha) g).xuatGDN();
            }
        }
    }

    public void tongSoGD(){
        for (GiaoDich g:giaoDichs
             ) {
            if(g instanceof GiaoDichDat){
                tongGDD++;
            }else if (g instanceof GiaoDichNha){
                tongGDN++;
            }
        }
    }




}
