package com.demo.lw.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private Long id;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User() {
    }

    public User(String username, Long id) {
        this.username = username;
        this.id = id;
    }
}
