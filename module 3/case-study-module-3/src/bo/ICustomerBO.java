package bo;

import model.Customer;

import java.util.List;

public interface ICustomerBO {
    List<Customer> selectAllCustomer();
    void insertCustomer(Customer customer);
    Customer selectCustomer(int customerId);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int customerId);
    List<Customer> searchById(int customerId);
}
