package com.homeworkexcercise1;

public class Square extends Shape {

    private int a = 10;
    @Override
    protected double calculateArea() {
        System.out.println("Calculating area of square with formula a * 4");
        return a * 4;
    }

    @Override
    double calculateCircumference() {
        return 0;
    }
}