package com.example.project_management.domain.services.Impl;

import com.example.project_management.domain.services.FileService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public void uploadFile(MultipartFile file) {

    }

    @Override
    public Resource downloadFile(String filename) {
        return null;
    }

    @Override
    public void deleteFile(String filename) {

    }
}
