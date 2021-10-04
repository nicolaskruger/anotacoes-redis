package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.User;
import com.redisnicolas.getstarte.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void postUser(@RequestBody User user){
        userService.add(user);
    }

    @GetMapping("/{name}")
    public ResponseEntity<User> getUser(@PathVariable String name){

        return ResponseEntity.ok(
                userService.get(name)
        );
    }
}
