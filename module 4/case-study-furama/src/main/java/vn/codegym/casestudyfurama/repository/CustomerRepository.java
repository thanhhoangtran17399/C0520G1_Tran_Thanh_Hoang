package vn.codegym.casestudyfurama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.casestudyfurama.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
