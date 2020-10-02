package vn.codegym.validate.model;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty(message = "Name is not empty")
    @Size(min = 5,max = 45,message = "Size name must be between 5 and 45")
    private String name;

    private String phoneNumber;

    @NotNull(message = "Age is not empty")
    @Min(18)
    private int age;

    @NotEmpty
    @Email
    private String email;

    public User() {

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
//        User student = (User) target;
//        if(student.getRole()!=0 && student.getRole() !=1){
//            errors.rejectValue("role","role.range");
//        }
//        if(student.getAddress().isEmpty()){
//            errors.rejectValue("address","address.notEmpty");
//        } else if ("Da Nang".equals(student.getAddress())){
//            errors.rejectValue("address","address.notDN");
//        }


    }
}
