import java.util.*;
import java.util.Scanner;

 public class Task130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Choose what operator: ");
            System.out.println("'+' '-' '*' '/'");
            String operator = scanner.next();

            int add = a + b;
            int subtract = a - b;
            int multiply = a * b;
            int divide = a / b; 

            if (operator.equals("+")) {
                System.out.println("Result: "+add);
            } else if (operator.equals("*")) {
                System.out.println("Result: "+multiply);
            } else if (operator.equals("-")) {
                System.out.println("Result: "+subtract);
            } else if (operator.equals("/")) {
                System.out.println("Result: "+divide);
            } else {
                System.out.println("Error: invalid operator.");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("InputMismatchException: entered a non-integer value.");
        } finally {
            scanner.close();
        }
    }
}
