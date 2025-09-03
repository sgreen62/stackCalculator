package stackcalculator;

import java.util.Stack;

public class StackCalculator {
    private Stack<Double> calculator;

    public StackCalculator() {
        calculator = new Stack<>();
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Stack Calculator!");
    }

    public void displayCommands() {
        System.out.println("Commands:");
        System.out.println("push n   -> add number n to the stack");
        System.out.println("add      -> pop two numbers, add them");
        System.out.println("sub      -> pop two numbers, subtract second from first");
        System.out.println("mult     -> pop two numbers, multiply them");
        System.out.println("div      -> pop two numbers, divide second by first");
        System.out.println("list     -> show current stack");
        System.out.println("clear    -> empty the stack");
        System.out.println("quit     -> exit program");
    }

    public void push(double value) {
        calculator.push(value);
    }

    public Double pop() {
        if (!calculator.isEmpty()) {
            return calculator.pop();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public void listStack() {
        if (calculator.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack: " + calculator);
        }
    }

    public void clearStack() {
        calculator.clear();
        System.out.println("Stack cleared.");
    }

    public void add() {
        if (calculator.size() >= 2) {
            double a = calculator.pop();
            double b = calculator.pop();
            double result = a + b;
            calculator.push(result);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Need at least two numbers on the stack.");
        }
    }

    public void sub() {
        if (calculator.size() >= 2) {
            double a = calculator.pop();
            double b = calculator.pop();
            double result = b - a;
            calculator.push(result);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Need at least two numbers on the stack.");
        }
    }

    public void mult() {
        if (calculator.size() >= 2) {
            double a = calculator.pop();
            double b = calculator.pop();
            double result = a * b;
            calculator.push(result);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Need at least two numbers on the stack.");
        }
    }

    public void div() {
        if (calculator.size() >= 2) {
            double a = calculator.pop();
            double b = calculator.pop();
            if (a == 0) {
                System.out.println("Cannot divide by zero.");
                calculator.push(b);
                calculator.push(a);
            } else {
                double result = b / a;
                calculator.push(result);
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Need at least two numbers on the stack.");
        }
    }
}
