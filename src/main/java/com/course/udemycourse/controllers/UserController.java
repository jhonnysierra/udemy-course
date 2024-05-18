package com.course.udemycourse.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.course.udemycourse.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Pepito", "Perez");
        user.setEmail("pepitoperez@gmail.com");

        model.addAttribute("tittle", "Hola Mundo Udemy");
        model.addAttribute("userName", "Jhonny");
        model.addAttribute("lastName", "Sierra");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("title", "Listado de usuarios");
        
        return "list";
    }

    /* Esta etiqueta permite que se genere un modelo que se almacena en la variable users y que puede se usada
     * en cualquier vista de thymeleaf 
    */
    @ModelAttribute("users")
    public List<User> userModel(){
        List<User> users = Arrays.asList(
            new User("Hipolito", "Galindo", "hipolito@correo.com"),
            new User("Pepa", "Gonzalez", "pepa@correo.com"),
            new User("Pep", "Radiola", null));
        
        return users;
    }


}
