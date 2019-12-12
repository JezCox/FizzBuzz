package org.company.problem.fizzbuzz;

import org.company.problem.fizzbuzz.processing.FizzBuzzProcessor;
import org.company.problem.fizzbuzz.results.Results;
import org.company.problem.fizzbuzz.setup.Setup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzGenerator {

    private List<Integer> input = new ArrayList<>(500);
    private Setup setup = Setup.getPreferredSetup();

    public FizzBuzzGenerator(int[] input) {
        this.input = Arrays.stream(input).boxed().collect(Collectors.toList());
    }

    public FizzBuzzGenerator(int[] input, Setup setup) {
        this(input);
        this.setup = setup;
    }

    public void generate() {
        Results results = new FizzBuzzProcessor(setup.getStrategy()).process(input);
        setup.getOutStream().outputResults(results);
    }

}
