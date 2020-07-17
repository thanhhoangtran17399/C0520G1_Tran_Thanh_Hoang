package thuat_toan_tim_kiem.bai_tap.tim_kiem_nhi_phan_dung_de_quy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 0, list.length - 1, 11));
    }
    public static int binarySearch(int a[], int low, int high, int value) {

        if (high >= low) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            }
            if (a[mid] > value) {
                return binarySearch(a, low, mid - 1, value);
            }
            if (a[mid] < value) {
                return binarySearch(a, mid + 1, high, value);
            }
        }
        return -1;
    }
}
