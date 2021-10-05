package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.KeyValue;

public interface ListService {
    void rpush(KeyValue keyValue);
    void lpush(KeyValue keyValue);
}
