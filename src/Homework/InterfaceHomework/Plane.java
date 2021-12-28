package Homework.InterfaceHomework;

public class Plane implements Vehicle, Flying{

    @Override
    public void fly() {
        System.out.println("Plane is flying!");
    }

    @Override
    public void speed() {
        System.out.println("Plane can speed up to 500 miles/hour");
    }
}
