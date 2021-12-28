package Homework.Inheritance;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(int numOfSide, int numOfAngle, double length, double width){
        super(numOfSide,numOfAngle);
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    public double calculateArea(){
        return length * width;
    }

}
