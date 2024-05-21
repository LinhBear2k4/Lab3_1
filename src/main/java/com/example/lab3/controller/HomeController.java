package com.example.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Lab3_1")
public class HomeController {
    @GetMapping("/form-DataBinding")
    public String doGetFormDataBinding(){
        return "user/form/FormDataBindingValidation";
    }
}
