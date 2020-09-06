package bo;

import dao.CustomerDAO;
import model.Customer;

import java.util.List;

public class CustomerBO implements ICustomerBO {
    private CustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> selectAllCustomer() {
        return customerDAO.selectAllCustomer();
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerDAO.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int customerId) {
        return customerDAO.selectCustomer(customerId);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerDAO.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return customerDAO.deleteCustomer(customerId);
    }

    @Override
    public List<Customer> searchById(int customerId) {
        return customerDAO.searchById(customerId);
    }
}
