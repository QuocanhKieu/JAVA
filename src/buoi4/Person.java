package buoi4;
import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    String ten;
    String gioiTinh;

    String ngaySinh;

    String diaChi;

    public Person() {

    }
    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin() {
        System.out.println("Nhập tên của bạn:");
        this.setTen(scanner.nextLine());
        System.out.println("Nhập giới tính của bạn:");
        this.setGioiTinh(scanner.nextLine());
        System.out.println("Nhập ngày sinh của bạn:");
        this.setNgaySinh(scanner.nextLine());
        System.out.println("Nhập dia chi của bạn:");
        this.setDiaChi(scanner.nextLine());
    }

    public void inThongTin() {
        System.out.println(this.getTen());
        System.out.println(this.getGioiTinh());
        System.out.println(this.getNgaySinh());
        System.out.println(this.getDiaChi());
    }
}
