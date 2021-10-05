package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.KeyValue;
import com.redisnicolas.getstarte.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    private ListService listService;

    @PostMapping("/rpush")
    public ResponseEntity rpush(@RequestBody KeyValue keyValue){
        listService.rpush(keyValue);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @PostMapping("/lpush")
    public ResponseEntity lpush(@RequestBody KeyValue keyValue){
        listService.lpush(keyValue);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @GetMapping("/lrange")
    public ResponseEntity<List<String>> lrange(@RequestParam String key, @RequestParam Long start, @RequestParam Long end){
        return ResponseEntity.ok(listService.lrange(key, start, end));
    }
}
