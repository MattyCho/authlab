package com.codefellows.authlab.controllers;

import com.codefellows.authlab.models.Post;
import com.codefellows.authlab.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/posts")
    public String getUserPosts() {
        return "/posts.html";
    }

    @PostMapping("/posts")
    public RedirectView postUserPosts(String textContent) {
        Post newPost = new Post(textContent);
        postRepository.save(newPost);
        return new RedirectView("/posts");

    }
}
