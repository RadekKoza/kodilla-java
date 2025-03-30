package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static com.kodilla.patterns.factory.tasks.TaskFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask(SHOPPING);
        boolean executedNew = shoppingTask.isTaskExecuted();
        System.out.println(shoppingTask.toString());
        shoppingTask.executeTask();
        boolean executed = shoppingTask.isTaskExecuted();
        //Then
        assertEquals("grocery: what to buy: milk, amount: 2.0", shoppingTask.toString());
        assertFalse(executedNew);
        assertTrue(executed);
    }

    @Test
    public void testTaskFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask(PAINTING);
        System.out.println(paintingTask.toString());
        paintingTask.executeTask();
        //Then
        assertEquals("bikePainting: what color: green, what to paint: bike", paintingTask.toString());
    }

    @Test
    public void testTaskFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(DRIVING);
        System.out.println(drivingTask.toString());
        drivingTask.executeTask();
        //Then
        assertEquals("ofMeetingDrive: where to go: Kraków, vehicle: car", drivingTask.toString());
    }

}