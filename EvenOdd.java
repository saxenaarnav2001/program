package Paper;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(in.nextLine());
        if (num%2 == 0){
            System.out.println(num + " is Even");
        }
        else {
            System.out.println(num + " is Odd");
        }
        }
    }

