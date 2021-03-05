package ir.sharif.math;

import java.time.LocalTime;
import java.util.ArrayList;

public class User {
    final String username;
    String password;
    ArrayList<User> friends;
    String bio;
    boolean online;
    LocalTime lastSeen;
    String id;
    final String email;
    // ...

    private User(String username, String password, ArrayList<User> friends, String bio, boolean online, LocalTime lastSeen, String id, String email) {
        this.username = username;
        this.password = password;
        this.friends = friends;
        this.bio = bio;
        this.online = online;
        this.lastSeen = lastSeen;
        this.id = id;
        this.email = email;
    }

    static class UserBuilder {
        String username;
        String password;
        ArrayList<User> friends;
        String bio;
        boolean online;
        LocalTime lastSeen;
        String id;
        String email;

        public UserBuilder() {
            friends = new ArrayList<>();
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder addFriend(User friend) {
            this.friends.add(friend);
            return this;
        }



        public UserBuilder setLastSeen(LocalTime lastSeen) {
            this.lastSeen = lastSeen;
            return this;
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(username, password, friends, bio, online, lastSeen, id, email);
        }
    }
}
