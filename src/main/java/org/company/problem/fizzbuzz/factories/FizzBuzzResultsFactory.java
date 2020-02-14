package org.company.problem.fizzbuzz.factories;

import org.company.problem.fizzbuzz.results.*;
import org.company.problem.fizzbuzz.strategy.Strategy;

public class FizzBuzzResultsFactory implements IntProcessingFactory {

    private final Strategy strategyInUse;

    public FizzBuzzResultsFactory(Strategy strategy) {
        this.strategyInUse = strategy;
    }

    public Result convert(int num) {
        if (strategyInUse.isFizzBuzz(num))
                return new FizzBuzzResult(num);

        if (strategyInUse.isFizz(num))
            return new FizzResult(num);

        if (strategyInUse.isBuzz(num))
            return new BuzzResult(num);

        return new NumResult(num);
    }

}
