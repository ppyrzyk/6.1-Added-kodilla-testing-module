package com.kodilla.patterns.generics;

public class Application {

    public static void main(String []  args){
        int n = 10;
        Displayer<Integer> displayer =  new Displayer();
        displayer.display(n);

    }
}
