package stack_queue.bai_tap.kiem_tra_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String chuoiKyTu = scanner.nextLine();

        System.out.println("Check: " + isPalindromeString(chuoiKyTu));

    }

    public static boolean isPalindromeString(String chuoi) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        boolean check = true;
        for (int i = 0; i < chuoi.length(); i++) {
            String character = chuoi.substring(i, i + 1);
            stack.push(character);
            queue.offer(character);
        }

        // so sanh kieu string giua cac phan tu cua stack va queue
        for (int i = 0; i < chuoi.length(); i++) {
            if (!stack.pop().equals(queue.poll())) {
                check = false;
                break;
            }
        }
        return check;
    }
}
