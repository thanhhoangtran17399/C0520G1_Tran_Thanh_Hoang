package introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn hiển thị số ngày của tháng nào? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (daysInMonth != "") System.out.print("Tháng " + month +  " có " + daysInMonth + " ngày");
        else System.out.print("Tháng bạn nhập không hợp lệ");
    }
}
