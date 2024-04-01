package com.cydeo.springdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeDecodeController {

    @Value("${server.port}")
    private String serverPort;

   @GetMapping("/codeDecode")
    @RequestMapping("cedeDecode")
    public void codeDecodeGetMapping(){
        System.out.println("My server port is " + serverPort);
    }

}
