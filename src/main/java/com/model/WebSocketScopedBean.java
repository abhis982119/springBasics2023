package com.model;


import java.util.concurrent.atomic.AtomicInteger;

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

