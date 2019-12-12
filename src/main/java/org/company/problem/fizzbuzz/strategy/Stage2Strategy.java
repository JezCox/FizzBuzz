package org.company.problem.fizzbuzz.strategy;

public class Stage2Strategy extends Strategy
{
    // behavior is additive - hence use as a Composite
    private Stage1Strategy stage1Strategy = new Stage1Strategy();


    @Override
    public boolean isFizz(int num) {
        boolean isFizz = stage1Strategy.isFizz(num);
        if (isFizz)
            return isFizz;

        isFizz = containsWithin(num, FIZZ_NUMBER);
        return isFizz;
    }

    @Override
    public boolean isBuzz(int num) {
        boolean isBuzz = stage1Strategy.isBuzz(num);
        if (isBuzz)
            return isBuzz;

        isBuzz = containsWithin(num, BUZZ_NUMBER);
        return isBuzz;
    }

    @Override
    public boolean isFizzBuzz(int num) {
        return isFizz(num) && isBuzz(num);
    }

    private static boolean containsWithin(int num, int testFor) {
        String strNum = String.valueOf(num);
        String strTestFor = String.valueOf(testFor);
        return strNum.contains(strTestFor);

    }
}
