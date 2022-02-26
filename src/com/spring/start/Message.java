package com.spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Message {
    
    @Bean
    public void getMessage(){
        System.out.println("message printed");
    }
}
