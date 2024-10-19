package com.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public void addFruit())")
    public void beforeAdding(){
        System.out.println("Logic and logs that run before add method");
    }
}
