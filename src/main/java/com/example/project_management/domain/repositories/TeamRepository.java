package com.example.project_management.domain.repositories;

import com.example.project_management.domain.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}