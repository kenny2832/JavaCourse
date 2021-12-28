package Homework.Inheritance;

public class Square extends Rectangle{

    boolean isLengthEqual;

    public Square(int numOfSide, int numOfAngle, double length, double width, boolean isLengthEqual){
        super(numOfSide, numOfAngle, length, width);
        this.isLengthEqual = isLengthEqual;
    }


}
