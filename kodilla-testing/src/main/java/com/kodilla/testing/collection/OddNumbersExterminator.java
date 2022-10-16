package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.*;
import java.util.List;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer> evenNumList = new ArrayList<Integer>();
        for (Integer theNumber : numbers) {
            if (theNumber % 2 == 0) {
                evenNumList.add(theNumber);
            }
        }
        return evenNumList;
    }
}