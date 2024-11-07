package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double meanPostsNumberPerUser;
    private double meanCommentsNumberPerUser;
    private double meanCommentsNumberPerPost;

    public ForumStatistics(Statistics statistics) {
    }

    public Statistics calculateAdvStatistics (Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount > 0 && postsCount > 0) {
            meanPostsNumberPerUser = (double) postsCount / usersCount;
            meanCommentsNumberPerUser = (double) commentsCount/ usersCount;
            meanCommentsNumberPerPost = (double) commentsCount / postsCount;
        }
        else if ( usersCount > 0 && postsCount == 0) {
            meanPostsNumberPerUser = 0;
            meanCommentsNumberPerUser = 0;
            meanCommentsNumberPerPost = 0;
        } else {
            meanPostsNumberPerUser = -1;
            meanCommentsNumberPerUser = -1;
            meanCommentsNumberPerPost = -1;
            System.out.println("Incorrect data. There are no users in the database.");
        }
        return statistics;
    }
    public void showStatistics () {

        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Mean number of posts per user: " + meanPostsNumberPerUser);
        System.out.println("Mean number of comments per post: " + meanCommentsNumberPerPost);
        System.out.println("Mean number of comments per user: " + meanCommentsNumberPerUser);
    }

    public double getMeanPostsNumberPerUser() {
        return meanPostsNumberPerUser;
    }

    public double getMeanCommentsNumberPerUser() {
        return meanCommentsNumberPerUser;
    }

    public double getMeanCommentsNumberPerPost() {
        return meanCommentsNumberPerPost;
    }
}