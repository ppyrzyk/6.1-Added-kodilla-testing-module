package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations(){
//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
//        When
        double result1 =  calculator.add(2,3);
        double result2 = calculator.sub(10,5);
        double result3 = calculator.div(25,5);
        double result4 = calculator.mul(2.5,2);
//        Then
        assertEquals(5,result1);
        assertEquals(5,result2);
        assertEquals(5,result3);
        assertEquals(5,result4);

    }
}
