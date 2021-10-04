package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.User;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class UserServiceImpl implements UserService {

    private final String NAME = "name";
    private final String EMAIL = "email";
    private final String PASSWORD = "password";

    private Jedis jedis = new Jedis("localhost",6379);

    @Override
    public void add(User user) {
        jedis.hset(user.getName(), NAME, user.getName());
        jedis.hset(user.getName(), EMAIL, user.getName());
        jedis.hset(user.getName(), PASSWORD, user.getName());
    }

    @Override
    public User get(String name) {
        return User.builder()
                .name(jedis.hget(name, NAME))
                .email(jedis.hget(name, EMAIL))
                .password(jedis.hget(name, PASSWORD))
                .build();
    }
}
