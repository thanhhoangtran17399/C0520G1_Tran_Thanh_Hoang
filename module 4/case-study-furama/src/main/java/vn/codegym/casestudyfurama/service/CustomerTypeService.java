package vn.codegym.casestudyfurama.service;

import vn.codegym.casestudyfurama.model.Customer;
import vn.codegym.casestudyfurama.model.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();
}
