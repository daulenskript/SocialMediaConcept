package org.example;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;



public class Main {
    public static void main(String[] args) {
        SocialMediaController controller = new SocialMediaController();

        // Example usage
        MultipartFile image = new MockMultipartFile("image.jpg", "Hello, World!".getBytes());
        Post post = controller.createPost(image, "My first post", "johndoe");
        controller.likePost(post.getId(), "janedoe");
        controller.addComment(post.getId(), "Great post!", "bobsmith");
    }
}