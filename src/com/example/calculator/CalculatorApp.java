package com.example.calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Enhanced Console Calculator");
            while (true) {
                System.out.println("\n==== Main Menu ====");
                System.out.println("1. Arithmetic Operations");
                System.out.println("2. Scientific Functions");
                System.out.println("3. Unit Conversion");
                System.out.println("4. Exit");
                int choice = InputHelper.readInt(sc, "Enter choice: ");
                switch (choice) {
                    case 1 -> Arithmetic.menu(sc);
                    case 2 -> Scientific.menu(sc);
                    case 3 -> UnitConversion.menu(sc);
                    case 4 -> {
                        System.out.println("Exiting. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
