package com.example.calculator;

import java.util.Scanner;

public class UnitConversion {
    // Simple constant rate. Update manually or later fetch live rates (advanced).
    private static double USD_TO_INR = 83.0;

    public static double celsiusToFahrenheit(double c) { return (c * 9.0 / 5.0) + 32.0; }
    public static double fahrenheitToCelsius(double f) { return (f - 32.0) * 5.0 / 9.0; }

    public static double metersToKilometers(double m) { return m / 1000.0; }
    public static double kilometersToMeters(double km) { return km * 1000.0; }

    public static double inchesToCentimeters(double in) { return in * 2.54; }
    public static double centimetersToInches(double cm) { return cm / 2.54; }

    public static double usdToInr(double usd) { return usd * USD_TO_INR; }
    public static double inrToUsd(double inr) { return inr / USD_TO_INR; }

    public static void setUsdToInrRate(double rate) { USD_TO_INR = rate; }

    public static void menu(Scanner sc) {
        while (true) {
            System.out.println("\n-- Unit Conversion Menu --");
            System.out.println("1. Celsius -> Fahrenheit");
            System.out.println("2. Fahrenheit -> Celsius");
            System.out.println("3. Meters -> Kilometers");
            System.out.println("4. Kilometers -> Meters");
            System.out.println("5. Inches -> Centimeters");
            System.out.println("6. Centimeters -> Inches");
            System.out.println("7. USD -> INR");
            System.out.println("8. INR -> USD");
            System.out.println("9. Update USD->INR rate");
            System.out.println("10. Back to Main Menu");
            int choice = InputHelper.readInt(sc, "Choose: ");
            if (choice == 10) return;

            switch (choice) {
                case 1 -> {
                    double c = InputHelper.readDouble(sc, "Enter Celsius: ");
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
                }
                case 2 -> {
                    double f = InputHelper.readDouble(sc, "Enter Fahrenheit: ");
                    System.out.println("Celsius: " + fahrenheitToCelsius(f));
                }
                case 3 -> {
                    double m = InputHelper.readDouble(sc, "Enter meters: ");
                    System.out.println("Kilometers: " + metersToKilometers(m));
                }
                case 4 -> {
                    double km = InputHelper.readDouble(sc, "Enter kilometers: ");
                    System.out.println("Meters: " + kilometersToMeters(km));
                }
                case 5 -> {
                    double in = InputHelper.readDouble(sc, "Enter inches: ");
                    System.out.println("Centimeters: " + inchesToCentimeters(in));
                }
                case 6 -> {
                    double cm = InputHelper.readDouble(sc, "Enter centimeters: ");
                    System.out.println("Inches: " + centimetersToInches(cm));
                }
                case 7 -> {
                    double usd = InputHelper.readDouble(sc, "Enter USD: ");
                    System.out.println("INR: " + usdToInr(usd));
                }
                case 8 -> {
                    double inr = InputHelper.readDouble(sc, "Enter INR: ");
                    System.out.println("USD: " + inrToUsd(inr));
                }
                case 9 -> {
                    double rate = InputHelper.readDouble(sc, "Enter new USD->INR rate: ");
                    setUsdToInrRate(rate);
                    System.out.println("Rate updated. New USD->INR = " + USD_TO_INR);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
