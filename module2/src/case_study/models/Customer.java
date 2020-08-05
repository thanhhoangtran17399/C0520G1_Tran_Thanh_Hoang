package case_study.models;

public class Customer implements Comparable<Customer> {
    private String name;
    private String birthday;
    private String gender;
    private String cmnd;
    private int phoneNumber;
    private String email;
    private String typeCustomer;
    private Services useServices;

    public Customer(String name, String birthday, String gender, String cmnd, int phoneNumber, String email, String typeCustomer, Services useServices) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.useServices = useServices;
    }

    public Services getUseServices() {
        return useServices;
    }

    public void setUseServices(Services useServices) {
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

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
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
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Customer o) {
        int resutl = this.name.compareTo(o.name);
        if (resutl == 0) {
            int yearFirtsCustomer = Integer.parseInt(this.birthday.split("/")[2]);
            int yearSecondCustomer = Integer.parseInt(o.birthday.split("/")[2]);
            resutl = yearFirtsCustomer - yearSecondCustomer;
        }
            return resutl;
    }
}
