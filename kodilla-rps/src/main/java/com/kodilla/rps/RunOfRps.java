package com.kodilla.rps;

import java.util.Scanner;

public class RunOfRps {

    private int roundsChoice;


    public String RPSManual(){
        return "Press 1- Rock, Press 2 - Paper, 3 - Scissors, n - to start a new game, x - to end the game";
    }
    public static String enterName(Scanner scanner) {
        String userName;
        System.out.println("Please enter your name");
        userName= scanner.next();
        return userName;
    }
    public static int roundsChoice(Scanner scanner) {
        System.out.println("How many rounds would you like to play?");
        int roundsChoice = 0;
        boolean roundsToPlay = false;
        while(!roundsToPlay) {
            String value = scanner.next();
            try {
                roundsChoice = Integer.parseInt(value);
                if (roundsChoice == 0) {
                    System.out.println("Incorrect- please enter a number greater than ZERO");
                } else {
                    roundsToPlay = true;
                }
            }
                catch(NumberFormatException l) {
                    System.out.println("The input must be a number");
                }
        }
    return roundsChoice;
    }

    public static boolean playAgain(Scanner scanner ){
        boolean keyChoice = false;
        while(!keyChoice) {
            System.out.println("To play again press 'n', to quit select 'x'");
            switch(scanner.next()){
                case "n":
                    Game game = new Game();
                    game.start();
                case "x":
                    System.out.println("Thank you for playing");
                    keyChoice= true;
                    break;
            }
        }
        return false;
    }
    public static void checkScore(String userName, int userScore, int computerScore){
        System.out.println(userName + " " + userScore + " vs Computer: " + computerScore);
    }
}
