package com.example.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/web/hello")
    public String HelloWorld(Model model){
        model.addAttribute("name", "Sakib");
        return "welcome";
    }
}
