package xu_li_ngoai_le_va_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Mot trong cac gia tri a, b, c ban vua nha nho hon 0");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Tong 2 canh bat ky da bi nho hon canh con lai");
        } else {
            System.out.println("Ban da nhap thanh cong");
        }
    }
}
