package vn.codegym.casestudyfurama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.casestudyfurama.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee customer);

    Employee findById(String id);

    void update(Employee customer);

    void remove(String id);

    Page<Employee> findAll(Pageable pageable);
}
