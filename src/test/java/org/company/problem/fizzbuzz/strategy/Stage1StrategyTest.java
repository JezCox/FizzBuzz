package org.company.problem.fizzbuzz.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Stage1StrategyTest {

    private Strategy strategy;

    @Before
    public void setUp() throws Exception {
        strategy = new Stage1Strategy();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsFizz() {
        assertTrue(strategy.isFizz(3));
        assertTrue(strategy.isFizz(9));
        assertFalse(strategy.isFizz(2));
        assertTrue(strategy.isFizz(15));
        assertFalse(strategy.isFizz(23));
    }

    @Test
    public void testIsBuzz() {
        assertTrue(strategy.isBuzz(5));
        assertFalse(strategy.isBuzz(9));
        assertFalse(strategy.isBuzz(2));
        assertTrue(strategy.isBuzz(15));
        assertTrue(strategy.isBuzz(25));
    }

    @Test
    public void testIsFizzBuzz() {
        assertFalse(strategy.isFizzBuzz(5));
        assertFalse(strategy.isFizzBuzz(9));
        assertFalse(strategy.isFizzBuzz(2));
        assertTrue(strategy.isFizzBuzz(15));
        assertFalse(strategy.isFizzBuzz(25));
        assertFalse(strategy.isFizzBuzz(27));
    }
}