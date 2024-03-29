package com.example.project_management.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "\"projectName\"", nullable = false)
    private String projectName;

    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "\"startDate\"", nullable = false)
    private LocalDate startDate;

    @Column(name = "\"endDate\"", nullable = false)
    private LocalDate endDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

}