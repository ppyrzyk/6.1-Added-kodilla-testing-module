package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    void testRead(){
//        given
        ApplicationContext context =new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);
//        when & then
        reader.read();

    }
    @Test
    void testConditional(){
//        Given
        ApplicationContext context =new AnnotationConfigApplicationContext(ReaderConfig.class);
//        When
        boolean book2Exists = context.containsBean("book2");
//        Then
        System.out.println("Book 2 was found in the container " + book2Exists);
        }
}
