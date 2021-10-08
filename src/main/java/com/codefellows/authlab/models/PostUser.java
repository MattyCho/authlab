package com.codefellows.authlab.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String username;
    public String password;

    protected PostUser(){
    }

    public PostUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
