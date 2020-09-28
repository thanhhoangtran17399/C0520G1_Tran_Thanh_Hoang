package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CalculatorService;

@Controller
public class CalculatorController {
    private CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/calculator")
    public ModelAndView calculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operator) {
        ModelAndView modelAndView = new ModelAndView("index", "result", calculatorService.calculator(num1, num2, operator));
        return modelAndView;

    }
}
