package com.kodilla.stream.forumuser;

import java.time.LocalDate;


public final class ForumUser {

    final int idNumber;
    final String username;
    final char sex;
    final LocalDate dateOfBirth;
    final int numberOfPosts;

    public ForumUser(final int idNumber, final String username, final char sex,  final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, int numberOfPosts) {
        this.idNumber = idNumber;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
