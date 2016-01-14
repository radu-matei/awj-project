package com.awj.models;

/**
 * Created by Radu on 14/01/16.
 */
public class Address {

    private String country;
    private String city;
    private String street;
    private Integer number;

    public Address(){

    }

    public Address(String country, String city, String street, Integer number){
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCountry(){
        return country;
    }

    public String getCity(){
        return city;
    }

    public String getStreet(){
        return street;
    }

    public Integer getNumber(){
        return number;
    }

    public void updateAddress(Address address){
        country = address.country;
        city = address.city;
        street = address.street;
        number = address.number;
    }
}