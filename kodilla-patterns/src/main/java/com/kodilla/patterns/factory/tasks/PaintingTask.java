package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

     String taskName;
     String color;
     String whatToPaint;

    public String getColor() {
        return color;
    }

    private boolean status;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        status= true;
        return "painting";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return status;
    }

}
