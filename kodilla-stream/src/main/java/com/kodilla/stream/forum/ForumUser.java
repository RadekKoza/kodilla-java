package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(final String username, final String realName, final String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }

    public void addFriend(ForumUser user) {
        friends.add(user);
    }
    public boolean removeFriend(ForumUser user) {
        return friends.remove(user);
    }

    public Set<String> getLocationsOfFriends() {
        return friends.stream()
                .map(friend -> friend.getLocation()) //[1]
                .collect(Collectors.toSet());
    }

    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream() //[1]
                .flatMap(user -> user.getFriends().stream()) //[2]
                .filter(user -> user != this) //[3]
                .map(ForumUser::getLocation) //[4]
                .collect(Collectors.toSet()); // [5]
    }


    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(username, forumUser.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }
}
