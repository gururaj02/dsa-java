package com.guru.javaConcepts.enumsExample.enumCalcAbstractMethods;

public class EnumCalculatorExample {
    public static void main(String[] args) {
        long num1 = 40;
        long num2 = 20;

        long addition = Calculator.ADD.operation(num1, num2);
        System.out.println("Addition: " + addition);

        long subtraction = Calculator.SUBTRACT.operation(num1, num2);
        System.out.println("Subtraction: " + subtraction);

        long multiplication = Calculator.MULTIPLY.operation(num1, num2);
        System.out.println("Multiplication: " + multiplication);

        long division = Calculator.DIVIDE.operation(num1, num2);
        System.out.println("Division: " + division);
    }
}
