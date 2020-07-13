package homework_comparable_comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
public class TestComparable {
    public static void main(String[] args) {
        ArrayList<StudentCodeGym> list = new ArrayList<>();
        list.add(new StudentCodeGym("Tran Thanh Hoang"));
        list.add(new StudentCodeGym("Tran Phuoc Vuong"));
        list.add(new StudentCodeGym("Nguyen Huu Quang"));
        list.add(new StudentCodeGym("Nguyen Tien Hai"));
        list.add(new StudentCodeGym("Tu Si Tung"));
        System.out.println("Truoc khi sap xep:");
        for (StudentCodeGym student :list) {
            System.out.println(student);
        }
        System.out.println("Sau khi sap xep:");
        Collections.sort(list);
        for (StudentCodeGym student :list) {
            System.out.println(student);
        }
    }
}
