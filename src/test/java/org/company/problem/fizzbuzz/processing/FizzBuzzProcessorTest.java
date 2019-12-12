package org.company.problem.fizzbuzz.processing;

import org.company.problem.fizzbuzz.results.*;
import org.company.problem.fizzbuzz.strategy.Stage1Strategy;
import org.company.problem.fizzbuzz.strategy.Stage2Strategy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class FizzBuzzProcessorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testProcessorWithStage1Strategy() {
        List<Integer> ret = IntStream.rangeClosed(23, 31).boxed().collect(Collectors.toList());
        FizzBuzzProcessor processor = new FizzBuzzProcessor(new Stage1Strategy());
        Results results = processor.process(ret);

        Iterator<Result> iter = results.iterator();
        Result result = iter.next();
        assertEquals(NumResult.class, result.getClass());
        result = iter.next();
        assertEquals(FizzResult.class, result.getClass());
        result = iter.next();
        assertEquals(BuzzResult.class, result.getClass());
        result = iter.next();
        assertEquals(NumResult.class, result.getClass());
        result = iter.next();
        assertEquals(FizzResult.class, result.getClass());
        result = iter.next();
        assertEquals(NumResult.class, result.getClass());
        result = iter.next();
        assertEquals(NumResult.class, result.getClass());
        result = iter.next();
        assertEquals(FizzBuzzResult.class, result.getClass());
        result = iter.next();
        assertEquals(NumResult.class, result.getClass());

    }

    @Test
    public void testProcessorWithStage2Strategy() {
        List<Integer> ret = IntStream.rangeClosed(23, 31).boxed().collect(Collectors.toList());
        FizzBuzzProcessor processor = new FizzBuzzProcessor(new Stage2Strategy());
        Results results = processor.process(ret);

        Iterator<Result> iter = results.iterator();
        Result result = iter.next();
        assertEquals(FizzResult.class, result.getClass());
        result = iter.next();
        assertEquals(FizzResult.class, result.getClass());
        result = iter.next();
        assertEquals(BuzzResult.class, result.getClass());
        result = iter.next();
        assertEquals(NumResult.class, result.getClass());
        result = iter.next();
        assertEquals(FizzResult.class, result.getClass());
        result = iter.next();
        assertEquals(NumResult.class, result.getClass());
        result = iter.next();
        assertEquals(NumResult.class, result.getClass());
        result = iter.next();
        assertEquals(FizzBuzzResult.class, result.getClass());
        result = iter.next();
        assertEquals(FizzResult.class, result.getClass());

    }

}