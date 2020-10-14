package vn.codegym.casestudyfurama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.casestudyfurama.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
}
