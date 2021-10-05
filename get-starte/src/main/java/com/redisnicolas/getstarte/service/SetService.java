package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;

public interface SetService {
    void sadd(KeyString keyString);
    void  srem(KeyString keyString);
    Long saddList(KeyListString keyListString);
    Long sremList(KeyListString keyListString);
}
