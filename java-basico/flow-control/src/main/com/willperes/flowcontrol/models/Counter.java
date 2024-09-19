package models;

import exceptions.InvalidCounterParametersException;

public class Counter {
    public static void count(int firstParameter, int secondParameter) throws InvalidCounterParametersException {
        if (firstParameter > secondParameter) {
            throw new InvalidCounterParametersException("The second parameter must be bigger than the first");
        }

        final int count = secondParameter - firstParameter;
        for (int i = 0; i < count; i++) {
            final int numberToPrint = 1 + i;
            System.out.println("Printing number " + numberToPrint);
        }
    }
}
