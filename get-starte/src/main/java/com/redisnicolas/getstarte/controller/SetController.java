package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;
import com.redisnicolas.getstarte.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

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
    @GetMapping("/sismenber")
    public ResponseEntity<Boolean> sismember(@RequestParam String key, @RequestParam String value){
        return  ResponseEntity.ok(service.sismember(key, value));
    }
    @GetMapping("/{key}")
    public ResponseEntity<Set<String>> smember(@PathVariable String key){
        return  ResponseEntity.ok(service.smember(key));
    }
    @GetMapping("/sunion")
    public ResponseEntity<Set<String>> sunion(@RequestParam String keyA, @RequestParam String keyB){
        return ResponseEntity.ok(service.sunion(keyA, keyB));
    }
    @DeleteMapping("/spop")
    public ResponseEntity<Set<String>> spop(@RequestParam String key, @RequestParam Long amount){
        return ResponseEntity.ok(service.spop(key, amount));
    }
    @GetMapping("/randmember/{key}")
    public ResponseEntity<String> srandmember(@PathVariable String key){
        return ResponseEntity.ok(service.srandmember(key));
    }

}
