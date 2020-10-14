package vn.codegym.casestudyfurama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.casestudyfurama.model.Contract;
import vn.codegym.casestudyfurama.model.Service;
import vn.codegym.casestudyfurama.service.ServiceService;


@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @GetMapping
    public String index(Model model, @PageableDefault(value = 2) Pageable pageable) {
        model.addAttribute("service", new Service());
        model.addAttribute("listService", serviceService.findAll(pageable));
        return "service/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("contract", new Contract());
        return "service/list";
    }
    @PostMapping("/save")
    public String save(Service service, RedirectAttributes redirect) {
        serviceService.save(service);
        redirect.addFlashAttribute("success", "Saved contract successfully!");
        return "redirect:/service";
    }
}
