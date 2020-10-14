package vn.codegym.casestudyfurama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.casestudyfurama.model.Contract;
import vn.codegym.casestudyfurama.model.Customer;

import java.util.List;

public interface ContractService {
    List<Contract> findAll();

    void save(Contract contract);

    Contract findById(String id);

    void update(Contract contract);

    void remove(String id);

    Page<Contract> findAll(Pageable pageable);
}
