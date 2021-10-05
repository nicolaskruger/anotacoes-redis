package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.KeyValue;
import com.redisnicolas.getstarte.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/set")
public class SetController {

    @Autowired
    private SetService service;

    @PostMapping
    public ResponseEntity set(@RequestBody KeyValue keyValue) {
        service.set(keyValue);

        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }

    @GetMapping("/{key}")
    public ResponseEntity<String> get(@PathVariable String key) {
        return ResponseEntity.ok(service.get(key));
    }

    @GetMapping("/exists/{key}")
    public ResponseEntity<Boolean> exists(@PathVariable String key) {
        return ResponseEntity.ok(service.exists(key));
    }

    @DeleteMapping("/{key}")
    public ResponseEntity delete(@PathVariable String key) {

        service.del(key);

        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .build();
    }

    @PutMapping("/incr/{key}")
    public ResponseEntity<Long> incr(@PathVariable String key) {
        return ResponseEntity.ok(service.incr(key));
    }

    @PutMapping("/decr/{key}")
    public ResponseEntity<Long> decr(@PathVariable String key) {
        return ResponseEntity.ok(service.decr(key));
    }

    @PutMapping("/incrby")
    public ResponseEntity<Long> incrby(@RequestParam String key, @RequestParam Long amount) {
        return ResponseEntity.ok(service.incrby(key, amount));
    }

    @PutMapping("/decrby")
    public ResponseEntity<Long> decrby(@RequestParam String key, @RequestParam Long amount) {
        return ResponseEntity.ok(service.decrby(key, amount));
    }
}