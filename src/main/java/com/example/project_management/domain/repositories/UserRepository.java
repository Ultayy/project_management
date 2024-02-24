package com.example.project_management.domain.repositories;

import com.example.project_management.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}