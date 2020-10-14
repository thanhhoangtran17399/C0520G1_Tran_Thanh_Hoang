package vn.codegym.casestudyfurama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.codegym.casestudyfurama.service.CustomerService;
@Controller
public class HomeController {
    @Autowired
    @GetMapping("/")
    public String index() {
        return "home-page/home-page";
    }
}
