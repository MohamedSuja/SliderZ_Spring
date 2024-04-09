package com.sliderz.sliderz.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sliderz.sliderz.modals.UserModal;

@RestController
public class UserController {

    @RequestMapping("/users")
    public List<UserModal> getAllUsers() {
        return Arrays.asList(
                new UserModal(1, "John Doe", "jone@gmail.com"),
                new UserModal(2, "Marvin ", "marvin@gmail.com"),
                new UserModal(3, "Doe", "done@gmail.com")
              
        );
    }

}
