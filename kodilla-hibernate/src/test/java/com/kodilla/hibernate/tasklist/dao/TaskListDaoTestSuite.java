package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "FINISHED";

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("c&fd", LISTNAME);
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(1,readTaskList.size());

        //CleanUp
        int id = readTaskList.getFirst().getId();
        taskListDao.deleteById(id);
    }
}