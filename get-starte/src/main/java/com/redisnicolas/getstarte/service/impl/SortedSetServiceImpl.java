package com.redisnicolas.getstarte.service.impl;

import com.redisnicolas.getstarte.domain.KeySortedSet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SortedSetServiceImpl extends ServiceBase  {
    public void zadd(KeySortedSet keySortedSet){
        getJedis().zadd(keySortedSet.getKey(), keySortedSet.getValue().getScore(), keySortedSet.getValue().getValue());
    }
    public Set<String> zrange(String key, Long start, Long end){
        return getJedis().zrange(key, start, end);
    }
}
