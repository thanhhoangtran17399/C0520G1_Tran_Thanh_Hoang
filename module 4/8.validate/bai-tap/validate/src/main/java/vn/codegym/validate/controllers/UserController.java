package vn.codegym.validate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.validate.model.User;
import vn.codegym.validate.service.UserService;

@Controller

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public ModelAndView getCreatePage(){
        ModelAndView modelAndView  = new ModelAndView("user/create");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createStudent(@Validated @ModelAttribute User user,  BindingResult bindingResult, Model model){

        new User().validate(user, bindingResult);
        if(bindingResult.hasErrors()){
            return "/user/create";
        } else {
            userService.save(user);
            model.addAttribute("ok", "da dang  ki thanh cong");
            return "user/result";
        }
    }
}
