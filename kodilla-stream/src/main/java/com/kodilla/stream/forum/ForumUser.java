package com.kodilla.stream.forum;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int IdNumber;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private int postsQuantity;

    public ForumUser(final int idNumber, final String username, final char sex, final LocalDate dateOfBirth, int postsQuantity) {
        this.IdNumber = idNumber;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return getIdNumber() == forumUser.getIdNumber() && getSex() == forumUser.getSex() && Objects.equals(getUsername(), forumUser.getUsername()) && Objects.equals(getDateOfBirth(), forumUser.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdNumber(), getUsername(), getDateOfBirth());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IdNumber=" + IdNumber +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
