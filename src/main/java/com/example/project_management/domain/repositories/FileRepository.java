package com.example.project_management.domain.repositories;

import com.example.project_management.domain.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}