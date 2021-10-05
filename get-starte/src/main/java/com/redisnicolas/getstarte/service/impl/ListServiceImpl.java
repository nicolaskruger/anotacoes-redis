package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.KeyValue;
import com.redisnicolas.getstarte.service.ListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceImpl extends ServiceBase implements ListService {
    public void rpush(KeyValue keyValue){
        getJedis().rpush(keyValue.getKey(), keyValue.getValue());
    }
    public void lpush(KeyValue keyValue){
        getJedis().lpush(keyValue.getKey(), keyValue.getValue());
    }
    public List<String> lrange(String key, Long start, Long end){
        return getJedis().lrange(key, start, end);
    }
    public String lpop(String key){
        return  getJedis().lpop(key);
    }
    public String rpop(String key){
        return  getJedis().rpop(key);
    }
    public Long llen(String key){
        return  getJedis().llen(key);
    }
}
