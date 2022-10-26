package com.kodilla.stream.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        List<Integer> numberList = new ArrayList<>();
        for( int i=0; i<20; i++){
            numberList.add(i);
        }
        //When
        Double average = ArrayOperations.getAverage(numberList);
        //Then
        Assertions.assertEquals(9.5, average);
    }
}