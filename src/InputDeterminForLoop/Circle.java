package InputDeterminForLoop;

public class Circle implements Shape{

    public static double calculatePerimeterOfCircle(double radius){
        if(radius < 0)
            throw new IllegalArgumentException();
        return 2 * Shape.PI * radius;
    }

    public static double calculateAreaOfCircle(double radius){
        if(radius < 0)
            throw new IllegalArgumentException();
        return Shape.PI * radius * radius;
    }

}
