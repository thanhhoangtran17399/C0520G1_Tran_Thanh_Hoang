package mang.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
public class ThemMotPhanTuVaoMang {
    public static void main(String[] args) {
            int[] array = {10, 9, 8, 7, 6,0};
            Scanner arr = new Scanner(System.in);
            System.out.print("Nhap vao phan tu can them:");
            int numb = arr.nextInt();
            System.out.print("Nhap vi tri:");
            int index = arr.nextInt();
            if (index <= 1 || index > array.length) {
                System.out.println("Khong chen duoc phan tu");
            } else {
                for (int i = array.length - 2; i >= index; i--) {
                    array[i + 1] = array[i];
                }
                array[index] = numb;
            }
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i] + "\t");
        }
        }
    }