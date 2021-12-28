package Homework.Inheritance;

public class Shape {

    int numOfSide;
    int numOfAngle;

    public Shape(int numOfSide, int numOfAngle){
        this.numOfSide = numOfSide;
        this.numOfAngle = numOfAngle;
    }

    public void showNumOfSide(){
        System.out.println("The number of side is " + numOfSide);
    }

    public void showNumOfAngle(){
        System.out.println("The number of angle " + numOfAngle);
    }

}
