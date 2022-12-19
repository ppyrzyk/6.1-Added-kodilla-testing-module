package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {


    @Test
    public void getLastLog() {
        //Given
        Logger.getInstance().log("test log");
        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        assertEquals("test log",lastLog);

    }
}
