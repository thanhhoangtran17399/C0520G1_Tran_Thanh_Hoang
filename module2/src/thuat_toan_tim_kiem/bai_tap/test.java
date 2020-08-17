package thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();

        String chain = "abc";
        list.add(chain.charAt(2));
            System.out.println( chain.charAt(1) < list.getLast());


    }
}
