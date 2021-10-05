package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.KeyValue;
import com.redisnicolas.getstarte.service.SetService;
import org.springframework.stereotype.Service;

@Service
public class SetServiceImpl extends ServiceBase implements SetService {

    @Override
    public void set(KeyValue keyValue) {
        getJedis().set(keyValue.getKey(), keyValue.getValue());
    }

    @Override
    public String get(String key) {
        return getJedis().get(key);
    }

    @Override
    public Boolean exists(String key) {
        return getJedis().exists(key);
    }

    @Override
    public void del(String key) {
        getJedis().del(key);
    }

    @Override
    public Long incr(String key) {
        return getJedis().incr(key);
    }

    @Override
    public Long incrby(String key, Long amount) {
        return getJedis().incrBy(key, amount);
    }

    @Override
    public Long decr(String key) {
        return getJedis().decr(key);
    }

    @Override
    public Long decrby(String key, Long amount) {
        return getJedis().decrBy(key, amount);
    }

    @Override
    public Long ttl(String key){
        return getJedis().ttl(key);
    }

    @Override
    public Long expire(String key, Integer seconds){
        return getJedis().expire(key, seconds);
    }
}
