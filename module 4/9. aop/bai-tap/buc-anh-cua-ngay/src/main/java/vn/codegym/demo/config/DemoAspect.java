package vn.codegym.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@Aspect
public class DemoAspect {
    @Pointcut("execution(* vn.codegym.demo.controllers.ImageController.*(..))")
    public void studentControllerMethod(){}

    @Before("studentControllerMethod()")
    public void beforeCallMethod(JoinPoint joinPoint){
        System.err.println("Start method name: "+joinPoint.getSignature().getName() + " Time: "+ LocalDateTime.now());
    }

    @AfterThrowing("studentControllerMethod()")
    public void afterCallMethod(JoinPoint joinPoint){
        System.err.println("End method name: "+ Arrays.toString(joinPoint.getArgs()) + " Time: "+ LocalDateTime.now());
    }
}
