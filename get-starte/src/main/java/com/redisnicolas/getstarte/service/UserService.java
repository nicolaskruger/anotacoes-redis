package com.redisnicolas.getstarte.service;

import com.redisnicolas.getstarte.domain.User;


public interface UserService {
    public void  add(User user);
    public User  get(String name);
}
