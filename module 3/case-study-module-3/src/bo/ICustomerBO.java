package bo;

import model.Customer;

import java.util.List;

public interface ICustomerBO {
    List<Customer> selectAllCustomer();
    public void insertCustomer(Customer customer);
}
