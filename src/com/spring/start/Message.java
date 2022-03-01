package com.spring.start;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"com.spring"})
@Component
public class Message { 
    public void getMessage(){
        System.out.println("message printed");
    } 
}
