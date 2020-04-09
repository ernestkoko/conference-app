package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")  // when greeting is called on the browser, the method, greeting runs.
    public String greeting(Map<String,Object> model){

        model.put("message", "Hello Ernest"); //picks the message variable inside the greeting.jsp file as key and
                                                // and put the value "Hello Ernest" there.

        return "greeting"; //this returns the greeting.jsp file

    }
}
