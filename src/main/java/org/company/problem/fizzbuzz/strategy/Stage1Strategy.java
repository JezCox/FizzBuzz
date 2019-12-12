package org.company.problem.fizzbuzz.strategy;

public class Stage1Strategy extends Strategy {

    @Override
    public boolean isFizz(int num) {
        return (num % FIZZ_NUMBER==0);
    }

    @Override
    public boolean isBuzz(int num) {
        return (num % BUZZ_NUMBER==0);
    }

    @Override
    public boolean isFizzBuzz(int num) {
        return isFizz(num) && isBuzz(num);
    }
}
