package com.example.project_management.domain.repositories;

import com.example.project_management.domain.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}