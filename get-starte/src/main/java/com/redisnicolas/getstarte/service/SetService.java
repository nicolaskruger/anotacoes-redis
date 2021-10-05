package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.KeyValue;

public interface SetService {
    void set(KeyValue keyValue);
    String get(String key);
    Boolean exists(String key);
    void del(String key);
    Long incr(String key);
    Long incrby(String key, Long amount);
    Long decr(String key);
    Long decrby(String key, Long amount);
    Long ttl(String key);
    Long expire(String key, Integer seconds);
}
