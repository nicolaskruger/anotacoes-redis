package com.redisnicolas.getstarte.controller;

import com.redisnicolas.getstarte.domain.KeySortedSet;
import com.redisnicolas.getstarte.service.impl.SortedSetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/sorted-set")
public class SortedSetController {
    @Autowired
    private SortedSetServiceImpl sortedSetService;

    @PostMapping
    public ResponseEntity<Void> zadd(@RequestBody KeySortedSet keySortedSet){
        sortedSetService.zadd(keySortedSet);
        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<Set<String>> zrange(@RequestParam String key, @RequestParam Long start, @RequestParam Long end){
        return ResponseEntity.ok(sortedSetService.zrange(key, start, end));
    }
}
