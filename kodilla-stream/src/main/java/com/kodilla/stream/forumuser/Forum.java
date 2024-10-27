package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public final class Forum {
    private final Set<ForumUser> users = new HashSet<>();
    public Forum() {
        users.add(new ForumUser(1, "user1", 'M', LocalDate.of(1938,3,2),123));
        users.add(new ForumUser(2, "user2", 'F', LocalDate.of(1980,4,11),14));
        users.add(new ForumUser(3, "user3", 'M', LocalDate.of(1999,6,16),0));
        users.add(new ForumUser(4, "user4", 'M', LocalDate.of(2006,2,1),33));
        users.add(new ForumUser(5, "user5", 'M', LocalDate.of(2008,5,18),47));
        users.add(new ForumUser(6, "user6", 'F', LocalDate.of(1960,11,19),65));
        users.add(new ForumUser(7, "user7", 'M', LocalDate.of(1979,12,15),256));
        users.add(new ForumUser(8, "user8", 'M', LocalDate.of(1988,4,4),39));
        users.add(new ForumUser(9, "user9", 'M', LocalDate.of(1997,10,2),3));
        users.add(new ForumUser(10, "user10", 'F', LocalDate.of(1998,7,23),54));
        users.add(new ForumUser(11, "user11", 'M', LocalDate.of(2007,6,24),75));
        users.add(new ForumUser(12, "user12", 'M', LocalDate.of(2006,9,6),83));
        users.add(new ForumUser(13, "user13", 'F', LocalDate.of(1999,10,5),24));
        users.add(new ForumUser(14, "user14", 'M', LocalDate.of(1988,3,10),15));
        users.add(new ForumUser(15, "user15", 'M', LocalDate.of(2008,1,27),36));
    }

    public Set<ForumUser> getUsersList() {
        return new HashSet<>(users);
    }
}