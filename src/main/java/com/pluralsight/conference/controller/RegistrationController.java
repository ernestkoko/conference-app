package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {
    //@ModelAttribute("registration) ties the Registration object to the form in the registration.jsp file
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration){

        return "registration";

    }
    //@Valid ensures the Registration is valid. not empty
    @PostMapping("registration")
    public String AddRegistration(@Valid @ModelAttribute("registration")
                                              Registration registration, BindingResult result){

        //checking for errors
        if (result.hasErrors()){
            System.out.println("There were eroors");
            return "registration"; //if errors return to the the form without redirecting

        }
        System.out.println("Registration: " + registration.getName());

        return "redirect:registration"; // this redirects the app to same page but a new session

    }
}
