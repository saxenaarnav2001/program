package Paper;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number to compare: ");
        int x = Integer.parseInt(a.nextLine());
        Scanner b = new Scanner(System.in);
        System.out.print("Enter another number to compare: ");
        int y = Integer.parseInt(b.nextLine());

        if (y > x){
            System.out.println(y +" is greater than " + x + ".");
        }
        else if (x > y){
            System.out.println(x +" is greater than " + y + ".");
        }
        else {
            System.out.println("Both are equal.");
        }
    }
}
