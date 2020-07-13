package stack_queue.bai_tap.kiem_tra_dau_ngoac;
import java.util.Stack;
import java.util.Scanner;

public class KiemTraDauNgoac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao bieu thuc: ");
        String bieuThuc = scanner.nextLine();
        System.out.println("Check: " + isCheck(bieuThuc));
    }

    public static boolean isCheck(String bieuThuc) {
        Stack<Character> stack = new Stack<>();
        int dem = 0;
        boolean check = true;
        for (int i = 0; i < bieuThuc.length(); i++) {
            if (bieuThuc.charAt(i) == '(') {
                stack.push(bieuThuc.charAt(i));
                dem++;
            } else if (bieuThuc.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    check = false;
                    break;
                } else {
                    stack.pop();
                }
                dem--;
            }
        }
        if (dem != 0) {
            check = false;
        }
        return check;
    }
}
