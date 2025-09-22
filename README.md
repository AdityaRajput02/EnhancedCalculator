Enhanced Console-Based Calculator
📖 Overview
This is an Enhanced Console Calculator built in Java 17, providing users with a wide range of operations via a command-line interface.
It supports Basic Arithmetic, Scientific Functions, and Unit Conversions, with safe input handling and error management.

✨ Features
Basic Arithmetic
Addition, Subtraction, Multiplication, Division, Modulo (with error handling for division by zero)
Scientific Functions
Square Root, Power, Trigonometric Functions (in degrees), Logarithms, Factorial
Unit Conversions
Temperature (Celsius ↔ Fahrenheit)
Length (Meters ↔ Kilometers, Inches ↔ Centimeters)
Currency (USD ↔ INR, with adjustable rate)
📂 Project Structure
EnhancedCalculator/ ├── src/ │ └── com/ │ └── example/ │ └── calculator/ │ ├── InputHelper.java # Utility for safe user input │ ├── Arithmetic.java # Basic arithmetic operations │ ├── Scientific.java # Scientific functions │ ├── UnitConversion.java # Unit conversions (temperature, length, currency) │ └── CalculatorApp.java # Main application (entry point) ├── README.md # Project documentation

⚙️ Installation Instructions
Prerequisites
Java SE 17 installed
Eclipse IDE (or any Java IDE)
Option 1: Run in Eclipse
Open Eclipse.
Go to File → New → Java Project → Name it EnhancedCalculator.
Ensure JRE is set to JavaSE-17.
Create package com.example.calculator.
Add the provided .java files (InputHelper, Arithmetic, Scientific, UnitConversion, CalculatorApp).
Right-click CalculatorApp.java → Run As → Java Application.
Option 2: Run from Command Line
Navigate to the project folder:
`bash cd EnhancedCalculator/src Compile all files:
javac com/example/calculator/*.java

Run the main program:

java com.example.calculator.CalculatorApp💻 Example Usage Main Menu ==== Main Menu ====

Arithmetic Operations
Scientific Functions
Unit Conversion
Exit
Arithmetic Example -- Arithmetic Menu --

Add
Subtract
Multiply
Divide
Modulo
Back to Main Menu
Choose: 1 Enter first number: 10 Enter second number: 5 Result: 15.0

Scientific Example -- Scientific Menu --

Square root
Power (a^b)
Sine (degrees) ...
Choose: 8 Enter non-negative integer: 5 Result: 120

Unit Conversion Example -- Unit Conversion Menu --

Celsius -> Fahrenheit
Fahrenheit -> Celsius ...
Choose: 7 Enter USD: 10 INR: 830.0

## Author
Aditya Rajput 
Email: [ar8871882712@gmail.com](mailto:ar8871882712@gmail.com)  
GitHub: [https://github.com/AdityaRajput02](https://github.com/AdityaRajput02)
