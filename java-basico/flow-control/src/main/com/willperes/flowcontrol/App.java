import java.util.Scanner;

import exceptions.InvalidCounterParametersException;
import models.Counter;

public interface App {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("\n\nWelcome to the counter!");
        System.out.println("\nYou will have to insert two numbers before starting the count.");
        System.out.println("\nRemember: the first number must be lower than the second number");

        System.out.println("\n\nPlease insert the first number:");
        final int firstParameter = sc.nextInt();

        System.out.println("\nPlease insert the second number:");
        final int secondParameter = sc.nextInt();

        try {
            Counter.count(firstParameter, secondParameter);
        } catch (InvalidCounterParametersException e) {
            System.out.println("The second parameter must be bigger than the first");
        }

        sc.close();
    }
}
