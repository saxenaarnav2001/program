package Paper;

import java.util.Scanner;

public class Palindrome2 {
    public boolean isPalindrome(int x) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (x < 0){
            return false;
        }

        String a = Integer.toString(x);
        String b = "";

        for(int i = a.length() - 1 ; i >= 0 ; i--){
            b += a.charAt(i);
        }
        for(int j = 0 ; j == a.length() ; j++){
            if(a.charAt(j) != b.charAt(j)){
                return false;
            }

        }
        return true;
    }
}


