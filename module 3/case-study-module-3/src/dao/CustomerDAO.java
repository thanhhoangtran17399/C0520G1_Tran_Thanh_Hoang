package dao;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    private static final String INSERT_NEW_CUSTOMER = "insert into customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address) values (?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_ALL_CUSTOMER = "select*from customer;";
    private static final String SELECT_CUSTOMER_BY_ID = "select*from customer where customer_id = ?;";
    private static final String UPDATE_CUSTOMER = "update customer set customer_type_id = ?, customer_name = ?, customer_birthday = ?, customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ? where customer_id = ?;";
    private static final String DELETE_CUSTOMER = "delete from customer where customer_id = ?;";

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

    @Override
    public Customer selectCustomer(int customerId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Customer customer = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
                statement.setInt(1, customerId);
                resultSet = statement.executeQuery();
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
                }
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
        return customer;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        boolean rowUpdate = false;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(UPDATE_CUSTOMER);
                statement.setInt(1, customer.getCustomerTypeId());
                statement.setString(2, customer.getCustomerName());
                statement.setString(3, customer.getCustomerBirthday());
                statement.setInt(4, customer.getCustomerGender());
                statement.setString(5, customer.getCustomerIdCard());
                statement.setString(6, customer.getCustomerPhone());
                statement.setString(7, customer.getCustomerEmail());
                statement.setString(8, customer.getCustomerAddress());
                statement.setInt(9, customer.getCustomerId());
                rowUpdate = statement.executeUpdate() > 0;
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
        return rowUpdate;
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        boolean rowDeleted = false;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(DELETE_CUSTOMER);
                statement.setInt(1, customerId);
                rowDeleted = statement.executeUpdate() > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rowDeleted;
    }

    @Override
    public List<Customer> searchById(int customerId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Customer> customerList = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
                statement.setInt(1, customerId);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Customer customer = new Customer();
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
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customerList;
    }
}
