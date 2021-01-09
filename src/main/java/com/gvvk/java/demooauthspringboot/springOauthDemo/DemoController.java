package com.gvvk.java.demooauthspringboot.springOauthDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/secureAPI")
    public String securedAPI() {
        return "This is secured API !!";
    }
}
