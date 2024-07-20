package Paper;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word to check: ");
        String a = in.next().trim();
        String c = "";

        for (int i = a.length() - 1 ; i >=0; i--){
            c += a.charAt(i);
        } for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c.charAt(i)){
                System.out.println("This is a palindrome number");
            }
            else{
                System.out.println("It is not a palindrome");
            }

        }
        }

    }



