package com.example.calculator;

import java.util.Scanner;

public class Arithmetic {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        return a / b;
    }
    public static double modulo(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot modulo by zero!");
        return a % b;
    }

    public static void menu(Scanner sc) {
        while (true) {
            System.out.println("\n-- Arithmetic Menu --");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");
            System.out.println("6. Back to Main Menu");
            int choice = InputHelper.readInt(sc, "Choose: ");
            if (choice == 6) return;

            double a = InputHelper.readDouble(sc, "Enter first number: ");
            double b = InputHelper.readDouble(sc, "Enter second number: ");

            try {
                double result = switch (choice) {
                    case 1 -> add(a, b);
                    case 2 -> subtract(a, b);
                    case 3 -> multiply(a, b);
                    case 4 -> divide(a, b);
                    case 5 -> modulo(a, b);
                    default -> {
                        System.out.println("Invalid choice");
                        yield Double.NaN;
                    }
                };
                if (!Double.isNaN(result)) System.out.println("Result: " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}