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

    // Getters, setters, and other methods
}