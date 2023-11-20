package buoi3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int [5];
        ArrayList  ls =new ArrayList();
        ls.add(1);
        ls.add("hello");
        System.out.println(ls.get(0));
        System.out.println(ls.get(1));
        System.out.println(ls.size());

        ArrayList<Bike> bList = new ArrayList<>();
        Bike b1 = new Bike();
        bList.add(b1);

        bList.add(new Bike());



        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();

        f1.tuSo = 1;
        f1.mauSo = 2;
        f2.tuSo = 5;
        f2.mauSo = 7;

        Fraction f3 = new Fraction(12, 34);

        System.out.println(f1.getTuSo() + "/" + f1.getMauSo());
        System.out.println(f2.getTuSo() + "/" + f2.getMauSo());
        System.out.println(f3.getTuSo() + "/" + f3.getMauSo());
        f3.nghichDaoPs();
        System.out.println(f3.getTuSo() + "/" + f3.getMauSo());
        f3.inPhanSo();
        f3.rutGon();
        f3.inPhanSo();
        f3.rutGon();
        f3.inPhanSo();
        f3.nghichDaoPs();
        f3.inPhanSo();

        Fraction f4 = new Fraction();
        f4.inPhanSo();
        System.out.println(f4.getTuSo());
        f4.setTuSo(5);
        f4.setMauSo(15);
        f4.inPhanSo();
        f4.rutGon();
        f4.inPhanSo();

        f4.inPhanSo();
        f3.inPhanSo();

        Fraction f5 = f4.add(f3);
        f5.inPhanSo();
        f5.rutGon();
        f5.inPhanSo();
    }

    }

