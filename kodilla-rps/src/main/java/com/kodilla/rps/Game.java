package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private ComputerChoice computerChoice = new ComputerChoice(new Random());
    private PlayersChoice playersChoice = new PlayersChoice(scanner);
    private RunOfRps runOfRps = new RunOfRps();
    private boolean finishedRound = false;
    private int userScore = 0;
    private int computerScore = 0;




    public void start() {
        String userName = RunOfRps.enterName(scanner);
        int finalScore = RunOfRps.roundsChoice(scanner);

//        System.out.println(runOfRps.RPSManual());

        while (!finishedRound) {
            String computer = computerChoice.play();
            String player = playersChoice.play();
            if("unknown".equals(player)){
                System.out.println("Your move is not valid");
            }


           if (player.equals(computer)) {
                System.out.println("A draw");
                System.out.println(userName + " " + userScore + " vs " + computerScore);
            } else if
            (("Rock".equals(player) && "Scissors".equals(computer)) ||
                            ("Paper".equals(player) && "Rock".equals(computer)) ||
                            ("Scissors".equals(player) && "Paper".equals(computer))) {
                System.out.println(userName + " wins this round");
                userScore++;
                RunOfRps.checkScore(userName, userScore, computerScore);
            } else {
                System.out.println("You lose!!");
                computerScore++;
                RunOfRps.checkScore(userName, userScore, computerScore);

                    }
                            if( userScore + computerScore== finalScore) {
                                System.out.println("The end");
                                System.out.println(userScore > computerScore ?
                                        "You Win= " + userScore + " vs Computer " + computerScore : "You lost " +
                                        userScore + " vs Computer " + computerScore);
                                RunOfRps.playAgain(scanner);
                                finishedRound = true;
                                }
            }
        }
    }
