package com.example.project_management.domain.repositories;

import com.example.project_management.domain.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}