package danh_sach.bai_tap;

public class TestMyLinkedList {
    public static class Student{
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student0 = new Student(1,"a");
        Student student1 = new Student(2,"b");
        Student student2 = new Student(3,"c");
        Student student3 = new Student(4,"d");
        Student student4 = new Student(5,"e");
        
        Student student = (Student) myLinkedList.getFirst();
        if(student == null){
            return ;
        }else {
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
