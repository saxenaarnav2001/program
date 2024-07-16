package Paper;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = in.next();
        System.out.println("Hello there, " + a + "!");
    }
}
