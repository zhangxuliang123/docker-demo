package com.docker.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/docker-demo")
    public String index(){
        return "SUCCESS FULLY";
    }
}
