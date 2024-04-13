package com.course.udemycourse.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.udemycourse.models.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details-rest")
    //Otra manera de realizarlo
    //@RequestMapping(path = "/details-rest", method = RequestMethod.GET)
    public Map<String, Object> details(){
        User user = new User("Jhonny", "Sierra");

        Map<String, Object> bodyResponse = new HashMap<>();

        bodyResponse.put("tittle", "Hola Mundo Udemy");
        bodyResponse.put("user", user);

        // Otra manera de hacerlo uno a uno con el metodo put
        /* bodyResponse.put("tittle", "Hola Mundo Udemy");
        bodyResponse.put("firstName", "Jhonny");
        bodyResponse.put("lastName", "Sierra"); */

        return bodyResponse;
    }
}

