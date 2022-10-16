
package com.kodilla.testing.collection;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {
    private static int counter;

    @Before
    public void before() {
        System.out.println("Begin test : " + counter );
    }
    @After
    public void after() {
        System.out.println("End test : " + counter);
        counter++;
    }

    @DisplayName("Checking if the list is empty")


    @Test
//    test 0
    public void testOddNumbersExterminatorEmptyList() {
//given
        List<Integer> numbers = Arrays.asList();
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        oddNumbers.exterminate(numbers);
//when
        List<Integer> listEven = oddNumbers.exterminate(numbers);
//then
        Assert.assertEquals(numbers.isEmpty(), listEven.isEmpty());
    }
    @DisplayName(
            "Checking if the list has even numbers"

    )
    @Test
//     test 1
    public void testOddNumbersExterminatorNormalList() {
//given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        oddNumbers.exterminate(numbers);
//when
        List<Integer> listEven = oddNumbers.exterminate(numbers);
//then
        Assert.assertThat(listEven, CoreMatchers.hasItems(2, 4, 6, 8, 10));
    }
}