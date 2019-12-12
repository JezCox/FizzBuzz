package org.company.problem.fizzbuzz.setup;

import org.company.problem.fizzbuzz.output.SysOutStream;
import org.company.problem.fizzbuzz.strategy.Stage1Strategy;
import org.company.problem.fizzbuzz.strategy.Stage2Strategy;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetupTest {

    @Test
    public void testgetStage1SysOutSetup() {
        Setup setup = Setup.getStage1SysOutSetup();
        assertEquals(Stage1Strategy.class, setup.getStrategy().getClass());
        assertEquals(SysOutStream.class, setup.getOutStream().getClass());
    }

    @Test
    public void testgetStage2SysOutSetup() {
        Setup setup = Setup.getStage2SysOutSetup();
        assertEquals(Stage2Strategy.class, setup.getStrategy().getClass());
        assertEquals(SysOutStream.class, setup.getOutStream().getClass());
    }

    @Test
    public void testPreferredSetup() {
        Setup setup = Setup.getPreferredSetup();
        assertEquals(Stage1Strategy.class, setup.getStrategy().getClass());
        assertEquals(SysOutStream.class, setup.getOutStream().getClass());
    }

}