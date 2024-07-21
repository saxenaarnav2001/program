package Paper;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of fibonacci you want to see: ");
        int x = Integer.parseInt(in.nextLine());
        int a = 0;
        int b = 1;
        int c = 2;
        while (c <= x){
            int temp = b;
             b = a + b;
             a = temp;
             c++;
        }
        System.out.println(b);
    }
}
