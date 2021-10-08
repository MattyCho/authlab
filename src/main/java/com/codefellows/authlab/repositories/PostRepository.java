package com.codefellows.authlab.repositories;

import com.codefellows.authlab.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
