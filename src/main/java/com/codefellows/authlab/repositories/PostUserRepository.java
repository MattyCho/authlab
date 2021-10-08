package com.codefellows.authlab.repositories;

import com.codefellows.authlab.models.PostUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostUserRepository extends JpaRepository<PostUser, Long> {
    public PostUser findByUsername(String username);
}
