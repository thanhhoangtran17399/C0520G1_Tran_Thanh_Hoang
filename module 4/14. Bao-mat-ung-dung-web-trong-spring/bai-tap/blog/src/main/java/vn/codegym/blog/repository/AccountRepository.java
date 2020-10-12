package vn.codegym.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.blog.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUserName(String accountName);
}
