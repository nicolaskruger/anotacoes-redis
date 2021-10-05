package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;
import com.redisnicolas.getstarte.service.SetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SetServiceImpl extends ServiceBase implements SetService {
    public void sadd(KeyString keyString){
        getJedis().sadd(keyString.getKey(), keyString.getValue());
    }
    public Long saddList(KeyListString keyListString){
        return getJedis().sadd(keyListString.getKey(), keyListString.getValue());
    }
    public void  srem(KeyString keyString){
        getJedis().srem(keyString.getKey(), keyString.getValue());
    }
    public Long sremList(KeyListString keyListString){
        return getJedis().srem(keyListString.getKey(), keyListString.getValue());
    }
    public Boolean sismember(String key, String value){
        return  getJedis().sismember(key, value);
    }
    public Set<String> smember(String key){
        return  getJedis().smembers(key);
    }
    public Set<String> sunion(String keyA, String keyB){
        return getJedis().sunion(keyA, keyB);
    }
}
