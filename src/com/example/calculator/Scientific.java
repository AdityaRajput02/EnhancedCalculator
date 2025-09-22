package com.example.calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class Scientific {

    public static double sqrt(double x) {
        if (x < 0) throw new IllegalArgumentException("Cannot take square root of negative number.");
        return Math.sqrt(x);
    }

    public static double pow(double a, double b) { return Math.pow(a, b); }

    // Trig helpers that accept degrees (user-friendly)
    public static double sinDeg(double deg) { return Math.sin(Math.toRadians(deg)); }
    public static double cosDeg(double deg) { return Math.cos(Math.toRadians(deg)); }
    public static double tanDeg(double deg) { return Math.tan(Math.toRadians(deg)); }

    public static double ln(double x) {
        if (x <= 0) throw new IllegalArgumentException("Natural log undefined for values <= 0.");
        return Math.log(x);
    }

    public static double log10(double x) {
        if (x <= 0) throw new IllegalArgumentException("Log base 10 undefined for values <= 0.");
        return Math.log10(x);
    }

    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial undefined for negative integers.");
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) res = res.multiply(BigInteger.valueOf(i));
        return res;
    }

    public static void menu(Scanner sc) {
        while (true) {
            System.out.println("\n-- Scientific Menu --");
            System.out.println("1. Square root");
            System.out.println("2. Power (a^b)");
            System.out.println("3. Sine (degrees)");
            System.out.println("4. Cosine (degrees)");
            System.out.println("5. Tangent (degrees)");
            System.out.println("6. Natural log (ln)");
            System.out.println("7. Log base 10");
            System.out.println("8. Factorial (integer)");
            System.out.println("9. Back to Main Menu");
            int choice = InputHelper.readInt(sc, "Choose: ");
            if (choice == 9) return;

            try {
                switch (choice) {
                    case 1 -> {
                        double x = InputHelper.readDouble(sc, "Enter number: ");
                        System.out.println("Result: " + sqrt(x));
                    }
                    case 2 -> {
                        double a = InputHelper.readDouble(sc, "Enter base: ");
                        double b = InputHelper.readDouble(sc, "Enter exponent: ");
                        System.out.println("Result: " + pow(a, b));
                    }
                    case 3 -> {
                        double deg = InputHelper.readDouble(sc, "Enter degrees: ");
                        System.out.println("Result: " + sinDeg(deg));
                    }
                    case 4 -> {
                        double deg = InputHelper.readDouble(sc, "Enter degrees: ");
                        System.out.println("Result: " + cosDeg(deg));
                    }
                    case 5 -> {
                        double deg = InputHelper.readDouble(sc, "Enter degrees: ");
                        System.out.println("Result: " + tanDeg(deg));
                    }
                    case 6 -> {
                        double x = InputHelper.readDouble(sc, "Enter number: ");
                        System.out.println("Result: " + ln(x));
                    }
                    case 7 -> {
                        double x = InputHelper.readDouble(sc, "Enter number: ");
                        System.out.println("Result: " + log10(x));
                    }
                    case 8 -> {
                        int n = InputHelper.readInt(sc, "Enter non-negative integer: ");
                        System.out.println("Result: " + factorial(n));
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
