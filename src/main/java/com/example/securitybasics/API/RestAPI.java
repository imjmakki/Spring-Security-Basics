package com.example.securitybasics.API;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

    public String Hello(@RequestParam String name) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello there " + authentication.getName();
    }
}
