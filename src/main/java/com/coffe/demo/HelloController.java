package com.coffe.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hell")
    public String hello(){
        return "dafgadfg";
    }
}
