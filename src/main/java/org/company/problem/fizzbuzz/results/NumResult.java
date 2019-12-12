package org.company.problem.fizzbuzz.results;

public final class NumResult extends Result {

    public NumResult(int underlying) {
        super(underlying);
    }

    @Override
    public String toString() {
        return String.valueOf(getUnderlying());
    }
}
