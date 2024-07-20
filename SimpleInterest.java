package Paper;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle amount: ");
        int p = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the time in years: ");
        int t = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the rate of interest: ");
        int r = in2.nextInt();
        int a = p * (1 + r * t);
        System.out.println("Total accrued amount will be: " + a);
    }
}
