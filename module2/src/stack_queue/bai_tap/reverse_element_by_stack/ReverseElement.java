package stack_queue.bai_tap.reverse_element_by_stack;

import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);

        stack.push(2);

        stack.push(3);

        stack.push(4);

        stack.push(5);

        stack.push(6);

        System.out.println("Before:");

        printStack(stack);

        System.out.println("After:");

        Stack<Integer> stackReverse = reverseStack(stack);

        printStack(stackReverse);

    }

    private static void printStack(Stack<Integer> stack) {

        for (int i = 0; i < stack.size(); i++) {

            System.out.println(stack.elementAt(i));

        }

    }

    private static Stack<Integer> reverseStack(Stack<Integer> stack) {

        Stack<Integer> stackReverse = new Stack<>();

        int stackSize = stack.size();

        for (int i = 0; i < stackSize; i++) {

            stackReverse.push(stack.pop());
        }
        return stackReverse;
    }
}
