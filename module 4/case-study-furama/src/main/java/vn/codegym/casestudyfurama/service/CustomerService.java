package vn.codegym.casestudyfurama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.casestudyfurama.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(String id);

    void update(Customer customer);

    void remove(String id);

    Page<Customer> findAll(Pageable pageable);
}
