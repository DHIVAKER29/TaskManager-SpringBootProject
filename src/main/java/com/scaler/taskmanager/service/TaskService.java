package com.scaler.taskmanager.service;

import com.scaler.taskmanager.entities.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {
    private ArrayList<TaskEntity> t - new ArrayList<>();
    private int taskId = 1;

    void addTask(String title, String description, String deadline) {
            TaskEntity task = new TaskEntity();
            task.setId(taskId);
            task.setTitle(title);
            task.setDescription(description);
            task.setDeadline(new Date(deadline)); // TODO : Validate date format YYYY-MM-DD
            task.setCompleted(false);
            tasks.add(task);
            taskId++;
    }

    public ArrayList<TaskEntity> getTasks() {
        return tasks;
    }

    TaskEntity getTaskById(int id) {
        for (TaskEntity task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

}
