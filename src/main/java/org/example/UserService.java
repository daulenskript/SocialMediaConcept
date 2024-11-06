package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private final Map<Integer, User> users = new HashMap<>();
    private int nextUserId = 1;

    public User createUser(String username) {
        User user = new User(nextUserId++, username);
        users.put(user.getId(), user);
        return user;
    }

    public void followUser(User follower, User followed) {
        follower.follow(followed);
        followed.addFollower(follower);
    }

    // Other user-related methods
}