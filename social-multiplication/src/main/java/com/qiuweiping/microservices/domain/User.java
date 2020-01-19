package com.qiuweiping.microservices.domain;

public final class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
        this.name = null;
    }

    public String getName() {
        return name;
    }
}
