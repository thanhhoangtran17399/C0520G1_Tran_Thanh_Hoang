package introduction_to_java.bai_tap;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào USD : ");
        usd = scanner.nextInt();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VND : " + quydoi);
    }
}

