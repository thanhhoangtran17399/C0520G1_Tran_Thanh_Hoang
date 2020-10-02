package vn.codegym.validate.service;
import vn.codegym.validate.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);
}
