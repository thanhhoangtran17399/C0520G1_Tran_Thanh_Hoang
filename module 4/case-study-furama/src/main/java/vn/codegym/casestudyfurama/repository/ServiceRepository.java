package vn.codegym.casestudyfurama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.casestudyfurama.model.Service;

public interface ServiceRepository extends JpaRepository<Service,String> {
}
