package InputDeterminForLoop;

public class Sphere implements Shape{

    public static double calculateSurfaceAreaOfSphere(double radius){
        if(radius < 0)
            throw new IllegalArgumentException();
        return 4 * Shape.PI * radius * radius;
    }

    public static double calculateVolumeOfSphere(double radius){
        if(radius < 0)
            throw new IllegalArgumentException();
        return 4 * Shape.PI * radius * radius * radius / 3;
    }

}
