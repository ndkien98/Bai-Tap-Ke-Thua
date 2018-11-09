package KeThua.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nhập vào số xe : ");
        int n = new Scanner(System.in).nextInt();
        QLX qlx =new QLX(n);

        qlx.nhap();
        qlx.xuat();
        qlx.tinhTongDoanhThu();

      /*  XeNoiThanh xeNoiThanh =new XeNoiThanh();
        xeNoiThanh.nhap();
        xeNoiThanh.xuat();

        XeNgoaiThanh xeNgoaiThanh = new XeNgoaiThanh();
        xeNgoaiThanh.nhap();
        xeNgoaiThanh.xuat();
        */
    }

}
