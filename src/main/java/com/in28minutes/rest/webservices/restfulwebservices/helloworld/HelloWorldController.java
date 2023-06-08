package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// REST API
@RestController
public class HelloWorldController {
    
    // /hello-world
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // /hello-world
    @GetMapping(path = "/hello-world-bean")
    public HelloWordBean helloWorldBean() {
        return new HelloWordBean("Hello Word");
    }

    // /hello-world/path-variable/{name}
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWordBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWordBean(String.format("Hello Word, %s", name));
    }

}
