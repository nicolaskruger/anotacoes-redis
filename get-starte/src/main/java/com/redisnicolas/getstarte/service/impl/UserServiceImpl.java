package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.User;
import com.redisnicolas.getstarte.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceBase implements UserService {

    private final String NAME = "name";
    private final String EMAIL = "email";
    private final String PASSWORD = "password";

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
