package org.company.problem.fizzbuzz.results;

public abstract class Result {

    private int underlying;

    public Result(int underlying) {
        this.underlying = underlying;
    }

    public int getUnderlying() {
        return underlying;
    }
}
