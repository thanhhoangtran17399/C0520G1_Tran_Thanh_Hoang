package dao;

import model.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> selectAllCustomer();
    public void insertCustomer(Customer customer);
}
