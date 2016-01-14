package com.awj.models;

/**
 * Created by Radu on 14/01/16.
 */
public class Person extends Model<Person> {

    private String firstName;
    private String lastName;
    private Address address;

    public Person(){

    }

    public Person(Integer id, String firstName, String lastName, String country, String city, String street, Integer number){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(country, city, street, number);
    }

    @Override
    public void update(Person person) {
        firstName = person.firstName;
        lastName = person.lastName;
        address.updateAddress(person.address);
    }

    public String getFirstName(){
        return firstName;
    }

    public  String getLastName(){
        return lastName;
    }

    public Address getAddress(){
        return address;
    }
}