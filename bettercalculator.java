package Paper;

import java.util.Scanner;

public class bettercalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float x = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter the second number: ");
        float y = Float.parseFloat(scanner.nextLine());

        System.out.print("Type 1 to add, 2 to subtract, 3 to multiply, 4 to divide: ");
        int operation = Integer.parseInt(scanner.nextLine());

        float result;

        switch (operation) {
            case 1:
                result = x + y;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = x - y;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = x * y;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (y != 0) {
                    result = x / y;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose 1, 2, 3, or 4.");
        }
    }
}
