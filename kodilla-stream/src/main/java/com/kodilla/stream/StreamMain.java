package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Selected forum users collection: ");
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forum.getUsersList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().until(now()).getYears() > 20)
                .filter(user -> user.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getIdNumber, user -> user));
        mapOfUsers.entrySet().stream()
                .forEach(e -> System.out.println(e));
        }
}