package org.example;

import org.springframework.web.multipart.MultipartFile;

public class SocialMediaController {
    private final ImageUploadService imageUploadService;
    private final PostService postService;
    private final UserService userService;

    public SocialMediaController() {
        this.imageUploadService = new ImageUploadService();
        this.postService = new PostService();
        this.userService = new UserService();
    }

    public Post createPost(MultipartFile image, String caption, String username) {
        User user = userService.createUser(username);
        String imageUrl = imageUploadService.uploadImage(image);
        return postService.createPost(imageUrl, caption, user);
    }

    public void likePost(int postId, String username) {
        User user = userService.createUser(username);
        Post post = postService.getPost(postId);
        postService.likePost(post, user);
    }

    public void addComment(int postId, String text, String username) {
        User user = userService.createUser(username);
        Post post = postService.getPost(postId);
        postService.addComment(post, text, user);
    }

    // Other controller methods
}