package org.example;
import java.util.ArrayList;
import java.util.List;

public class Comment {
    private int id;
    private int postId;
    private String username;
    private String text;

    public Comment(int id, int postId, String username, String text) {
        this.id = id;
        this.postId = postId;
        this.username = username;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    // Getters, setters, and other methods
}