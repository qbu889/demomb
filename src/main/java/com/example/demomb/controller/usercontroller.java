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
//    @Autowired
//    private UserService UsersService;
//
//    @GetMapping("/")
//    public List<userEntity> findall() {
//
//        return UsersService.findall();
//    }

//    @PostMapping("/save")
//    public Integer save(userEntity entity) {
//
//        return UsersService.save(entity);
//    }



    @PostMapping
    public Result registerUser(@RequestBody User user){
        userService.registerUser(user);
        return Result.ok();
    }

    @DeleteMapping("{id}")
    public Result deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return Result.ok();
    }

    @PutMapping
    public Result udpateUser(@RequestBody User user){
        userService.updateUser(user);
        return Result.ok();
    }

    @PostMapping("/list/{pageNum}/{pageSize}")
    public Result list(@PathVariable Integer pageNum,
                       @PathVariable Integer pageSize,
                       @RequestBody User user){
        List<User> users = userService.listUser(pageNum, pageSize, user);
        return Result.ok(users);

    }
}
