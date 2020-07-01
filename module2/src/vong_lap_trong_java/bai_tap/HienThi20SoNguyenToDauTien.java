package vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        int count = 0;
        int N = 2;
        System.out.println("Nhap vao so luong so nguyen to can hien thi");
        numbers = scanner.nextInt();
        while (count < numbers){
            boolean check = true;
            for (int i = 2; i < N; i++){
                if (N % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
