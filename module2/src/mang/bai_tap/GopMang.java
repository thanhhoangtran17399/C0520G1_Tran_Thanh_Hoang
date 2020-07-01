package mang.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size Array 1:");
        size = scanner.nextInt();
        //Nhập giá trị cho các phần tử của mảng
        array1 = new int[size];
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

        int[] array2;
        System.out.print("Enter size Array 2:");
        size = scanner.nextInt();
        //Nhập giá trị cho các phần tử của mảng
        array2 = new int[size];
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
        int array3[];
    }
}
