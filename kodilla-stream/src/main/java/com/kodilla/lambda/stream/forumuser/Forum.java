package com.kodilla.lambda.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userNameList = new ArrayList<>();


    public Forum() {
        userNameList.add(new ForumUser(196601, "Kangoo", 'M', 1990, 4, 9, 8));
        userNameList.add(new ForumUser(198703, "Camel", 'F', 1997, 12, 13, 7));
        userNameList.add(new ForumUser(194563, "Elephant", 'M', 1995, 2, 21, 3));
        userNameList.add(new ForumUser(123423, "Snake", 'F', 1999, 8, 4, 4));
        userNameList.add(new ForumUser(189934, "Ant", 'F', 1996, 10, 29, 5));
        userNameList.add(new ForumUser(138503, "Horse", 'M', 2004, 5, 1, 2));
        userNameList.add(new ForumUser(188800, "tiger", 'M', 2005, 11, 23, 5));
        userNameList.add(new ForumUser(134521, "Lion", 'M', 2007, 7, 25, 9));
        userNameList.add(new ForumUser(134597, "Cheetah", 'F', 2006, 6, 13, 11));
    }
    public List<ForumUser> getUserList () {
        return new ArrayList<>(userNameList);
    }

}
