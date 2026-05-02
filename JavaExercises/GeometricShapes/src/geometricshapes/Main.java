package geometricshapes;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        square.setSide(4);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());

        rectangle.setWidth(5);
        rectangle.setHeight(3);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        circle.setRadius(1.5);
        System.out.println("Circle circumference: " + circle.calculateCircumference());
        System.out.println("Circle area: " + circle.calculateArea());

        triangle.setSide1(5);
        triangle.setSide2(3);
        triangle.setSide3(5);
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle type: " + triangle.determineType());

        triangle.setSide1(5);
        triangle.setSide2(4);
        triangle.setSide3(1);
        System.out.println("Triangle type: " + triangle.determineType());

        triangle.setSide1(5);
        triangle.setSide2(5);
        triangle.setSide3(5);
        System.out.println("Triangle type: " + triangle.determineType());
    }
}
