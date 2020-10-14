package vn.codegym.casestudyfurama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.casestudyfurama.model.Customer;
import vn.codegym.casestudyfurama.model.CustomerType;
import vn.codegym.casestudyfurama.service.CustomerService;
import vn.codegym.casestudyfurama.service.CustomerTypeService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerTypeService customerTypeService;
    @GetMapping
    public String index(Model model, @PageableDefault(value = 2) Pageable pageable) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listCustomerType", customerTypeService.findAll());
        model.addAttribute("listCustomer", customerService.findAll(pageable));
        return "customer/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/list";
    }
    @PostMapping("/save")
    public String save(Customer customer, RedirectAttributes redirect) {
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "customer/list";
    }

    @PostMapping("/update")
    public String update(Customer customer, RedirectAttributes redirect) {
        customerService.update(customer);
        redirect.addFlashAttribute("success", "Modified blog successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model) {
        customerService.remove(id);
        return "redirect:/customer";
    }


//    @GetMapping("/blog/{id}/view")
//    public String view(@PathVariable int id, Model model) {
//        model.addAttribute("blog", blogService.findById(id));
//        return "blog/view";
//    }
}
