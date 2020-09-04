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
}
