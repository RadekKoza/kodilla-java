package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Arrays;


public class StreamMain_2 {
    public static void main(String[] args) {

//        Forum.getUsersList().stream().filter(user -> user.getSex() = 'M')
//                .forEach(System.out.println());

        Forum.getUsersList().forEach(System.out::println);
    }
}