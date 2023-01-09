package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass){
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("buying","bags", 4.0);
            case PAINTING -> new PaintingTask("painting", "red", "wall");
            case DRIVING -> new DrivingTask("driving", "home", "bicycle");
            default -> null;
        };
    }
}
