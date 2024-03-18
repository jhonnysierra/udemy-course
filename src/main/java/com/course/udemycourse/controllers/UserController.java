package com.course.udemycourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("tittle", "Hola Mundo Udemy");
        model.addAttribute("userName", "Jhonny");
        model.addAttribute("lastName", "Sierra");
        return "details";
    }
}

