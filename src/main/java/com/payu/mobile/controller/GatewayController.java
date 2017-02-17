package com.payu.mobile.controller;

import com.payu.mobile.model.GatewayResponse;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jhonatan.zambrano on 2/16/17.
 */
@EnableWebSecurity
@RestController
@RequestMapping("/mobile-gateway")
public class GatewayController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/query")
    public GatewayResponse greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GatewayResponse(counter.incrementAndGet(),
                String.format(template, name));
    }
}
