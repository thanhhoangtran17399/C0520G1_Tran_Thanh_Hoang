package vn.codegym.casestudyfurama.service.imlp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.casestudyfurama.model.Customer;
import vn.codegym.casestudyfurama.model.CustomerType;
import vn.codegym.casestudyfurama.repository.CustomerTypeRepository;
import vn.codegym.casestudyfurama.service.CustomerTypeService;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
