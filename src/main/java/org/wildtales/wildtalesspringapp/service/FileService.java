package org.wildtales.wildtalesspringapp.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.wildtales.wildtalesspringapp.exceptions.FileError;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

@Service
public class FileService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);
    private final Cloudinary cloudinaryRepo;

    public FileService(Cloudinary cloudinaryRepo) {
        this.cloudinaryRepo = cloudinaryRepo;
    }

    public Map uploadToCloduinary(MultipartFile file) {
        try {
            final File file1 = convertMultiPartToFile(file);
            return cloudinaryRepo.uploader().upload(file1, ObjectUtils.asMap());

        } catch (IOException e) {
            LOGGER.error("File Could not be uploaded", e);
            throw new FileError("File Could not be uploaded", e);
        }
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
}
