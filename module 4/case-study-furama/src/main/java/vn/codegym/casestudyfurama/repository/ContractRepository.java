package vn.codegym.casestudyfurama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.casestudyfurama.model.Contract;

public interface ContractRepository extends JpaRepository<Contract,String> {
}
