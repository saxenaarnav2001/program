package Paper;

import java.util.Scanner;

import static java.lang.Integer.reverse;


public class PrintReverse2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number to reverse: ");
        int x = in.nextInt();
        int reverse =  reverse(x);
        System.out.println("the reverse of " + x + " is " + reverse);
    }
    private static int reverse(int x){
        int reverse = 0;
        while(x > 0){
            int rem = x % 10;
            reverse = reverse * 10;
            reverse = reverse + rem;
            x = x / 10;
        }
        return reverse;
    }
}
