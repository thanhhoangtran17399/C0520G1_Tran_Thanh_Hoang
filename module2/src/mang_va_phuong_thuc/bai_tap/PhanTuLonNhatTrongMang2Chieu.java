package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class PhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số dòng: ");
        row = input.nextInt();
        System.out.print("Nhập vào số cột: ");
        col = input.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "," + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        int index_i = 0;
        int index_j = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index_i = i;
                    index_j = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: "+ max);
        System.out.println("Nằm ở vị trí arr["+index_i+"]["+index_j+"]");
    }
}
