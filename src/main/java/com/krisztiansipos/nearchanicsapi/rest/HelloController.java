package com.krisztiansipos.nearchanicsapi.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity getHello(){
        return ResponseEntity.ok("Hello!");
    }

}
