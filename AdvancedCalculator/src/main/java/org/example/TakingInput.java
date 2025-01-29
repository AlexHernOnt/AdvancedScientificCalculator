package org.example;

import org.example.Calculation.CalPowerOf;

import java.util.Scanner;

public class TakingInput {
    Scanner sc = new Scanner(System.in);
    String input;
    double dInput;

    TakingInput() {
        beganApplication();
    }

    public void cleanScreen() {
        int i = 0;
        while (i++ < 25)
            System.out.println();
    }

    /*
    ** Intro
    */

    public void beganApplication() {
        cleanScreen();
        System.out.println("Welcome to the Calculator!");

        do {
            System.out.println("Please select your desired operation \n1: - Power of.\n2: - Square root");

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
        CalPowerOf calPowerOf = new CalPowerOf();
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

        calPowerOf.setN1(dInput);
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
        calPowerOf.setN2(dInput);
        double result = calPowerOf.performOperation();

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
        CalPowerOf calPowerOf = new CalPowerOf();
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

        calPowerOf.setN1(dInput);
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
        calPowerOf.setN2(dInput);
        double result = calPowerOf.performOperation();

        System.out.print("This is the result: " + result + "\n1: - ok\n");

        while (!exit) {
            input = sc.nextLine();
            exit = true;
        }
    }
}


