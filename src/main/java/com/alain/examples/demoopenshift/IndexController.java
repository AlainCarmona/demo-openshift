package com.alain.examples.demoopenshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getMessage() {
        return "Hello Openshift from Spring Boot!";
    }
    
}
