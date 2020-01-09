package org.company.problem.fizzbuzz.processing;

import org.company.problem.fizzbuzz.factories.IntProcessingFactory;
import org.company.problem.fizzbuzz.results.Result;
import org.company.problem.fizzbuzz.results.Results;
import org.company.problem.fizzbuzz.strategy.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzProcessor implements Processor {

    private IntProcessingFactory resultsFactory;

    public FizzBuzzProcessor(Strategy strategy) {
        resultsFactory = IntProcessingFactory.getFizzBuzzResultsFactory(strategy);
    }

    @Override
    public Results process(List<Integer> input) {
        List<Result> factOutput = input.stream()
                .map(resultsFactory::convert)
                .collect(Collectors.toList());

        Results results = new Results();
        factOutput.forEach(results::add);
        return results;
    }
}
