package com.example.demomb.controller;

import com.example.demomb.entity.User;
import com.example.demomb.entity.userEntity;
import com.example.demomb.serveice.Result;
import com.example.demomb.serveice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usercontroller {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<userEntity> findall() {

        return userService.findall();
    }

    @PostMapping("/save")
    public Integer save(@RequestBody userEntity entity) {

        return userService.save(entity);
    }
}
