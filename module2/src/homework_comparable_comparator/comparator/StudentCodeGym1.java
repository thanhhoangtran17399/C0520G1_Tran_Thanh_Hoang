package homework_comparable_comparator.comparator;

public class StudentCodeGym1 {
    private String name;
    public StudentCodeGym1(String name){
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
}
