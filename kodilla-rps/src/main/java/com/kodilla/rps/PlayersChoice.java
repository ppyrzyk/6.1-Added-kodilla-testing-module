
package com.kodilla.rps;

import java.util.List;
import java.util.Scanner;

public class PlayersChoice implements PlayRPS {

    private Scanner scanner;
    private static List<Integer> moves = List.of(1,2,3);

    public PlayersChoice(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String play() {
        System.out.println("Select: \n 1-Rock, \n 2-Paper, \n 3-Scissors");
        int selection= this.scanner.nextInt();
        if(!moves.contains(selection)){
         return "unknown";
        }
        return PlayRPS.chosen[selection-1];
    }

}