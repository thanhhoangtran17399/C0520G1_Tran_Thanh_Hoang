package thuat_toan_sap_xep.thuc_hanh.cai_dat_thuat_toan_sap_xep_chon;

public class SelectionSort {
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++){
            double min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++){
                if (min > list[j]){
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -3.5};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
