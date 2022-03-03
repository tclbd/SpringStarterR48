
package com.spring.start;

import java.util.Date;
import org.springframework.aop.framework.ProxyFactory;


public class SpecialClass {

    
    public static void main(String[] args) {
        System.out.println(new Date(System.currentTimeMillis()));
        new DebuggingClass().method1();
        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println("----------------");
        System.out.println(new Date(System.currentTimeMillis()));
        new DebuggingClass().method2();
        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println("----------------");
        System.out.println(new Date(System.currentTimeMillis()));
        new DebuggingClass().method3();
        System.out.println(new Date(System.currentTimeMillis()));
    }
}
