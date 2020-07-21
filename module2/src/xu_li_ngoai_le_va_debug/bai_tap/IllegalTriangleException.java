package xu_li_ngoai_le_va_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Mot trong cac gia tri a, b, c ban vua nha nho hon 0");
        } else if (a + b < c && a + c < b && b + c < a) {
            throw new IllegalTriangleException("Tong 2 canh da bi nho hon canh con lai");
        } else {
            System.out.println("Ban da nhap thanh cong");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap canh thu nhat: ");
            int a = scanner.nextInt();
            System.out.println("Nhap canh thu hai: ");
            int b = scanner.nextInt();
            System.out.println("Nhap canh thu ba: ");
            int c = scanner.nextInt();
            Triangle(a,b,c);
        }
        catch (InputMismatchException i) {
            System.out.println("sai dinh dang");
        }catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
