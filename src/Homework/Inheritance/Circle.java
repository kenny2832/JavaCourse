package Homework.Inheritance;

public class Circle extends Shape{

    double radius;
    final double PI = 3.14;

    public Circle(int numOfSide, int numOfAngle, double radius){
        super(numOfSide, numOfAngle);
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2 * PI * radius;
    }

    public double calculateArea(){
        return PI * radius * radius;
    }

}
