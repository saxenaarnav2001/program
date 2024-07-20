package Paper;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = in.next().trim();
        String c = "";

        for (int i = a.length() - 1 ; i >=0; i--){
            c += a.charAt(i);
        }
        System.out.println(a.length());
        System.out.println("reverse of the string " + a + " will be: " + c);
    }
}
