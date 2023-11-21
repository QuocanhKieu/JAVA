package buoi4;

import java.util.Scanner;

public class Student  extends Person{
    int maSV;
    int diemThi;
    String email;

    public Student(int maSV, int diemThi, String email) {
        this.maSV = maSV;
        this.diemThi = diemThi;
        this.email = email;
    }

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, int maSV, int diemThi, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSV = maSV;
        this.diemThi = diemThi;
        this.email = email;
    }

    public Student() {

    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public int getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap Ma So Sinh Vien");
        this.setMaSV(scanner.nextInt());
        System.out.println("Nhap Diem Thi Sinh Vien");
        this.setDiemThi(scanner.nextInt());
        System.out.println("Nhap Email Sinh Vien");
        this.setEmail(scanner.nextLine());
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(this.getMaSV());
        System.out.println(this.getDiemThi());
        System.out.println(this.getEmail());
    }

    public boolean isHocBong() {
        return this.getDiemThi()>=8.0;
    }
}
