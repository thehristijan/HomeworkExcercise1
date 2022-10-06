package com.homeworkexcercise1;

public class Circle extends Shape {
    private final int r = 5;

    private static Circle single_instance = null;

    private Circle() {
    }

    public static Circle getinstance() {
        if (single_instance == null) single_instance = new Circle();
        return single_instance;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (r * r);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * r;
    }
}
