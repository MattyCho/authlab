package com.codefellows.authlab.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class PostUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String username;
    public String password;

    @OneToMany(mappedBy = "thisPostUser")
    List<Post> posts;

    protected PostUser(){
    }

    public PostUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
