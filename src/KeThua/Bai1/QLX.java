package KeThua.Bai1;

import java.util.Scanner;

public class QLX {

    private ChuyenXe [] chuyenXes ;
    private int cout;

    public QLX(int n){
        this.cout= n;
        this.chuyenXes = new ChuyenXe[this.cout];
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public void nhap(){
        int n;
        for (int i = 0; i <cout ; i++) {
            System.out.println("Bạn muốn nhập chuyến xe :");
            System.out.println("1 : Ngoại thành ");
            System.out.println("2 : Nội thành ");
            n = new Scanner(System.in).nextInt();
            switch (n){
                case 1 :
                    XeNgoaiThanh xeNgoaiThanh = new XeNgoaiThanh();
                    xeNgoaiThanh.nhap();
                    chuyenXes[i]=xeNgoaiThanh;
                    break;
                case 2 :
                    XeNoiThanh xeNoiThanh = new XeNoiThanh();
                    xeNoiThanh.nhap();
                    chuyenXes[i] = xeNoiThanh;
                    break;
                 default:
                     System.out.println("Bạn nhập số không hợp lệ");
            }
        }
    }

    public void xuat(){
        for (int i=0;i<chuyenXes.length;i++){
            if(chuyenXes[i] instanceof XeNgoaiThanh){
                chuyenXes[i].xuat();
            }else if (chuyenXes[i] instanceof XeNoiThanh){
                chuyenXes[i].xuat();
            }
        }
    }

    public void tinhTongDoanhThu(){
        int n=0,m=0;
        for (int i =0;i<chuyenXes.length;i++){
            if(chuyenXes[i] instanceof  XeNgoaiThanh){
                n+=chuyenXes[i].getDoanhThu();
            }else if(chuyenXes[i] instanceof XeNoiThanh){
                m+=chuyenXes[i].getDoanhThu();
            }
        }
        System.out.println("Tổng doanh thu xe nội thành : "+m);
        System.out.println("Tổng doanh thu xe ngoại thành : "+n);
    }

}
