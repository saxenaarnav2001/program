package Paper;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 0 for Celsius to Fahrenheit, 1 for Fahrenheit to Celsius: ");
        int num1 = Integer.parseInt(in.nextLine());
        Scanner in1 = new Scanner(System.in);
        if (num1 == 0){
            System.out.print("please write the temperature in Celsius: ");
        float tempC = in1.nextFloat();
        float tempF = (tempC* 9/5 ) + 32;
            System.out.println(tempF);
        }
        else{
            System.out.print("please write the temperature in Fahrenheit: ");
            float tempF = in1.nextFloat();
            float tempC = (tempF -32 ) * 5/9;
            System.out.println(tempC);
        }
    }
}