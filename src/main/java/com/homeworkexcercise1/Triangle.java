package com.homeworkexcercise1;

public class Triangle extends Shape {
    private final int a;
    private final int b;
    private final int c;
    private final int h;

    public Triangle(TriangleBuilder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.h = builder.h;
    }

    public static class TriangleBuilder {
        private int a;
        private int b;
        private int c;
        private int h;

        public TriangleBuilder() {
        }

        public TriangleBuilder a(int a) {
            this.a = a;
            return this;
        }

        public TriangleBuilder b(int b) {
            this.b = b;
            return this;
        }

        public TriangleBuilder c(int c) {
            this.c = c;
            return this;
        }

        public TriangleBuilder h(int h) {
            this.h = h;
            return this;
        }

        public Triangle build() {
            return new Triangle(this);
        }
    }

    @Override
    public double calculateArea() {
        return a / 2 * h;
    }

    @Override
    public double calculateCircumference() {
        return (a + b + c);
    }
}
