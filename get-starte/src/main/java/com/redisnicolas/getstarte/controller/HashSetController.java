package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.KeyHash;
import com.redisnicolas.getstarte.domain.KeyHashList;
import com.redisnicolas.getstarte.service.impl.HashSetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/hash-set")
public class HashSetController {

    @Autowired
    HashSetServiceImpl hashSetService;

    @PostMapping
    public ResponseEntity<Void> hset(@RequestBody KeyHash keyHash){
        hashSetService.hset(keyHash);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/hgetall/{key}")
    public ResponseEntity<Map<String, String>> hgetall(@PathVariable String key){
        return ResponseEntity.ok(hashSetService.hgetall(key));
    }
    @GetMapping("/hget")
    public ResponseEntity<String> hget(@RequestParam String key, @RequestParam String innerKey){
        return ResponseEntity.ok(hashSetService.hget(key, innerKey));
    }
    @PostMapping("/hmset")
    public ResponseEntity<Void> hmset(@RequestBody KeyHashList keyHashList){
        hashSetService.hmset(keyHashList);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
