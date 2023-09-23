package com.model;


import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class WebSocketScopedBean {
    private static final AtomicInteger instanceCount = new AtomicInteger(0);
    private final int id;

    public WebSocketScopedBean() {
        id = instanceCount.incrementAndGet();
    }

    public String getData() {
        return "Instance ID: " + id;
    }
}

