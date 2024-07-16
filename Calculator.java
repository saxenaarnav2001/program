package Paper;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = Integer.parseInt(a.nextLine());
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int y = Integer.parseInt(b.nextLine());
        Scanner in = new Scanner(System.in);
        System.out.print("Type 1 to add, 2 to subtract, 3 to Multiply, 4 to Divide: ");
        int num1 = Integer.parseInt(in.nextLine());
        Scanner in1 = new Scanner(System.in);
        if (num1 == 1){
            float Add = x + y;
            System.out.println(Add);
        }
        else if (num1 == 2){
            float Sub = x - y;
            System.out.println(Sub);
        }
        else if (num1 == 3){
            float Multiply = x * y;
            System.out.println(Multiply);
        }
        else if (num1 == 4){
            float Divide = x / y;
            System.out.println(Divide);
        }
        }

    }
