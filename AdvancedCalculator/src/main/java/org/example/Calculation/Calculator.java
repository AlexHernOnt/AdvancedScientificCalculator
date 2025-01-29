package org.example.Calculation;

import org.example.customExceptions.ExceptionListNotFit;

import java.util.List;

public abstract class Calculator {

    double n1;
    double n2;


    protected Calculator() {
        n1 = 0;
        n2 = 0;
    }

    protected Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    protected Calculator(List<Double> numbers) {
        if (numbers != null && numbers.size() >= 2) {
            this.n1 = numbers.get(0);
            this.n2 = numbers.get(1);
        } else {
            throw new ExceptionListNotFit();
        }
    }


    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public abstract double performOperation();
}
