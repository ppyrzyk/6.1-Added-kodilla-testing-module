package com.kodilla.patterns.generics;

public class Displayer <v> //  <v> typ generyczny klasa paramertryzowana typem
// - w miejscu <v> wstawiamy typ jaki chcemy użyć ( String,Integer, Double etc)
{
    public void display(v value) {
        System.out.println(value);
    }
}
