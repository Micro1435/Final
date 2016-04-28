package com.example.michael.montella_final;

/**
 * Created by Michael on 4/28/16.
 */
public class Workout {
    private String name;
    private Workout(String newName) {
        this.name = newName;
    }
    public static final Workout[] cardio = {
            new Workout("Running"),
            new Workout("Cycling"),
            new Workout("Swimming")
    };

    public static final Workout[] strength = {
            new Workout("Pull Ups"),
            new Workout("Push Ups"),
            new Workout("Squats")
    };

    public static final Workout[] stretching = {
            new Workout("Back"),
            new Workout("Shoulders"),
            new Workout("Legs")
    };

    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}
