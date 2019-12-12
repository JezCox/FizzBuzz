package org.company.problem.fizzbuzz.results;

public final class FizzResult extends Result {

    public FizzResult(int underlying) {
        super(underlying);
    }

    @Override
    public String toString() {
        return "Fizz";
    }
}
