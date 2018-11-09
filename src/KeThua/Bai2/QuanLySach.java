package KeThua.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {

    private Book [] books ;
    private int cout ;

    public QuanLySach (int n){
        this.cout=0;
        this.books = new Book[n];
    }

    public void nhap(){
        int n;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Bạn muốn nhập loại sách : ");
            System.out.println("3 : Sách giáo khoa  ");
            System.out.println("4 : Sách tham khảo");
            n = new Scanner(System.in).nextInt();
            switch (n){
                case 3 :
                    books[i]=new SachGiaoKhoa();
                    books[i].nhap();
                    break;
                case 4 :
                    books[i]=new SachThamKhao();
                    books[i].nhap();
                    break;
                default:
                    System.out.println("số nhập không hợp lệ");
            }

        }
    }

    public void xuat(){
        for (int i=0;i<books.length;i++){
            if(books[i] instanceof SachGiaoKhoa){
                books[i].xuat();
            }else if (books[i] instanceof SachThamKhao){
                books[i].xuat();
            }
        }

    }

    public void tinhTongTien(){
        double sgk=0,stk=0;

        for (Book b:books
             ) {
            if(b instanceof SachGiaoKhoa){
                sgk+=((SachGiaoKhoa) b).tinhThanhTien();
            }else if (b instanceof SachThamKhao){
                stk+=((SachThamKhao) b).tinhThanhTien();
            }
        }

        System.out.println("Tổng thành tiền sách giáo khoa : "+sgk);
        System.out.println("Tổng thành tiền sách tham khảo : "+stk);

        }

        public void tinhTBSTK(){
            int n=0,dem=0;
            for (Book b:books
                 ) {
                if(b instanceof SachThamKhao){
                    dem++;
                    n+=((SachThamKhao) b).tinhThanhTien();
                }

                System.out.println("Trung bình cộng đơn giá stk :"+n/dem);
            }
        }

        public void timNXB(String x){
            for (Book b:books
                 ) {
                if(b.getNhaXuatBan().equals(x)){
                    b.xuat();
                    break;
                }
                System.out.println("Không tìm thấy nhà xuất bản ");
            }
        }


/*

    private Book [] books;
    private int count;
    private int n;

    public int getCout() {
        return count;
    }

    public void setCout(int count) {
        this.count = count;
    }

    public QuanLySach (){
        books = new Book[100];
        this.count =0;
    }

    public void themSach() {

        System.out.println("1:sach giao khoa" +
                "2: sach tham khao");
        this.n = new Scanner(System.in).nextInt();
        if (n  == 1) {
            books[count] = new SachGiaoKhoa();
            books[count].nhap();
        } else {
            books[count] = new SachThamKhao();
            books[count].nhap();
        }
    }

    public void nhapSach(){
        for (int i = 0; i <count ; i++) {
            int n = new Scanner(System.in).nextInt();
            if (this.n  == 1) {
                books[count] = new SachGiaoKhoa();
                books[count].nhap();
            } else {
                books[count] = new SachThamKhao();
                books[count].nhap();
            }
        }
    }

    public boolean xuatTheoYeuCau(Book sach){
        for (int i = 0; i < count; i++) {
            if (books[count].getNhaXuatBan().equals("x")){
                return false;
            }
        }
        sach.xuat();
        return true;
    }
*/

/*

    private Book [] books;
    private int count;
    private int n;

    public QuanLySach (){
        this.count=0;
        this.books= new Book[100];
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void nhap(){

        System.out.println("Nhập vào số lượng sách muốn nhập ");
        this.count = new Scanner(System.in).nextInt();
        for (int i = 0; i <count ; i++) {
            System.out.println("Nhập vào loại sách muốn nhập ");
            System.out.println("1 : Sách giáo khoa ");
            System.out.println("2 : Sách tham khảo");
            int n = new Scanner(System.in).nextInt();
            switch (n){
                case 1 :
                    books[i] = new SachGiaoKhoa();
                    books[i].nhap();
            }



        }

    }

/*
    private int count;
    List<Book> bookList ;
    private QuanLySach(){
        bookList = new ArrayList<Book>();
    }

    public void nhap(){
        System.out.println("Nhập vào số sách :");
        count = new Scanner(System.in).nextInt();
        for (Book b:bookList
             ) {
            System.out.println("Nhập vào loại sách muốn nhập");
            System.out.println("1 : Sách giáo khoa ");
            System.out.println("2 : Sách tham khảo ");

            int n = new Scanner(System.in).nextInt();

            switch (n){
                case 1 :
                    b=new SachGiaoKhoa();
                    b.nhap();
                    bookList.add(b);
                case 2 :
                    b= new
        }
        }
    }


    private Book [] books ;
    private int count;

    public QuanLySach(int n){
        this.count=n;
        this.books = new Book[count];
    }

    public void nhap(){
        for (int i = 0; i <books.length ; i++) {
            System.out.println("Nhập vào loại sách muốn nhập");
            System.out.println("1 : Sách giáo khoa ");
            System.out.println("2 : Sách tham khảo ");
            int n = new Scanner(System.in).nextInt();

            switch (n){
                case 1 :
                    books[i]= new SachGiaoKhoa();
                    books[i].nhap();
            }
        }
    }

    public int layChieuDai(){
        return books.length;
    }



*/

}

