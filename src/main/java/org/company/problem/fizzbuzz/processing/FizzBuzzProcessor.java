package org.company.problem.fizzbuzz.processing;

import org.company.problem.fizzbuzz.factories.IntProcessingFactory;
import org.company.problem.fizzbuzz.results.Results;
import org.company.problem.fizzbuzz.strategy.Strategy;

import java.util.List;

public class FizzBuzzProcessor implements Processor {

    private IntProcessingFactory resultsFactory;

    public FizzBuzzProcessor(Strategy strategy) {
        resultsFactory = IntProcessingFactory.getFizzBuzzResultsFactory(strategy);
    }

    @Override
    public Results process(List<Integer> input) {
        Results results = new Results();
        for(Integer num: input) {
            results.add(resultsFactory.convert(num));
        }
        return results;
    }
}
