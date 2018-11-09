package KeThua.Bai1;

import java.util.Scanner;

public class ChuyenXe {
    private String id;
    private String tenTX;
    private int soXe;
    private long doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String id, String tenTX, int soXe, long doanhThu) {
        this.id = id;
        this.tenTX = tenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenTX() {
        return tenTX;
    }

    public void setTenTX(String tenTX) {
        this.tenTX = tenTX;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "id='" + id + '\'' +
                ", tenTX='" + tenTX + '\'' +
                ", soXe=" + soXe +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public void Nhap(){
        System.out.println("Nhập mã chuyến xe : ");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tài xế : ");
        this.tenTX = new Scanner(System.in).nextLine();
        System.out.println("Nhập số xe :");
        this.soXe = new Scanner(System.in).nextInt();
        System.out.println("Nhập doanh thu : ");
        this.doanhThu = new Scanner(System.in).nextLong();

    }

    public void xuat(){
        System.out.println("Mã xe :"+this.id);
        System.out.println("Tên tài xế : "+this.tenTX);
        System.out.println("Số xe :"+this.soXe);
        System.out.println("Doanh thu :"+this.doanhThu);
    }


}
