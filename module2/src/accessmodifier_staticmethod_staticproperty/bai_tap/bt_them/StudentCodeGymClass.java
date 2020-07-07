package accessmodifier_staticmethod_staticproperty.bai_tap.bt_them;
//Chua lam xong
import java.util.Scanner;

class StudentCodeGym {
    private int id;
    private String name;
    private String dateOfBirth;

    public StudentCodeGym(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

public class StudentCodeGymClass {
    private static StudentCodeGym[] listStudent;
    private static int count = 0;
    static {
        listStudent = new StudentCodeGym[10];
    }
    public int getCount(){
        return count;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
}