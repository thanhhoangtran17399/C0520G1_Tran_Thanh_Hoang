package vn.codegym.casestudyfurama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.casestudyfurama.model.Customer;
import vn.codegym.casestudyfurama.model.CustomerType;

public interface CustomerTypeRepository extends JpaRepository<CustomerType,String> {
}
