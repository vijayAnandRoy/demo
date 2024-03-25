package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/demo")
@RestController
public class DemoController {

    @GetMapping("/hai")
    public ResponseEntity<String> getDemo(){
        return new ResponseEntity<>("Sai Ram", HttpStatus.OK);
    }
}
