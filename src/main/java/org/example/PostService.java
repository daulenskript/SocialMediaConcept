package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostService {
    private final Map<Integer, Post> posts = new HashMap<>();
    private final Map<Integer, List<Comment>> comments = new HashMap<>();
    private int nextPostId = 1;
    private int nextCommentId = 1;

    public Post createPost(String imageUrl, String caption, User user) {
        Post post = new Post(nextPostId++, imageUrl, caption);
        user.addPost(post);
        posts.put(post.getId(), post);
        return post;
    }

    public void likePost(Post post, User user) {
        post.incrementLikes();
    }

    public void addComment(Post post, String text, User user) {
        Comment comment = new Comment(nextCommentId++, post.getId(), user.getUsername(), text);
        post.addComment(comment);
        comments.computeIfAbsent(post.getId(), k -> new ArrayList<>()).add(comment);
    }

    public void deletePost(Post post, User user) {
        user.removePost(post);
        posts.remove(post.getId());
        // Remove all comments associated with the post
        comments.remove(post.getId());
    }

    public void editPost(Post post, String newCaption) {
        post.setCaption(newCaption);
    }

    public List<Post> getPostsByUser(User user) {
        return user.getPosts();
    }

    public List<Post> getPostFeed(User user) {
        List<Post> feed = new ArrayList<>();
        for (User followedUser : user.getFollowing()) {
            feed.addAll(getPostsByUser(followedUser));
        }
        // Sort the feed in reverse chronological order
        feed.sort((p1, p2) -> p2.getId() - p1.getId());
        return feed;
    }

    public List<Comment> getPostComments(Post post) {
        return comments.getOrDefault(post.getId(), new ArrayList<>());
    }

    public void deleteComment(Comment comment, Post post) {
        post.removeComment(comment);
        List<Comment> postComments = comments.get(post.getId());
        postComments.remove(comment);
    }
    public void addPost(Post post) {
        posts.put(post.getId(), post);
    }

    public Post getPost(int postId) {
        return posts.get(postId);
    }
}