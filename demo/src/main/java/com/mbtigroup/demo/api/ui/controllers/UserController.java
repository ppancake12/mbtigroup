package com.mbtigroup.demo.api.ui.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @GetMapping
    public String createUser(){
        return null;
    }

    @GetMapping
    public String userList(){
        return null;
    }

    @PutMapping
    public String updateUser(){
        return null;
    }

    @DeleteMapping
    public String deleteUser(){
        return null;
    }


}
