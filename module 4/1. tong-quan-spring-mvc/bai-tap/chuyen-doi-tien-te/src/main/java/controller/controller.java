package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class controller {
    @PostMapping("/Converter")
    public ModelAndView change(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("currency-conversion");
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));
        double result = rate*usd;
        modelAndView.addObject("result",result);
        return modelAndView;
    }
    @RequestMapping("/form")
    public String showForm(){
        return "currency-conversion";
    }
}
