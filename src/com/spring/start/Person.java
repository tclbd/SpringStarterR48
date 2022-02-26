package com.spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Person {
   
   @Bean
   public void getName(){
       System.out.println("hello person");
   } 
}
