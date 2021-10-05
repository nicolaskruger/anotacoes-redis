package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.KeyValue;

import java.util.List;

public interface ListService {
    void rpush(KeyValue keyValue);
    void lpush(KeyValue keyValue);
    List<String> lrange(String key, Long start, Long end);
}
