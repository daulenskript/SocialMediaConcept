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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void removePost(Post post) {
        posts.remove(post);
    }

    public void follow(User followed) {
        followers.add(followed);

    }

    public void addFollower(User follower) {
        followers.add(follower);
    }

    // Getters, setters, and other methods
}