package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;

import java.util.List;

public interface ListService {
    void rpush(KeyString keyValue);
    void lpush(KeyString keyValue);
    Long rpushList(KeyListString keyListString);
    Long lpushList(KeyListString keyListString);
    List<String> lrange(String key, Long start, Long end);
    String lpop(String key);
    String rpop(String key);
    Long llen(String key);
}
