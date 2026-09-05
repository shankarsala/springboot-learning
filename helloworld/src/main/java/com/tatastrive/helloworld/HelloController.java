package com.tatastrive.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Api Gateway
@RestController
public class HelloController {
//    --> /hello
//    -->/orders

    @GetMapping("/hello")
    public String hello(){
        return "<h1 style='color: Green;'>Hello World</h1>";
    }

    @GetMapping("/bye")
    public String bye(){
        return "<h2 style='color: Green;'>Bye</h2>";
    }

}
