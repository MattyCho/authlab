package com.codefellows.authlab.controllers;

import com.codefellows.authlab.models.PostUser;
import com.codefellows.authlab.repositories.PostUserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AuthController {

    @Autowired
    PostUserRepository postUserRepository;

    @GetMapping("/login")
    public String getLoginPage() {
        return "login.html";
    }

    @GetMapping("/signup")
    public String getSignupPage() {
        return "signup.html";
    }

    @PostMapping("/login")
    public RedirectView loginUser(String username, String password) {
        PostUser userFromDB = postUserRepository.findByUsername(username);
        if (userFromDB == null || !BCrypt.checkpw(password, userFromDB.password)) {
            return new RedirectView("/login");
        }
        return new RedirectView("/");
    }

    @PostMapping("/signup")
    public RedirectView signUpUser(String username, String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
        PostUser newUser = new PostUser(username, hashedPassword);
        postUserRepository.save(newUser);
        return new RedirectView("/login");
    }
}
