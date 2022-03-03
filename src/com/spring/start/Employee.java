package com.spring.start;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

public class Employee {
    private int age;
    private String name;
 
    private Address address;
    private Address address1;
    private List<Address> addressList;

    public Employee() {
        System.err.println("default constructor");
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Employee(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Employee(List<Address> addressList) {
        this.addressList = addressList;
    }

    
    public Employee(int age, String name, Address address, List<Address> addressList) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.addressList = addressList;
    }

    public int getAge() {
        System.out.println("get age");
        return age;
    }

    public void setAge(int age) {
        System.out.println("set age");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    @Required
    @Autowired
    @Qualifier(value = "address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Address getAddress1() {
        return address1;
    }

    @Required
    @Autowired(required = true)
    @Qualifier(value = "address")
    public void setAddress1(Address address1) {
        this.address1 = address1;
    }


    @Override
    public String toString() {
        Iterator iList = addressList.iterator();
        while(iList.hasNext()){
            System.out.println(iList.next());
        }
        return "age : " + age + " :: name : " + name + " :: address : " + address;
    }  
    
    //@PostConstruct
    public void initBean(){
        System.err.println("init bean");
    }
    
    //@PreDestroy
    public void destroyBean(){
        System.err.println("destroy bean");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init method");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy method");
//    }
}
