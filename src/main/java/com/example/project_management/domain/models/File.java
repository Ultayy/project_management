package com.example.project_management.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "files")
public class File {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "\"fileName\"", nullable = false)
    private String fileName;

    @Column(name = "filetype", nullable = false)
    private String filetype;

    @Column(name = "size", nullable = false)
    private Long size;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

}