package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ForumStatisticsTestSuite {

    public List<String> generateUsersList(int usersNumber) {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < usersNumber; i++) {
            usersNames.add("user" + i);
        }
        return usersNames;
    }

    List<String> usersNames0 = new ArrayList<>();
    List<String> usersNames57 = generateUsersList(57);
    List<String> usersNames100 = generateUsersList(100);

    @Mock
    private Statistics statisticsMock;

    ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

    @Test
    void testZeroPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames57);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        assertEquals(0, forumStatistics.getMeanPostsNumberPerUser());
        assertEquals(0, forumStatistics.getMeanCommentsNumberPerPost());
        assertEquals(0, forumStatistics.getMeanCommentsNumberPerUser());
    }

    @Test
    void test1000Posts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames57);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(17.54, forumStatistics.getMeanPostsNumberPerUser(), 0.01);
        assertEquals(0.5, forumStatistics.getMeanCommentsNumberPerPost(), 0.01);
        assertEquals(8.77, forumStatistics.getMeanCommentsNumberPerUser(), 0.01);
    }

    @Test
    void testZeroComments() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames57);
        when(statisticsMock.postsCount()).thenReturn(39);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.68, forumStatistics.getMeanPostsNumberPerUser(), 0.01);
        assertEquals(0, forumStatistics.getMeanCommentsNumberPerPost(), 0.01);
        assertEquals(0, forumStatistics.getMeanCommentsNumberPerUser(), 0.01);
    }

    @Test
    void testPostsOverComments() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames57);
        when(statisticsMock.postsCount()).thenReturn(39);
        when(statisticsMock.commentsCount()).thenReturn(17);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.68, forumStatistics.getMeanPostsNumberPerUser(), 0.01);
        assertEquals(0.44, forumStatistics.getMeanCommentsNumberPerPost(), 0.01);
        assertEquals(0.3, forumStatistics.getMeanCommentsNumberPerUser(), 0.01);
    }

    @Test
    void testCommentsOverPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames57);
        when(statisticsMock.postsCount()).thenReturn(17);
        when(statisticsMock.commentsCount()).thenReturn(39);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.3, forumStatistics.getMeanPostsNumberPerUser(), 0.01);
        assertEquals(2.29, forumStatistics.getMeanCommentsNumberPerPost(), 0.01);
        assertEquals(0.68, forumStatistics.getMeanCommentsNumberPerUser(), 0.01);
    }

    @Test
    void testZeroUsers() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames0);
        when(statisticsMock.postsCount()).thenReturn(375);
        when(statisticsMock.commentsCount()).thenReturn(750);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(-1, forumStatistics.getMeanPostsNumberPerUser());
        assertEquals(-1, forumStatistics.getMeanCommentsNumberPerPost());
        assertEquals(-1, forumStatistics.getMeanCommentsNumberPerUser());
    }

    @Test
    void test100Users() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames100);
        when(statisticsMock.postsCount()).thenReturn(375);
        when(statisticsMock.commentsCount()).thenReturn(750);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3.75, forumStatistics.getMeanPostsNumberPerUser());
        assertEquals(2, forumStatistics.getMeanCommentsNumberPerPost());
        assertEquals(7.5, forumStatistics.getMeanCommentsNumberPerUser());
    }
}