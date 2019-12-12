package org.company.problem.fizzbuzz;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try {
            int[] input = IntStream.rangeClosed(1,100).toArray();
            FizzBuzzGenerator generator = new FizzBuzzGenerator(input);
            generator.generate();

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
