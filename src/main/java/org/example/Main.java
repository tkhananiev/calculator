package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int choice;

        do {
            System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}