package KeThua.Bai2b;

import java.util.Scanner;

public class SachThamKhao extends Sach{

    private double thue;

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public SachThamKhao() {
    }

    public SachThamKhao(double thue) {
        super();
        this.thue = thue;
    }

    @Override
    public double thanhTien() {
        return (double) (getSoLuong() * getDonGia() + thue);
    }

    @Override
    public void nhapSach() {
        super.nhapSach();
        System.out.println("nhap thue cua sach: ");
        this.thue = new Scanner(System.in).nextDouble();
    }

    @Override
    public void xuatSach() {
        super.xuatSach();
        System.out.println("thue cua sach" + this.thue);
        System.out.println("thanh tien" + this.thanhTien());
    }


}
