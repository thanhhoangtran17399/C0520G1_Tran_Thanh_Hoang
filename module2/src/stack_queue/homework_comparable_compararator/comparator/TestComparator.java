package stack_queue.homework_comparable_compararator.comparator;
import stack_queue.homework_comparable_compararator.comparator.StudentCodeGym1;

import java.util.ArrayList;
import java.util.Collections;
public class TestComparator {
    public static void main(String[] args) {
        ArrayList<StudentCodeGym1> list = new ArrayList<>();
        list.add(new StudentCodeGym1("Tran Thanh Hoang"));
        list.add(new StudentCodeGym1("Tran Phuoc Vuong"));
        list.add(new StudentCodeGym1("Nguyen Huu Quang"));
        list.add(new StudentCodeGym1("Nguyen Tien Hai"));
        list.add(new StudentCodeGym1("Tu Si Tung"));
        System.out.println("Truoc khi sap xep:");
        for (StudentCodeGym1 student :list) {
            System.out.println(student);
        }
        System.out.println("Sau khi sap xep:");
        Collections.sort(list, new SortByName());
        for (StudentCodeGym1 student :list) {
            System.out.println(student);
        }
    }
}
