package lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;
public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2 co dang: ax^2 + bx + c = 0");
        System.out.println("Nhap vao a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao b:");
        double b = scanner.nextDouble();
        System.out.println("Nhap vao c:");
        double c = scanner.nextDouble();
        GiaiPhuongTrinhBacHai giaiPhuongTrinhBacHai = new GiaiPhuongTrinhBacHai(a,b,c);
        System.out.println("Gia tri a, b, c ban vua nhap: " + giaiPhuongTrinhBacHai.getA()+", " + giaiPhuongTrinhBacHai.getB()+", "+giaiPhuongTrinhBacHai.getC());
        System.out.println("Delta = "+giaiPhuongTrinhBacHai.getDelta());
        if (giaiPhuongTrinhBacHai.getDelta()>0){
            System.out.println("Phuong trinh co 2 nghiem: "+giaiPhuongTrinhBacHai.getX1()+","+giaiPhuongTrinhBacHai.getX2());
        }
        else if (giaiPhuongTrinhBacHai.getDelta()==0){
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+giaiPhuongTrinhBacHai.getNghiemKep());
        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}

class GiaiPhuongTrinhBacHai {
    double a, b, c;

    public GiaiPhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getX1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double getX2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
    public double getNghiemKep(){
        return -b/(2*a);
    }
}
