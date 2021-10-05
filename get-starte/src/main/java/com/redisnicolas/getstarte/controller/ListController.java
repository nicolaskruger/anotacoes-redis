package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;
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
    public ResponseEntity<Void> rpush(@RequestBody KeyString keyValue){
        listService.rpush(keyValue);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @PostMapping("/lpush")
    public ResponseEntity<Void> lpush(@RequestBody KeyString keyValue){
        listService.lpush(keyValue);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @PostMapping("/rpush-list")
    public ResponseEntity<Long> rpushList(@RequestBody KeyListString keyListString){
        return ResponseEntity.ok(listService.rpushList(keyListString));
    }
    @PostMapping("/lpush-list")
    public ResponseEntity<Long> lpushList(@RequestBody KeyListString keyListString){
        return ResponseEntity.ok(listService.lpushList(keyListString));
    }
    @GetMapping("/lrange")
    public ResponseEntity<List<String>> lrange(
            @RequestParam String key,
            @RequestParam Long start,
            @RequestParam Long end){
        return ResponseEntity.ok(listService.lrange(key, start, end));
    }
    @PutMapping("/lpop/{key}")
    public ResponseEntity<String> lpop(@PathVariable String key){
        return  ResponseEntity.ok(listService.lpop(key));
    }
    @PutMapping("/rpop/{key}")
    public ResponseEntity<String> rpop(@PathVariable String key){
        return  ResponseEntity.ok(listService.rpop(key));
    }
    @GetMapping("/llen/{key}")
    public ResponseEntity<Long> llen(@PathVariable String key){
        return  ResponseEntity.ok(listService.llen(key));
    }
}
