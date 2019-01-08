package com.lori.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lori.dubbo.provider.api.HelloWord;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Reference(
            version="1.0.0",
            application="${dubbo.application.id}"
    )
    private HelloWord helloWord;

    @RequestMapping("/index")
    public String index(){
        return "get provider result "+helloWord.hello();
    }
}
