package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String regi(Map<String, Object> model){
        model.put("reg", "I am working on it");
        return "registration";

    }
}
