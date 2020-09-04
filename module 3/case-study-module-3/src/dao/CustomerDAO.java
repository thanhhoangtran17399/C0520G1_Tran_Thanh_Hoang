package dao;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    private static final String INSERT_NEW_CUSTOMER = "insert into customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address)" +
                                                        "values (?,?,?,?,?,?,?,?,?);";
        private static final String SELECT_ALL_CUSTOMER = "select*from customer;";
    @Override
    public List<Customer> selectAllCustomer() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Customer> customerList = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
                resultSet = statement.executeQuery();
                Customer customer = null;
                while (resultSet.next()) {
                    customer = new Customer();
                    customer.setCustomerId(resultSet.getInt("customer_id"));
                    customer.setCustomerTypeId(resultSet.getInt("customer_type_id"));
                    customer.setCustomerName(resultSet.getString("customer_name"));
                    customer.setCustomerBirthday(resultSet.getString("customer_birthday"));
                    customer.setCustomerGender(resultSet.getInt("customer_gender"));
                    customer.setCustomerIdCard(resultSet.getString("customer_id_card"));
                    customer.setCustomerPhone(resultSet.getString("customer_phone"));
                    customer.setCustomerEmail(resultSet.getString("customer_email"));
                    customer.setCustomerAddress(resultSet.getString("customer_address"));
                    customerList.add(customer);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    statement.close();
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customerList;
    }

    @Override
    public void insertCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_NEW_CUSTOMER);
                statement.setInt(1, customer.getCustomerId());
                statement.setInt(2, customer.getCustomerTypeId());
                statement.setString(3, customer.getCustomerName());
                statement.setString(4, customer.getCustomerBirthday());
                statement.setInt(5, customer.getCustomerGender());
                statement.setString(6, customer.getCustomerIdCard());
                statement.setString(7, customer.getCustomerPhone());
                statement.setString(8, customer.getCustomerEmail());
                statement.setString(9, customer.getCustomerAddress());
                statement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }
}
