package com.example.project_management.domain.repositories;

import com.example.project_management.domain.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}