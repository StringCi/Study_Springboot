package com.test.controller;

import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello World Springboot~";
    }

    @PostMapping("/posthello")
    public String test2(){
        return "hello World postSpringboot~";
    }

    @DeleteMapping("/deletehello")
    public String test3(){
        return "hello World deleteSpringboot~";
    }

    @GetMapping("/hello/{userid}/{password}")
    public String test4(@PathVariable String userid, @PathVariable String password){
        return "Get parm!" + "Get user:" + userid + "Get pw:" + password;
    }

    @DeleteMapping("/deletehello/{id}/{pw}")
    public String test5(@PathVariable String id, @PathVariable String pw){
        return "Get parm!" + "Get user:" + id + "Get pw:" + pw;
    }

    @PutMapping("/puthello/{id}/{pw}")
    public String test6(@PathVariable("id") String usrid, @PathVariable("pw") String passwd){
        return "Get parm!" + "Get user:" + usrid + "Get pw:" + passwd;
    }

    @GetMapping("/param")
    public String test7(@RequestParam("id") String userid,@RequestParam String passwd){
        return "Get parm!" + "Get user:" + userid + "Get pw:" + passwd;


    }
}
