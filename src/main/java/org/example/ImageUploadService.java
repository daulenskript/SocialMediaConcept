package org.example;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ImageUploadService {
    private static final String UPLOAD_DIR = "uploads/";

    public String uploadImage(byte[] imageData, String fileName) {
        try {
            // Create the upload directory if it doesn't exist
            Files.createDirectories(Paths.get(UPLOAD_DIR));

            // Construct the full file path
            String filePath = UPLOAD_DIR + fileName;
            Path path = Paths.get(filePath);

            // Save the file to disk
            Files.copy(
                    Files.newInputStream(Paths.get(fileName)),
                    path,
                    StandardCopyOption.REPLACE_EXISTING
            );

            return filePath;
        } catch (IOException e) {
            throw new RuntimeException("Error uploading image", e);
        }
    }
}