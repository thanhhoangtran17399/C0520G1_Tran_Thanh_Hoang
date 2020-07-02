package mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;

//CHƯA LÀM XONG
public class ThemMotPhanTuVaoMang {
    public static void main(String[] args) {
            int[] array = {10, 9, 8, 7, 6,0};
            Scanner arr = new Scanner(System.in);
            System.out.print("Nhap vao phan tu muon them :");
            int numb = arr.nextInt();
            System.out.print("Nhap vao chi so:");
            int index = arr.nextInt();
            if (index <= 1 || index > array.length) {
                System.out.println("Khong them duoc phan tu vao mang.");
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