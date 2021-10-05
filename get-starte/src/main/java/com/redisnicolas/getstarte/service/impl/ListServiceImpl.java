package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.KeyListString;
import com.redisnicolas.getstarte.domain.KeyString;
import com.redisnicolas.getstarte.service.ListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceImpl extends ServiceBase implements ListService {
    public void rpush(KeyString keyValue){
        getJedis().rpush(keyValue.getKey(), keyValue.getValue());
    }
    public void lpush(KeyString keyValue){
        getJedis().lpush(keyValue.getKey(), keyValue.getValue());
    }
    public Long rpushList(KeyListString keyListString){
        return getJedis().rpush(keyListString.getKey(), keyListString.getValue());
    }
    public Long lpushList(KeyListString keyListString){
        return getJedis().lpush(keyListString.getKey(), keyListString.getValue());
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
