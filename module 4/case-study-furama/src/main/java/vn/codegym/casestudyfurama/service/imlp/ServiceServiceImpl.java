package vn.codegym.casestudyfurama.service.imlp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.casestudyfurama.model.Customer;
import vn.codegym.casestudyfurama.repository.ServiceRepository;
import vn.codegym.casestudyfurama.service.ServiceService;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<vn.codegym.casestudyfurama.model.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public void save(vn.codegym.casestudyfurama.model.Service service) {
        serviceRepository.save(service);
    }
}
