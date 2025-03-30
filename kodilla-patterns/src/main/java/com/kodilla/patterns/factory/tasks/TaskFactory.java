package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";
    public static final TaskList taskList = new TaskList(new ArrayList<>());

    public final Task createTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("grocery", "milk", 2.0);
            case PAINTING -> new PaintingTask("bikePainting", "green", "bike");
            case DRIVING -> new DrivingTask("ofMeetingDrive", "Kraków", "car");
            default -> null;
        };
    }

    public void saveTask(Task newTask) {
        taskList.getTasks().add(newTask);
    }

}