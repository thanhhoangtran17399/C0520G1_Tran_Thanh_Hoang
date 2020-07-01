package introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập vào năm cần kiểm tra: ");
        year = scanner.nextInt();
        boolean laNamNhuan = false;
        boolean laSoChiaHetCho4 = year % 4 == 0;
        if(laSoChiaHetCho4){
            boolean laSoChiaHetCho100 = year % 100 == 0;
            if(laSoChiaHetCho100){
                boolean laSoChiaHetCho400 = year % 400 == 0;
                if(laSoChiaHetCho400){
                    laNamNhuan = true;
                }
            } else {
                laNamNhuan = true;
            }
        }
        if(laNamNhuan){
            System.out.printf("%d là năm nhuận", year);
        } else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
