package vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " khong phai la so nguyen to!");
        }
        else {
            boolean check = true;
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number + " la so nguyen to");
            }
            else {
                System.out.println(number + " khong phai la so nguyen to");
            }
        }
    }
}
