package KeThua.Bai2;

import java.util.Scanner;

public class SachGiaoKhoa extends Book {

    private int tinhTrang ;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, Ngay ngayNhap, long donGia, int soLuong, String nhaXuatBan) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void nhap(){
        super.nhap();
        do {
            System.out.println("Nhập tình trạng : ");
            System.out.println("1 :cũ ");
            System.out.println("2 : mới");
            this.tinhTrang = new Scanner(System.in).nextInt();
        }while (this.tinhTrang<0&&this.tinhTrang>2);

    }

    public void xuat(){
        super.xuat();
        if(this.tinhTrang==1){
            System.out.println("Tình trạng sách : cũ ");
        }else
            System.out.println("Tình trạng sách : mới");
    }

    public double tinhThanhTien(){
        double tt=1;
        if (this.tinhTrang==1){
            tt=this.getSoLuong()*this.getDonGia();
        }else if (this.tinhTrang==2){
            tt=(this.getSoLuong()*this.getDonGia())/2;
        }
        return tt;
    }



}
