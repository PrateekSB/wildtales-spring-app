package org.wildtales.wildtalesspringapp.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.wildtales.wildtalesspringapp.exceptions.FileError;

import java.io.IOException;
import java.util.Map;

@Service
public class FileService {
    private final Cloudinary cloudinaryRepo;

    public FileService(Cloudinary cloudinaryRepo) {
        this.cloudinaryRepo = cloudinaryRepo;
    }

    public Map uploadToCloduinary(MultipartFile file) {
        try {
            return cloudinaryRepo.uploader().upload(file, ObjectUtils.asMap());

        } catch (IOException e) {
            throw new FileError("File Could not be uploaded due to", e);
        }
    }
}
