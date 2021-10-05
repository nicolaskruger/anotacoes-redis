package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.KeyValue;
import com.redisnicolas.getstarte.service.ListService;
import org.springframework.stereotype.Service;

@Service
public class ListServiceImpl extends ServiceBase implements ListService {
    public void rpush(KeyValue keyValue){
        getJedis().rpush(keyValue.getKey(), keyValue.getValue());
    }
    public void lpush(KeyValue keyValue){
        getJedis().lpush(keyValue.getKey(), keyValue.getValue());
    }
}
