package com.course.udemycourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.course.udemycourse.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Pepito", "Perez");

        model.addAttribute("tittle", "Hola Mundo Udemy");
        model.addAttribute("userName", "Jhonny");
        model.addAttribute("lastName", "Sierra");
        model.addAttribute("user", user);
        return "details";
    }
}

