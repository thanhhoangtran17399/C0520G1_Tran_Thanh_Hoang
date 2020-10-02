package vn.codegym.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandle{

    @ExceptionHandler(Exception.class)
    public ModelAndView showErrorPage(){
        System.err.println("cam noi tuc nhe");
        return  new ModelAndView("/error");
    }
}
