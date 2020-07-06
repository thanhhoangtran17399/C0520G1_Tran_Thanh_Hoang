package lop_va_doi_tuong_trong_java.thuc_hanh;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số dòng: ");
        row = input.nextInt();
        System.out.print("Nhập vào số cột: ");
        col = input.nextInt();
        int arrNumber[][]=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j =0;j<col;j++){
                System.out.print("Nhập phần tử thứ ["+i+","+j+"]: ");
                arrNumber[i][j]=input.nextInt();
            }
        }
        for (int i =0;i<row;i++){
            for (int j = 0;j<col;j++){
                System.out.print(arrNumber[i][j]+"\t");
            }
            System.out.println("\n");
        }
        int max = arrNumber[0][0];
        int indexi = 0;
        int indexj = 0;
        for (int i =0;i<row;i++){
            for (int j = 0;j<col;j++){
                if (arrNumber[i][j]>max) {
                    max = arrNumber[i][j];
                    indexi=i;
                    indexj=j;
                }
            }
        }
        System.out.printf("Phần tử lớn nhất trong mảng = %d \n",max);
        System.out.printf("Nằm ở vị trí arrNumber[%d][%d]",indexi,indexj);
        // mảng 2 chiều không thể chuyển sang String để in ra như câu lệnh dưới được.
//        System.out.println("Mảng 2 chiều có "+row+" dòng.\n "+col+
//                " cột.\n Có các phần tử: "+ Arrays.toString(arrNumber));
    }
}