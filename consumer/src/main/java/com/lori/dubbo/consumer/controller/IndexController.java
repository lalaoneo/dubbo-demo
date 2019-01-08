package com.lori.dubbo.consumer.controller;

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
