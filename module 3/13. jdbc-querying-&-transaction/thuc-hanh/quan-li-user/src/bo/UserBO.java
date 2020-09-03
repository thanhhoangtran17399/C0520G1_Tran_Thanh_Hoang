package bo;

import dao.UserDAO;
import model.User;

import javax.jws.Oneway;
import java.sql.SQLException;
import java.util.List;

public class UserBO implements IUserBO{
    private UserDAO userDAO = new UserDAO();
    @Override
    public void insertUser(User user) throws SQLException {
        userDAO.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userDAO.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDAO.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userDAO.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userDAO.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return userDAO.searchByCountry(country);
    }

    @Override
    public List<User> shortByName() {
        return userDAO.shortByName();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void insertUserStore(User newUser) {

    }
}
