package case_study.models;

public class Employee {
    private String id;
    private String nameEmloyee;
    private String ageEmployee;
    private String address;

    public Employee(String id,String nameEmloyee, String ageEmployee, String address) {
        this.id = id;
        this.nameEmloyee = nameEmloyee;
        this.ageEmployee = ageEmployee;
        this.address = address;
    }

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameEmloyee() {
        return nameEmloyee;
    }

    public void setNameEmloyee(String nameEmloyee) {
        this.nameEmloyee = nameEmloyee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", nameEmloyee='" + nameEmloyee + '\'' +
                ", ageEmployee=" + ageEmployee +
                ", address='" + address + '\'' +
                '}';
    }
}
