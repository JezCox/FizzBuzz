package org.company.problem.fizzbuzz.processing;

import org.company.problem.fizzbuzz.results.Results;

import java.util.List;

public interface Processor {
    Results process(List<Integer> input);
}
