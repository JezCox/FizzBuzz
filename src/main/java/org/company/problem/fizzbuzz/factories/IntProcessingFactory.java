package org.company.problem.fizzbuzz.factories;

import org.company.problem.fizzbuzz.results.Result;
import org.company.problem.fizzbuzz.strategy.Strategy;

// Abstract factory for "int processors"
public abstract class IntProcessingFactory {

    public static FizzBuzzResultsFactory getFizzBuzzResultsFactory(Strategy strategy) {
        return new FizzBuzzResultsFactory(strategy);
    }

    public abstract Result convert(int num);

    }
