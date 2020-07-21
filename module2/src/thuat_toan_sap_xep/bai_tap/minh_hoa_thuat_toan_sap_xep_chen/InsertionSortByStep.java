package thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    private void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int k;
            int curentElement = list[i];
            for (k = i - 1; k >= 0 && list[k] > curentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = curentElement;
            System.out.println("Insert " + list[k + 1]);
            System.out.println("");
            System.out.print("List after the  " + i + "' sort: ");
            for (int value : list) {
                System.out.print(value + "\t");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("\n");
        InsertionSortByStep insertionSort = new InsertionSortByStep();
        insertionSort.insertionSortByStep(list);
    }
}
