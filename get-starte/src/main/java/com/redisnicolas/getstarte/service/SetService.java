package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;

import java.util.Set;

public interface SetService {
    void sadd(KeyString keyString);
    void  srem(KeyString keyString);
    Long saddList(KeyListString keyListString);
    Long sremList(KeyListString keyListString);
    Boolean sismember(String key, String value);
    Set<String> smember(String key);
    Set<String> sunion(String keyA, String keyB);
    Set<String> spop(String key, Long amount);
    String srandmember(String key);
}
