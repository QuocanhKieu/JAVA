package buoi4;

import java.util.ArrayList;

public class GiaoVien extends Person{
    ArrayList<String> dsLopDay = new ArrayList<>();
    float luong;

    int soMon;
    ArrayList<String> dsMonDay  = new ArrayList<>();

    public GiaoVien(ArrayList<String> dsLopDay, float luong, int soMon, ArrayList<String> dsMonDay) {
        this.dsLopDay = dsLopDay;
        this.luong = luong;
        this.soMon = soMon;
        this.dsMonDay = dsMonDay;
    }

    public GiaoVien(String ten, String gioiTinh, String ngaySinh, String diaChi, ArrayList<String> dsLopDay, float luong, int soMon, ArrayList<String> dsMonDay) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.dsLopDay = dsLopDay;
        this.luong = luong;
        this.soMon = soMon;
        this.dsMonDay = dsMonDay;
    }

    public GiaoVien() {};

    public ArrayList<String> getDsLopDay() {
        return dsLopDay;
    }

    public void setDsLopDay(ArrayList<String> dsLopDay) {
        this.dsLopDay = dsLopDay;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getSoMon() {
        return soMon;
    }

    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }

    public ArrayList<String> getDsMonDay() {
        return dsMonDay;
    }

    public void setDsMonDay(ArrayList<String> dsMonDay) {
        this.dsMonDay = dsMonDay;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập các chuỗi (nhập 'done' để kết thúc):");


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("done")) {
                break;
            }

            dsLopDay.add(input);
        }

    }
}
