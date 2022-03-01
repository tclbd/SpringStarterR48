
package com.spring.start;


public class Address {
    private String city;
    private String state;

    public Address() {
    }

    
    
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "city : " + city + " :: state : " + state;
    }  
    
}
