package vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 2;
        while (N < 100){
            boolean check = true;
            for (int i = 2; i < N; i++){
                if (N % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N);
            }
            N++;
        }
    }
}
