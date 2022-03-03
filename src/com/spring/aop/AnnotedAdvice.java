package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotedAdvice {
    
    @Pointcut("execution(public void method*())")
    public void pc(){}
    
    @Pointcut("execution(public void method3())")
    public void pc1(){}
    
    @Before("pc()")
    public void beforeAdvice(){
        System.out.println("before call");
    }
    @After("pc()")
    public void afterAdvice(){
        System.out.println("after call");
    }
    
    @Before("pc1() && pc()")
    public void beforeAdvice1(){
        System.out.println("before call 3");
    }
    @After("pc1()")
    public void afterAdvice1(){
        System.out.println("after call 3");
    }
}
