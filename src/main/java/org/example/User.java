package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private List<Post> posts;
    private List<User> followers;
    private List<User> following;

    public User(int id, String username) {
        this.id = id;
        this.username = username;
        this.posts = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    // Getters, setters, and other methods
}