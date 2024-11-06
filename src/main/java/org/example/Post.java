package org.example;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private int id;
    private String imageUrl;
    private String caption;
    private int likes;
    private List<Comment> comments;

    public Post(int id, String imageUrl, String caption) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.caption = caption;
        this.likes = 0;
        this.comments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    // Getters, setters, and other methods
}