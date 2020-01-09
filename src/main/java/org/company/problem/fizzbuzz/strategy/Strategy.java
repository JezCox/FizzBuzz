package org.company.problem.fizzbuzz.strategy;

public abstract class Strategy {
    public abstract boolean isFizz(int num);
    public abstract boolean isBuzz(int num);
    public abstract boolean isFizzBuzz(int num);

    final protected static int FIZZ_NUMBER = 3;
    final protected static int BUZZ_NUMBER = 5;

}
