package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
//        given
        ApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
//        when
        board.getToDoList().getTasks().add("test one");
        board.getInProgressList().getTasks().add("test two");
        board.getDoneList().getTasks().add("test three");
//        then
        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getDoneList().getTasks().size());
    }
}
