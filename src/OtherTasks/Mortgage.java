package OtherTasks;

import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        long principal = scanner.nextLong();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextFloat();
        System.out.print("Period: ");
        int period = scanner.nextByte();


        double monthInterestRate = annualInterestRate * 0.01 / 12;

        double mortgage = (principal * monthInterestRate  * Math.pow((1 + monthInterestRate),12 * period)) / (Math.pow((1 + monthInterestRate),12 * period) -1);

        System.out.println(mortgage);
    }

}
