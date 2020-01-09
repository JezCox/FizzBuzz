package org.company.problem.fizzbuzz;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Main {

    static Logger logger = Logger.getLogger("FizzBuzz");

    public static void main(String[] args) {
        try {
            int[] input = IntStream.rangeClosed(1,100).toArray();
            FizzBuzzGenerator generator = new FizzBuzzGenerator(input);
            generator.generate();
            logger.log(Level.INFO, () -> "Successfully generated FizzBuzz");

        } catch(Exception ex) {
            logger.log(Level.SEVERE, () -> "Failed to run : " + ex.getMessage());
        }
    }
}
