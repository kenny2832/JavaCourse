package InputDeterminForLoop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    /**
     * Accept a number from user as radius , calculate a circle perimeter and area using the radius ,
     * and calculate a sphere surface area and volume.
     * remind enter again when accept an invalid data.
     * handle any exception in this case
     * */

    public static void main(String[] args) {

        System.out.print("Please enter radius: ");
        double radius = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                radius = scanner.nextDouble();
                try {
                    double perimeter = Circle.calculatePerimeterOfCircle(radius);
                    double area = Circle.calculateAreaOfCircle(radius);
                    double surfaceArea = Sphere.calculateSurfaceAreaOfSphere(radius);
                    double volume = Sphere.calculateVolumeOfSphere(radius);
                    System.out.println("The circle 's perimeter is " + perimeter + "\nThe circle 's area is "
                            + area + "\nThe sphere 's surfaceArea is " + surfaceArea + "\nThe sphere 's volume is " + volume);
                } catch (IllegalArgumentException ex) {
                    System.out.print("Cannot input negative value,please input again: ");
                }
            } catch (InputMismatchException ex) {
                radius = -1;
                System.out.print("Invalid value,please input again: ");
            }
        }while (radius < 0);

    }








}
