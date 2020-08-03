package case_study.models;

public class Customer {
    private String name;
    private int birthday;
    private String gender;
    private int cmnd;
    private int phoneNumber;
    private String email;
    private String typeCustomer;
    private Services useServices;

    public Customer(String name, int birthday, String gender, int cmnd, int phoneNumber, String email, String typeCustomer, Services useServices) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.useServices = useServices;
    }

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Services getUseServices() {
        return useServices;
    }

    public void setUseServices(Services useServices) {
        this.useServices = useServices;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", cmnd=" + cmnd +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", useServices=" + useServices +
                '}';
    }
}
