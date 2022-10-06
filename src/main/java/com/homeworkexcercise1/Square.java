package com.homeworkexcercise1;

public class Square extends Shape {
    private final int a;

    public Square(SquareBuilder builder) {
        this.a = builder.a;
    }

    public static class SquareBuilder {
        private int a;

        public SquareBuilder() {
        }

        public SquareBuilder a(int a) {
            this.a = a;
            return this;
        }

        public Square build() {
            return new Square(this);
        }
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculateCircumference() {
        return a * 4;
    }
}