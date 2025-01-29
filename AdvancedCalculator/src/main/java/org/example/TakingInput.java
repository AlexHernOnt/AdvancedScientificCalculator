package org.example;

import org.example.Calculation.AdvancedCalculator;

import java.util.Scanner;

public class TakingInput {
    Scanner sc = new Scanner(System.in);
    String input;
    double dInput;

    AdvancedCalculator advancedCalculator = new AdvancedCalculator();

    TakingInput() {
        beganApplication();
    }

    public void cleanScreen() {
        int i = 0;
        while (i++ < 25) System.out.println();
    }

    /*
     ** Intro
     */

    public void beganApplication() {
        cleanScreen();
        System.out.println("Welcome to the Calculator!");

        do {
            System.out.println("Please select your desired operation \n1: - Power of.\n2: - Square of.\n3: - Trigonometry.");

            input = sc.nextLine().toLowerCase();
            System.out.println(input);

            switch (input) {
                case "1": {
                    inputPowerOf();
                    sc.nextLine();
                    cleanScreen();
                    break;
                }
                case "2": {
                    inputSquareRoot();
                    sc.nextLine();
                    cleanScreen();
                    break;
                }
                case "3": {
                    inputTrigonometry();
                    sc.nextLine();
                    cleanScreen();
                    break;
                }
                case "exit":
                    break;
                default:
                    cleanScreen();
                    System.out.println("Wrong input");
            }
        } while (!input.equals("exit"));
    }

    /*
     ** Power Of
     */

    public void inputPowerOf() {
        boolean exit = false;

        cleanScreen();
        System.out.println("Please input your base number:");

        while (!exit) {
            try {
                dInput = sc.nextDouble();
                exit = true;
            } catch (Exception e) {
                cleanScreen();
                System.out.println("Please, input a valid base number:");
                sc.nextLine();
            }
        }

        advancedCalculator.setN1(dInput);
        exit = false;
        System.out.println("Please input your exponent number:");
        while (!exit) {
            try {
                dInput = sc.nextDouble();
                exit = true;
            } catch (Exception e) {
                cleanScreen();
                System.out.println("Please, input a valid exponent number:");
                sc.nextLine();
            }
        }

        exit = false;
        cleanScreen();
        advancedCalculator.setN2(dInput);
        double result = advancedCalculator.performOperationPow();

        System.out.print("This is the result: " + result + "\n1: - ok\n");

        while (!exit) {
            input = sc.nextLine();
            exit = true;
        }
    }

    /*
     ** Sq root
     */

    public void inputSquareRoot() {
        boolean exit = false;

        cleanScreen();
        System.out.println("Please input your radical number: (index) √ (radical)");

        while (!exit) {
            try {
                dInput = sc.nextDouble();
                exit = true;
            } catch (Exception e) {
                cleanScreen();
                System.out.println("Please, input a valid base number:");
                sc.nextLine();
            }
        }

        advancedCalculator.setN1(dInput);
        exit = false;
        System.out.println("Please input your index number:");
        while (!exit) {
            try {
                dInput = sc.nextDouble();
                exit = true;
            } catch (Exception e) {
                cleanScreen();
                System.out.println("Please, input a valid exponent number:");
                sc.nextLine();
            }
        }

        exit = false;
        cleanScreen();
        advancedCalculator.setN2(dInput);
        double result = advancedCalculator.performOperationRoot();

        try {
            if (Double.isNaN(result)) {
                throw new ArithmeticException("Error: the operation resulted in Nan: not a number" + "\n1: - ok\n");
            }
            System.out.print("This is the result: " + result + "\n1: - ok\n");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        while (!exit) {
            input = sc.nextLine();
            exit = true;
        }
    }

    /*
     ** Trigonometry
     */

    public void inputTrigonometry() {
        boolean exit = false;
        cleanScreen();
        String trigo;

        System.out.println("Please select your desired trigonometry operation \n1: - Sine.\n2: - Cosine.\n3: - Tangent.\n3: - Cotangent.");

        input = sc.nextLine().toLowerCase();
        System.out.println(input);

        switch (input) {
            case "1": {
                trigo = "Sine";
                break;
            }
            case "2": {
                trigo = "Cosine";
                break;
            }
            case "3": {
                trigo = "Tangent";
                break;
            }
            case "4": {
                trigo = "Cotangent";
                break;
            }
            default:
                return;
        }


        System.out.println("Please input your number:");
        while (!exit) {
            try {
                dInput = sc.nextDouble();
                exit = true;
            } catch (Exception e) {
                cleanScreen();
                System.out.println("Please, input a valid number:");
                sc.nextLine();
            }
        }
        exit = false;
        cleanScreen();
        advancedCalculator.setN1(dInput);
        double result = 0;

        try {
            switch (trigo) {
                case "Sine":
                    result = advancedCalculator.performOperationSin();
                    break;
                case "Cosine":
                    result = advancedCalculator.performOperationCos();
                    break;
                case "Tangent":
                    result = advancedCalculator.performOperationTan();
                    break;
                case "Cotangent":
                    result = advancedCalculator.performOperationCot();
                    break;
            }
            System.out.print("This is the result: " + result + "\n1: - ok\n");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        }
        input = sc.nextLine();
    }
}
