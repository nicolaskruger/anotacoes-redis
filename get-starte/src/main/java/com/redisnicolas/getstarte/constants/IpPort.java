package com.redisnicolas.getstarte.constants;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class IpPort {
    @Value("${ip}")
    private String ip;
    @Value("${port}")
    private int port;
}
