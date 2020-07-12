package stack_queue.homework_comparable_comparator.comparable;

public class StudentCodeGym implements Comparable<StudentCodeGym> {
    private String name;
    public StudentCodeGym(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentCodegym{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentCodeGym o) {
        String name1 = name.substring(name.lastIndexOf(" "));
        String name2 = o.name.substring(o.name.lastIndexOf(" "));
        return name1.compareTo(name2);
    }
}
