package xu_li_ngoai_le_va_debug.bai_tap;
import java.util.InputMismatchException;
import java.util.Scanner;
import static xu_li_ngoai_le_va_debug.bai_tap.IllegalTriangleException.checkTriangle;

public class TestIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap canh thu nhat: ");
            int a = scanner.nextInt();
            System.out.println("Nhap canh thu hai: ");
            int b = scanner.nextInt();
            System.out.println("Nhap canh thu ba: ");
            int c = scanner.nextInt();
            checkTriangle(a,b,c);
        }
        catch (InputMismatchException i) {
            System.out.println("sai dinh dang");
        }catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
