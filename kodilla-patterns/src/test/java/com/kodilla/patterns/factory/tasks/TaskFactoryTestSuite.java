package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void taskFactoryDriving(){
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();
//        Then
        assertTrue(driving.isTaskExecuted());
        assertEquals("driving", driving.getTaskName());
    }
    @Test
    void taskFactoryShopping() {
//    Given
        TaskFactory factory = new TaskFactory();
//        When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();
//        Then
        assertTrue(shopping.isTaskExecuted());
        assertEquals("buying", shopping.getTaskName());
    }
    @Test
    void taskFactoryPainting() {
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        painting.executeTask();
//        Then
        assertTrue(painting.isTaskExecuted());
        assertEquals("painting", painting.getTaskName());
    }
}
