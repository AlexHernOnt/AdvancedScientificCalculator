package org.example.Calculation;

public class AdvancedCalculator extends Calculator {

    public double performOperationPow() {
        return Math.pow(n1, n2);
    }

    public double performOperationRoot() {
        return Math.pow(n1, 1.0 / n2);
    }

    // Trigonometry

    public double performOperationSin() {
        return Math.sin(Math.toRadians(n1));
    }

    public double performOperationCos() {
        return Math.cos(Math.toRadians(n1));
    }

    public double performOperationTan() {
        return Math.tan(Math.toRadians(n1));
    }

    public double performOperationCot() {
        return 1.0 / Math.tan(Math.toRadians(n1));
    }



    @Override
    public double performOperation() {
        return 0;
    }
}
