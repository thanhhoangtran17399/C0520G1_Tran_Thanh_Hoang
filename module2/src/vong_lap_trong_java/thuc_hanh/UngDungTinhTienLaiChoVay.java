package vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        System.out.println("Nhap so tien gui");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang gui");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat:");
        interset_rate = scanner.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
