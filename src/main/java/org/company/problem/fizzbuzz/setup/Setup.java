package org.company.problem.fizzbuzz.setup;

import org.company.problem.fizzbuzz.output.OutStream;
import org.company.problem.fizzbuzz.output.SysOutStream;
import org.company.problem.fizzbuzz.strategy.Stage1Strategy;
import org.company.problem.fizzbuzz.strategy.Stage2Strategy;
import org.company.problem.fizzbuzz.strategy.Strategy;

// Implemented as Singleton so accessible generally and configurable at top level e.g. perhaps via DI
// no requirement to be thread safe in this instance
// This holds no state so there is no need to worry about multiple calls on the static getxxx()s
public class Setup {

    private static Setup instance = null;

    private Strategy strategy;
    private OutStream outStream;

    private Setup(Strategy strategy, OutStream outStream) {
        this.strategy = strategy;
        this.outStream = outStream;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public OutStream getOutStream() {
        return outStream;
    }


    public static Setup getStage1SysOutSetup() {
        instance = new Setup(new Stage1Strategy(), new SysOutStream());
        return instance;
    }

    public static Setup getStage2SysOutSetup() {
        instance = new Setup(new Stage2Strategy(), new SysOutStream());
        return instance;
    }

    // for now - until Stage 2 requirements wanted
    public static Setup getPreferredSetup() {
        return getStage1SysOutSetup();
    }

}
