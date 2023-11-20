package buoi3;

import java.util.Scanner;
import java.math.BigInteger;

public class Fraction {
    int tuSo;
    int mauSo;

    public Fraction() {

    }
    public Fraction(int tuSo, int mauSo) {

        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tuSo:");
        // Reading a line of text input from the user
         this.tuSo = scanner.nextInt();

        System.out.println("Enter mauSo:");
        // Reading an integer input from the user
        this.mauSo = scanner.nextInt();
    }

    public void inPhanSo() {
        System.out.println(getTuSo()+ "/" + getMauSo());
    }

    public void rutGon() {
        int gcd = 1;
//running loop from 1 to the smallest of both numbers
        int smallerPart = Math.min(this.tuSo, this.mauSo);
        for(int i = smallerPart; i >= 1; i--)
        {
//returns true if both conditions are satisfied
            if(this.tuSo%i==0 && this.mauSo%i==0) {
//storing the variable i in the variable gcd
                gcd = i;
                break;
            }
        }
        this.tuSo /= gcd;
        this.mauSo /= gcd;

    }


    public void nghichDaoPs() {
        int temp = this.mauSo;
        this.mauSo = this.tuSo;
        this.tuSo = temp;

    }

    public Fraction sub(Fraction aFrac) {
        int tuSo = this.tuSo*aFrac.mauSo - aFrac.tuSo*this.mauSo;
        int mauSo = this.mauSo * aFrac.mauSo;
        return new Fraction(tuSo, mauSo);
    }

    public Fraction add(Fraction aFrac) {
        int tuSo = this.tuSo*aFrac.mauSo + aFrac.tuSo*this.mauSo;
        int mauSo = this.mauSo * aFrac.mauSo;

        return new Fraction(tuSo, mauSo);
    }


    public Fraction mul(Fraction aFrac) {
        int tuSo = this.tuSo* aFrac.tuSo;
        int mauSo = this.mauSo * aFrac.mauSo;

        return new Fraction(tuSo, mauSo);
    }

    public Fraction div(Fraction aFrac) {
        Fraction revFrac = new Fraction(aFrac.mauSo, aFrac.tuSo);
        return mul(revFrac);
    }
}
