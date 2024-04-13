package com.course.udemycourse.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.udemycourse.models.User;
import com.course.udemycourse.models.dto.UserDto;

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

    @GetMapping("/details-dto")
    public UserDto detailsDto(){
        UserDto dto = new UserDto();
        User user = new User("Jhonny", "Sierra");

        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setTitle("DTO");

        return dto;
    }

    @GetMapping("/details/dto/list")
    public List<UserDto> listUser(){
        UserDto dto1 = new UserDto();
        User user1 = new User("Jhonny", "Sierra");
        dto1.setFirstName(user1.getFirstName());
        dto1.setLastName(user1.getLastName());
        dto1.setTitle("DTO List 1");

        UserDto dto2 = new UserDto();
        User user2 = new User("Pepito", "Perez");
        dto2.setFirstName(user2.getFirstName());
        dto2.setLastName(user2.getLastName());
        dto2.setTitle("DTO List 2");

        UserDto dto3 = new UserDto();
        User user3 = new User("Tony", "Stark");
        dto3.setFirstName(user3.getFirstName());
        dto3.setLastName(user3.getLastName());
        dto3.setTitle("DTO List 3");

        List<UserDto> listUser = Arrays.asList(dto1, dto2, dto3);
        
        /* Forma tradicional de hacer una Lista */
        // List<UserDto> listUser = new ArrayList<>();
        // listUser.add(dto1);
        // listUser.add(dto2);
        // listUser.add(dto3);

        return listUser;
    }
}

