package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics implements Statistics {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private int meanPostsPerUserNumber;
    private int meanCommentsPerPostNumber;


//        this.usersNumber = usersNumber;
//        this.postsNumber = postsNumber;
//        this.commentsNumber = commentsNumber;
//        this.meanPostsPerUserNumber = meanPostsPerUserNumber;
//        this.meanCommentsPerPostNumber = meanCommentsPerPostNumber;
//    }

public ForumStatistics(int usersNumber, int postsNumber, int commentsNumber, int meanPostsPerUserNumber, int meanCommentsPerPostNumber) {

    public List<String> usersNames () {
        return List.of("evuyg", "qerwvybgou", "dfwhvbu", "eiwocb");
    }

    public int postsCount () {
        return 99;
    }

    public int commentsCount () {
        return 299;
    }


    public void showStatistics () {

    }

    public Statistics calculateAdvStatistics (Statistics statistics){
        usersNumber = this.usersNames().size();

    }

}