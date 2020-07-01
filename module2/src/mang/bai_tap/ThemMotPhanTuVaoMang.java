package mang.bai_tap;
import java.util.Scanner;
//CHƯA LÀM XONG
public class ThemMotPhanTuVaoMang {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can them:");
        int number = scanner.nextInt();
        System.out.println("Nhap vi tri can them");
        int index = scanner.nextInt();
        int temp=0;
        if( index <= 1 || index > arr.length){
            System.out.println("Khong them duoc phan tu vao mang.");
        }
        else {
//            for (int i = arr.length-1 ; i < index ; i--){
//                for (int j = arr.length; j < index; j--) {
//                    arr[j + 1] = arr[j];
//                }
//            }
//            arr[index] = number;
            for(int i=0; i<arr.length;i++){
                if(i==index){
                    temp=arr[i];
                    arr[index]=number;
                    arr[i+1]=temp;
                }

            }
        }
        for (int j = 0; j < arr.length;j++){
            System.out.print(arr[j] + "\t");
        }
    }
}
