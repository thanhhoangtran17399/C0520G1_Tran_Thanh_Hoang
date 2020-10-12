package vn.codegym.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.blog.model.Account;
import vn.codegym.blog.service.AccountService;

@Controller
@RequestMapping("/login")
public class MainController {
    @Autowired
    private AccountService accountService;

    @GetMapping()
    public String getHomepage() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("123");
        accountService.save(new Account("hai", password, "USER", true));
        accountService.save(new Account("tra", password, "CREATOR", true));
        return "redirect:/";
    }

}
