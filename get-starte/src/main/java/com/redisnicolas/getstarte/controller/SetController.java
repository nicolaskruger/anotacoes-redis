package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;
import com.redisnicolas.getstarte.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/set")
public class SetController {
    @Autowired
    private SetService service;

    @PostMapping
    public ResponseEntity<Void> sadd(@RequestBody KeyString keyString){
        service.sadd(keyString);
        return  ResponseEntity.ok().build();
    }
    @PostMapping("/array")
    public  ResponseEntity<Long> saddList(@RequestBody KeyListString keyListString){
        return ResponseEntity.ok(service.saddList(keyListString));
    }
    @DeleteMapping
    public ResponseEntity<Void> srem(@RequestBody KeyString keyString){
        service.srem(keyString);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping("/array")
    public ResponseEntity<Long> sremList(@RequestBody KeyListString keyListString ){
        return ResponseEntity.ok(service.sremList(keyListString));
    }

}
