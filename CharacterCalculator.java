package Paper;

import java.util.Scanner;

public class CharacterCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();

        System.out.print("Enter the digit to find: ");
        int y = in.nextInt();

        int count = count(x, y);
        System.out.println("Number of " + y + "s: " + count);
    }

    private static int count(int x, int y) {
        int count = 0;
        while (x > 0) {
            int rem = x % 10;
            System.out.println(rem);
            if (rem == y) {
                count++;
            }
            x = x / 10;
        }
        return count;
    }
}
