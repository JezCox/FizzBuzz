package org.company.problem.fizzbuzz.factories;

import org.company.problem.fizzbuzz.results.Result;
import org.company.problem.fizzbuzz.strategy.Strategy;

// Abstract factory for "int processors"
public interface IntProcessingFactory {

    static FizzBuzzResultsFactory getFizzBuzzResultsFactory(Strategy strategy) {
        return new FizzBuzzResultsFactory(strategy);
    }

    Result convert(int num);

    }
