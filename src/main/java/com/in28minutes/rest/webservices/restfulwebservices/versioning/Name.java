package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getter
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString(){
        return String.format("Name [firstName=%s, lastName=%s]", this.firstName, this.lastName);
    }
}
