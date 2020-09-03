package bo;
import model.User;
import java.sql.SQLException;
import java.util.List;

public interface IUserBO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> searchByCountry(String country);

    List<User> shortByName();

    User getUserById(int id);

    void insertUserStore(User newUser);
}
