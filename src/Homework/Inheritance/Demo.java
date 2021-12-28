package Homework.Inheritance;

public class Demo {

    public static void main(String[] args) {

        System.out.println("<-------------------SHAPE----------------------->");
        //shape
        Shape shape = new Shape(12,12);
        shape.showNumOfAngle();
        shape.showNumOfSide();

        System.out.println("<-------------------CIRCLE----------------------->");

        //circle
        Circle circle = new Circle(0,0,5);
        circle.showNumOfAngle();
        circle.showNumOfSide();
        System.out.println("The perimeter of the circle is " + circle.calculatePerimeter());
        System.out.println("The area of the circle is " + circle.calculateArea());

        System.out.println("<---------------------RECTANGLE--------------------->");

        //Rectangle
        Rectangle rectangle = new Rectangle(4,4,12,7);
        rectangle.showNumOfAngle();
        rectangle.showNumOfSide();
        System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimeter());
        System.out.println("The area of the rectangle is " + rectangle.calculateArea());

        System.out.println("<----------------------SQUARE-------------------->");

        //Square
        Square square = new Square(4,4,9,9,true);
        square.showNumOfAngle();
        square.showNumOfSide();
        System.out.println("The perimeter of the square is " + square.calculatePerimeter());
        System.out.println("The perimeter of the square is " + square.calculateArea());

    }
}
