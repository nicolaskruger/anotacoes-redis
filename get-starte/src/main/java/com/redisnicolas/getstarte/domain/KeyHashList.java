package com.redisnicolas.getstarte.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyHashList extends KeyValue<List<KeyString>>{
    public Map<String, String> toMap(){
        return getValue().stream().collect(Collectors.toMap(KeyString::getKey, KeyString::getValue));
    }
}
