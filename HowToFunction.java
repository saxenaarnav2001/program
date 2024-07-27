package Paper;

import java.util.Scanner;

public class HowToFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = in.next();
        String x = greeting(name);
        System.out.println(x);
    }

    static String greeting(String name){
        return "Hello" + name;
    }
}
