package com.example.project_management.domain.services;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    void uploadFile (MultipartFile file);
    Resource downloadFile (String filename);
    void deleteFile (String filename);
}

