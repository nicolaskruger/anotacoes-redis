package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.constants.JedisSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

public class ServiceBase {
    @Autowired
    private JedisSingleton jedisSingleton;
    protected  Jedis getJedis(){
        return jedisSingleton.getJedis();
    }
}
