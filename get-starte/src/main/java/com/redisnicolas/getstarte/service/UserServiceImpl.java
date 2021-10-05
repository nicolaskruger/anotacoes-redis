package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.constants.JedisSingleton;
import com.redisnicolas.getstarte.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JedisSingleton jedisSingleton;

    @Value("${ip}")
    private static String IP;
    @Value("${port}")
    private static int PORT;

    private final String NAME = "name";
    private final String EMAIL = "email";
    private final String PASSWORD = "password";

    private Jedis getJedis(){
        return jedisSingleton.getJedis();
    }

    @Override
    public void add(User user) {
        getJedis().hset(user.getName(), NAME, user.getName());
        getJedis().hset(user.getName(), EMAIL, user.getEmail());
        getJedis().hset(user.getName(), PASSWORD, user.getPassword());
    }

    @Override
    public User get(String name) {
        return User.builder()
                .name(getJedis().hget(name, NAME))
                .email(getJedis().hget(name, EMAIL))
                .password(getJedis().hget(name, PASSWORD))
                .build();
    }
}
