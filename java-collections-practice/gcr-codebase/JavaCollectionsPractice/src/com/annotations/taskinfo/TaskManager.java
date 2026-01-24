package com.annotations.taskinfo;

public class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Ayush")
    public void completeAssignment() {
        System.out.println("Completing annotation assignment");
    }
}
