package thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -1, 3, 14, 12};

    private static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int temp = -1;
            for (int k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                temp = k;
            }
            System.out.println(temp);

            if (temp != -1) {
                list[temp] = currentElement;
            }
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
