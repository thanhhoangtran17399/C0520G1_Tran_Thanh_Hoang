package mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In mảng đã nhập
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        // Duyệt các phần tử trong mảng để tìm GTNN và vị trí
        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j ;
            }
        }
        System.out.println("The largest property value in the list is " + min + " ,at position " + index);
    }
}
