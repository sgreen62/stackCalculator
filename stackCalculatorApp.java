package stackcalculator;

import java.util.Scanner;

public class StackCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackCalculator calc = new StackCalculator();

        calc.displayWelcomeMessage();
        calc.displayCommands();

        boolean running = true;
        while (running) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ");

            switch (parts[0].toLowerCase()) {
                case "push":
                    if (parts.length == 2) {
                        try {
                            double value = Double.parseDouble(parts[1]);
                            calc.push(value);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number.");
                        }
                    } else {
                        System.out.println("Usage: push n");
                    }
                    break;

                case "add":
                    calc.add();
                    break;

                case "sub":
                    calc.sub();
                    break;

                case "mult":
                    calc.mult();
                    break;

                case "div":
                    calc.div();
                    break;

                case "list":
                    calc.listStack();
                    break;

                case "clear":
                    calc.clearStack();
                    break;

                case "quit":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }
}
