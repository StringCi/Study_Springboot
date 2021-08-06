package com.test.controller;

import com.test.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/aysnc1")
    public String aysnc1(){

        asyncService.sendmsg("112233");

        return "dd";
    }
}
