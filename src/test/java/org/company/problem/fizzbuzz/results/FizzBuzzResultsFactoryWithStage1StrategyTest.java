package org.company.problem.fizzbuzz.results;

import org.company.problem.fizzbuzz.factories.IntProcessingFactory;
import org.company.problem.fizzbuzz.strategy.Stage1Strategy;
import org.company.problem.fizzbuzz.strategy.Strategy;

import static org.junit.Assert.*;

public class FizzBuzzResultsFactoryWithStage1StrategyTest {

    private Strategy strategy;
    private IntProcessingFactory factory;

    @org.junit.Before
    public void setUp() throws Exception {
        strategy = new Stage1Strategy();
        factory = IntProcessingFactory.getFizzBuzzResultsFactory(strategy);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testConvertForFizz() {
        Result res = factory.convert(1);
        assertNotEquals(res.getClass(), FizzResult.class);

        res = factory.convert(3);
        assertEquals(res.getClass(), FizzResult.class);

        res = factory.convert(5);
        assertNotEquals(res.getClass(), FizzResult.class);

        res = factory.convert(9);
        assertEquals(res.getClass(), FizzResult.class);

        res = factory.convert(15);
        assertNotEquals(res.getClass(), FizzResult.class);

        res = factory.convert(23);
        assertNotEquals(res.getClass(), FizzResult.class);

        res = factory.convert(43);
        assertNotEquals(res.getClass(), FizzResult.class);
    }

    @org.junit.Test
    public void testConvertForBuzz() {
        Result res = factory.convert(1);
        assertNotEquals(res.getClass(), BuzzResult.class);

        res = factory.convert(3);
        assertNotEquals(res.getClass(), BuzzResult.class);

        res = factory.convert(5);
        assertEquals(res.getClass(), BuzzResult.class);

        res = factory.convert(9);
        assertNotEquals(res.getClass(), BuzzResult.class);

        res = factory.convert(15);
        assertNotEquals(res.getClass(), BuzzResult.class);

        res = factory.convert(25);
        assertEquals(res.getClass(), BuzzResult.class);
    }

    @org.junit.Test
    public void testConvertForFizzBuzz() {
        Result res = factory.convert(1);
        assertNotEquals(res.getClass(), FizzBuzzResult.class);

        res = factory.convert(3);
        assertNotEquals(res.getClass(), FizzBuzzResult.class);

        res = factory.convert(5);
        assertNotEquals(res.getClass(), FizzBuzzResult.class);

        res = factory.convert(9);
        assertNotEquals(res.getClass(), FizzBuzzResult.class);

        res = factory.convert(15);
        assertEquals(res.getClass(), FizzBuzzResult.class);

        res = factory.convert(25);
        assertNotEquals(res.getClass(), FizzBuzzResult.class);
    }

    @org.junit.Test
    public void testConvertForNum() {
        Result res = factory.convert(1);
        assertEquals(res.getClass(), NumResult.class);

        res = factory.convert(2);
        assertEquals(res.getClass(), NumResult.class);

        res = factory.convert(19);
        assertEquals(res.getClass(), NumResult.class);

        res = factory.convert(3);
        assertNotEquals(res.getClass(), NumResult.class);

        res = factory.convert(5);
        assertNotEquals(res.getClass(), NumResult.class);

        res = factory.convert(9);
        assertNotEquals(res.getClass(), NumResult.class);

        res = factory.convert(15);
        assertNotEquals(res.getClass(), NumResult.class);

        res = factory.convert(25);
        assertNotEquals(res.getClass(), NumResult.class);
    }

}