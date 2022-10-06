package com.homeworkexcercise1;

public class Rectangle extends Shape {
    private final int a;
    private final int b;

    public Rectangle(RectangleBuilder builder, int a) {
        this.a = builder.a;
        this.b = builder.b;
    }

    public static class RectangleBuilder {
        private int a;
        private int b;

        public RectangleBuilder() {
        }

        public RectangleBuilder a(int a) {
            this.a = a;
            return this;
        }

        public RectangleBuilder b(int b) {
            this.b = b;
            return this;
        }

        public Rectangle build() {
            return new Rectangle(this, b);
        }
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateCircumference() {
        ;
        return 2 * (a + b);
    }
}
