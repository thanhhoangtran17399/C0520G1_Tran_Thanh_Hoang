package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[] array1;
        int[] array2;
        int cout = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size Array 1:");
        size1 = scanner.nextInt();
        //Nhập giá trị cho các phần tử của mảng
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        //In mảng đã nhập
        System.out.println("Property list: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }

        System.out.print("Enter size Array 2:");
        size2 = scanner.nextInt();
        //Nhập giá trị cho các phần tử của mảng
        array2 = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element" + (j + 1) + " : ");
            array2[j] = scanner.nextInt();
            j++;
        }

        System.out.println("Property list: ");
        for (int k = 0; k < array2.length; k++) {
            System.out.print(array2[k] + "\t");
        }
        int array3[] = new int[size1 + size2];
        for (i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (j = array1.length; j < array3.length; j++, cout++) {
            array3[j] = array2[cout];
        }
        System.out.println("Property list: ");
        for (int k = 0; k < array3.length; k++) {
            System.out.print(array3[k] + "\t");
        }
    }
}
