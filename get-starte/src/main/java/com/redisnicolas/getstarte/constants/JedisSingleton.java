package com.redisnicolas.getstarte.constants;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Component
public class JedisSingleton {

    @Autowired
    private IpPort ipPort;

    private static Jedis jedis;

    public Jedis getJedis(){
        if(jedis == null){
            jedis = new Jedis(ipPort.getIp(), ipPort.getPort());
        }
        return jedis;
    }
}
