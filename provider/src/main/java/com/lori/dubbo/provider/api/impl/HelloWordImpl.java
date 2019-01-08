package com.lori.dubbo.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lori.dubbo.provider.api.HelloWord;
import org.springframework.beans.factory.annotation.Value;

@Service(
        version="1.0.0",
        application="${dubbo.application.id}",
        protocol="${dubbo.protocol.id}",
        registry="${dubbo.registry.id}"
)
public class HelloWordImpl implements HelloWord {

    @Value("${server.port}")
    private String port;

    @Override
    public String hello(){
        return "hello word, my port is : "+port;
    }
}
