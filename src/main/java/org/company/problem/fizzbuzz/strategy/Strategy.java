package org.company.problem.fizzbuzz.strategy;

public abstract class Strategy {

    final protected static int FIZZ_NUMBER = 3;
    final protected static int BUZZ_NUMBER = 5;

    public abstract boolean isFizz(int num);
    public abstract boolean isBuzz(int num);
    public abstract boolean isFizzBuzz(int num);
}
