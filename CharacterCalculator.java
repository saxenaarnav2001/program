package Paper;

import java.util.Scanner;
// a program to find number of iterations of a single digit in a given number
@SuppressWarnings("ALL")
public class CharacterCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();

        System.out.print("Enter the digit to find: ");
        int y = in.nextInt();
        int z = 10 - y;

        int count = count(x, y, z);
        System.out.println("Number of digit: " + count);
    }

    private static int count(int x, int y, int z) {
        int count = 0;
        while (x > 0){
            int rem = x % 10;
            if(rem == z){
                count++;
                System.out.println(count);
            }
            x = x / 10;
    }


        return count;

}
}
