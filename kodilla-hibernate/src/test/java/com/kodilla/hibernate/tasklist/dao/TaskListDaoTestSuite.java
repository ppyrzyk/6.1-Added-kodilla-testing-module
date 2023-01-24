package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

        @Autowired
        private TaskListDao taskListDao;
        private static final String LISTNAME = "Test List";

    @Test
    void testFindByListName() {
//        given
    TaskList taskList = new TaskList(LISTNAME, "test");
    taskListDao.save(taskList);
    String listName = taskList.getListName();

//    when
    List<TaskList> readTaskList = taskListDao.findByListName(listName);

//    then
    assertEquals(LISTNAME, readTaskList.get(0).getListName());

//    CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);



    }
}
