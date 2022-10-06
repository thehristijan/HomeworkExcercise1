import com.homeworkexcercise1.Circle;
import com.homeworkexcercise1.Rectangle;
import com.homeworkexcercise1.Square;
import com.homeworkexcercise1.Triangle;

public class Application {
    public static void main(String[] args) {
        Square square = new Square.SquareBuilder().a(10).build();
        System.out.println("Calculated area of square using formula (a * a) is: " + square.calculateArea());
        System.out.println("Calculated circumference of square using formula (a * 4) is: " + square.calculateCircumference());
        Triangle triangle = new Triangle.TriangleBuilder().a(10).b(5).c(4).h(3).build();
        System.out.println("Calculated area of triangle using formula (a/2 * h) is: " + triangle.calculateArea());
        System.out.println("Calculated circumference of triangle using formula (a + b + c) is: " + triangle.calculateCircumference());
        Rectangle rectangle = new Rectangle.RectangleBuilder().a(10).b(5).build();

        System.out.println("Calculated area of rectangle using formula a * b is: " + rectangle.calculateArea());
        System.out.println("Calculated circumference of rectangle using formula a + b + c is: " + rectangle.calculateCircumference());
        Circle circle = Circle.getinstance();
        System.out.println("Calculated area of circle using formula pi* (r*r) is: " + circle.calculateArea());
        System.out.println("Calculated circumference of circle using formula 2 * pi * r is: " + circle.calculateCircumference());
    }
}
