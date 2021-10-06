package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.KeyHash;
import com.redisnicolas.getstarte.domain.KeyHashList;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HashSetServiceImpl extends ServiceBase {
    public void hset(KeyHash keyHash){
        getJedis().hset(keyHash.getKey(), keyHash.getValue().getKey(), keyHash.getValue().getValue());
    }
    public Map<String, String> hgetall(String key){
        return getJedis().hgetAll(key);
    }
    public String hget(String key, String innerKey){
        return getJedis().hget(key, innerKey);
    }
    public void hmset(KeyHashList keyHashList){
        getJedis().hmset(keyHashList.getKey(), keyHashList.toMap());
    }
}
