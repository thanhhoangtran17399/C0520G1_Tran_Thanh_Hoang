package vn.codegym.validate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.validate.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
