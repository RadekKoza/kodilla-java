package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TaskList {
    private final List<Task> tasks = new LinkedList<>();
    private final String name;

    public TaskList(final String name) {
        this.name = name;
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }
    public List<Task> getTasks() {
        return new LinkedList<>(tasks);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                ", name='" + name + '\'' +
                "tasks=\n" + tasks + "\n" +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList taskList)) return false;
        return name.equals(taskList.name);
    }
}
