package Paper;

import java.util.Scanner;

import static java.util.Collections.swap;

public class SwapFunction {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Type A: ");
        int a = in.nextInt();
        System.out.print("Type B: ");
        int b = in.nextInt();
        swap(a, b);
    }

    private static void swap(int a, int b) {
        int temp = a + b;
        a = temp - a;
        b = temp - b;

        System.out.println("after swapping A is = " + a +" and B is = " + b);
        return;
    }

}
