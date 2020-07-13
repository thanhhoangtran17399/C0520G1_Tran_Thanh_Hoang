package homework_comparable_comparator.comparator;

import java.util.Comparator;

public class SortByName implements Comparator <StudentCodeGym1> {
    @Override
    public int compare(StudentCodeGym1 o1, StudentCodeGym1 o2) {
        String name1 = o1.getName().substring(o1.getName().lastIndexOf(" "));
        String name2 = o2.getName().substring(o2.getName().lastIndexOf(" "));
        return name1.compareTo(name2);
    }
}
