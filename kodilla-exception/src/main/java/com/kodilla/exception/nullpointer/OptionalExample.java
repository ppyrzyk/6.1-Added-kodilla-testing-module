package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1");

        Optional<User> optionalUser = Optional.ofNullable(user);
//      metoda orElse , która pobiera i zwraca opakowaną zmienną,
//      a jeżeli trafi na null, to zwraca obiekt, który został przekazany jako argument metody
//        String username =
//                optionalUser.orElse(new User("")).getName();
//        System.out.println(username);
//        metoda ifPresent
        optionalUser.ifPresent((u -> System.out.println(u.getName())));

    }
}
