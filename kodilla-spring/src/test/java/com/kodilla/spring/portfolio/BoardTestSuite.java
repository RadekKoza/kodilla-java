package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        String task1 = "This is task1";
        String task2 = "This is task2";
        String task3 = "This is task3";

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask(task1);
        board.getInProgressList().addTask(task2);
        board.getDoneList().addTask(task3);
        //Then
        System.out.print("List of tasks to be done: ");
        board.getToDoList().getTasksList().stream()
                .forEach(t -> System.out.println(t.toString()));
        System.out.print("List of tasks in progress: ");
        board.getInProgressList().getTasksList().stream()
                .forEach(t -> System.out.println(t.toString()));
        System.out.print("List of tasks done: ");
        board.getDoneList().getTasksList().stream()
                .forEach(t -> System.out.println(t.toString()));
    }
}
