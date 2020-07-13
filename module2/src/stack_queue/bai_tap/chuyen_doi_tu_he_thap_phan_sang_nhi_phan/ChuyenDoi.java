package stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Stack;
import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        Integer resutl;
        int numb = scanner.nextInt();
        while (numb > 0) {
            resutl = numb % 2;
            stack.push(resutl);
            numb = numb / 2;
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
        }
    }
}
