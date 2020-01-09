package org.company.problem.fizzbuzz.output;

import org.company.problem.fizzbuzz.results.Results;

public class SysOutStream implements OutStream {

    @Override
    public void outputResults(Results results) {
        results.forEach(System.out::println);
    }
}
