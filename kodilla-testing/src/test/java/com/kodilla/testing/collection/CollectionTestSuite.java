package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class CollectionTestSuite {

    ArrayList<Integer> normalArrayList = new ArrayList<>();
    ArrayList<Integer> emptyArrayList = new ArrayList<>();

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @DisplayName("czy klasa zachowuje się poprawnie, gdy lista jest pusta,")

    @Test
    public void testOddNumberExterminatorEmptyList() {
//        Given

        System.out.println("Size of empty list: " + emptyArrayList.size());

//        when
        OddNumbersExterminator completedList = new OddNumbersExterminator(emptyArrayList);
        completedList.exterminate(emptyArrayList);
        System.out.println("Size of empty list: " + emptyArrayList.size());
        System.out.println("Size of normal list: " + normalArrayList.size());
//        Then
        Assertions.assertEquals(normalArrayList, emptyArrayList);
    }


    @Test
    @DisplayName( "czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste.")
    public void testOddNumbersExterminatorNormalList() {

        //czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste
        //Given

        for (int i=0; i<16; i++) {
            normalArrayList.add(i);
            if (normalArrayList.get(i) % 2 == 0) {
                emptyArrayList.add(normalArrayList.get(i));
            }
        }
        System.out.println("list generated, normal arrayList size: " + normalArrayList.size());
        //When
        OddNumbersExterminator completedList = new OddNumbersExterminator(normalArrayList);
        completedList.exterminate(normalArrayList);

        //Then
        Assertions.assertEquals(emptyArrayList, normalArrayList);
    }
}