package danh_sach.bai_tap;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Student student0 = new Student(2, "Hoang");
        Student student2 = new Student(1, "zxc");
        Student student1 = new Student(3, "a");
        Student student3 = new Student(4, "b");
        Student student4 = new Student(5, "c");
        Student student5 = new Student(6, "q");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(student0);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5, 3);
        System.out.println(studentMyArrayList.remove(3));

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            //System.out.print(student.getId());
            System.out.println(student.getName());
        }
    }
}
