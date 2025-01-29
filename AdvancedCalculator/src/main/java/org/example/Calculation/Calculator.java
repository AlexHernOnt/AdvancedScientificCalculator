package org.example.Calculation;
import java.util.Scanner;

public abstract class Calculator {

    double n1;
    double n2;


    protected Calculator(){
        n1 = 0;
        n2 = 0;
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
