package com.codefellows.authlab.models;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String textContent;

    @ManyToOne
    PostUser thisPostUser;

    protected Post() {
    }

    public Post(String textContent) {
        this.textContent = textContent;
        // TODO thisPostUser = postUser
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
