package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

        public ArrayList<Integer> exterminate (ArrayList < Integer > numbers) {

            int i = numbers.size();
            while (i != 0) {
                i--;
                if (numbers.get(i) % 2 != 0) {
                    System.out.println(i + " is odd");
                    numbers.remove(i);
                } else {
                    System.out.println(i + " is even");
                }
            }
            System.out.println("extermination of odd" + "(" + numbers.size() + " )" + "numbers has been completed, normal ArrayList size: " + numbers.size());
            return numbers;

        }
    }



