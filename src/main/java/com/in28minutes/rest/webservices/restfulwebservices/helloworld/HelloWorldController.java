package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


// REST API
@RestController
public class HelloWorldController {
    
    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

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

        // /hello-world internalized
        @GetMapping(path = "/hello-world-internalized")
        public String helloWorldInternalized() {
            Locale locale = LocaleContextHolder.getLocale();
            return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
        }

}
