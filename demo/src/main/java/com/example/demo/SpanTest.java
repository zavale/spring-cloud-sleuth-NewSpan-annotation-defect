package com.example.demo;

import org.springframework.cloud.sleuth.annotation.NewSpan;

/**
 * Created by evgenyzavalkovsky on 6/18/17.
 */
public
class SpanTest {

    @NewSpan
    public void spanTest() {
        for (int i=0; i<100000000; i++);
    }
}
