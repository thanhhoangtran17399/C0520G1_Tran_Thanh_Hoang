package mang.bai_tap;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int x;
        int dai = arr.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa");
        x = scanner.nextInt();
        for (int i = 0; i < dai; i++) {
            if (x == arr[i]) {
                for (int j = i; j < dai-1; j++) {
                    //do dai mang moi bang mang cu -1
                    arr[j] = arr[j + 1];

                }
            }
        }
        for (int j = 0; j < dai-1;j++){
            System.out.print(arr[j] + "\t");
        }
    }
}
