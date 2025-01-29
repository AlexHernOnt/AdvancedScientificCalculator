package org.example.Calculation;

public class CalSqrt extends Calculator{

    @Override
    public double performOperation() {
        return Math.pow(n1, 1.0 / n2);
    }
}
