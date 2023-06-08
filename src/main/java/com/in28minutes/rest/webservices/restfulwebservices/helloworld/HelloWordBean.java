package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWordBean {

    private String message;

    public HelloWordBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() { 
        return message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]", message);
    }

}
