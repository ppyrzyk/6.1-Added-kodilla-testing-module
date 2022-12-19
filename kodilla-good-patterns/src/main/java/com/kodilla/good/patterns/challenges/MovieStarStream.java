package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStarStream {

    public static void main(String[] args) {

        MovieStore MS = new MovieStore();

        String titlesList = MS.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining("!!! "));

        System.out.println(titlesList);

    }
}
