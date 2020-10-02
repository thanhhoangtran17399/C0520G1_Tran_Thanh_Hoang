package vn.codegym.validate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.validate.model.User;
import vn.codegym.validate.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return  userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

}
