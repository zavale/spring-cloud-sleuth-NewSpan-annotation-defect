package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by evgenyzavalkovsky on 6/5/17.
 */

@RestController
public
class DefaultController {
    @RequestMapping("/test")
    public ResponseEntity<String> root() {
        SpanTest obj = new SpanTest();
        obj.spanTest();
        return new ResponseEntity<>("ExampleService", HttpStatus.OK);
    }


}
