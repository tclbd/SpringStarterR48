package com.spring.start;

public class BeanLifeCycle {

    public void initBean(){
        System.err.println("init bean");
    }
    
    public void destroyBean(){
        System.err.println("destroy bean");
    }
}
