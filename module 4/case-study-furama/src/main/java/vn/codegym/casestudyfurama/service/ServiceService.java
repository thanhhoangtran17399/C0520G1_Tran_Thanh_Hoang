package vn.codegym.casestudyfurama.service;

import vn.codegym.casestudyfurama.model.Customer;
import vn.codegym.casestudyfurama.model.Service;

import java.util.List;

public interface ServiceService {
    List<Service> findAll();

    void save(Service service);
}
