package Paper;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {

        Scanner Rs = new Scanner(System.in);
        System.out.print("Enter the amount you want to convert into Dollars in Rupees: ");
        int x = Integer.parseInt(Rs.nextLine());
        float z = (float)(x/83.52);
        System.out.println("The value in dollars is: $" + z);
    }
}

