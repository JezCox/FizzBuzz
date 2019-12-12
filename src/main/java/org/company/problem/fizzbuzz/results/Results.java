package org.company.problem.fizzbuzz.results;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Results implements Iterable<Result> {

    private final List<Result> results = new ArrayList<>(500);

    @Override
    public Iterator<Result> iterator() {
        return results.iterator();
    }

    public void add(Result result) {
        results.add(result);
    }

}
