package org.example.Calculation;

public class AdvancedCalculator extends Calculator {

    public double performOperationPow() {
        return Math.pow(n1, n2);
    }

    public double performOperationRoot() {
        return Math.pow(n1, 1.0 / n2);
    }

    @Override
    public double performOperation() {
        return 0;
    }
}
