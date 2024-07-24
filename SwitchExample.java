package Paper;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks for English: ");
        int x = in.nextInt();
        System.out.print("Enter your marks for Hindi: ");
        int y = in.nextInt();
        System.out.print("Enter your marks for Maths: ");
        int z = in.nextInt();
        System.out.print("Enter your marks for Science: ");
        int c = in.nextInt();
        System.out.print("Enter your marks for Social Science: ");
        int v = in.nextInt();
        int a = (x + y + z + c+ v) / 5;
        String grade = "";
        if (a>95){
            grade = "one";
        }
        else if (a>90){
            grade = "two";
        }
        else if (a>80){
            grade = "three";
        }
        else if (a>70){
            grade = "four";
        }
        else if (a>60){
            grade = "five";
        }
        else if (a>50){
            grade = "six";
        }
        else if (a>40){
            grade = "seven";
        }
        else{
            System.out.println("F");
        }
        cgpa(grade);
    }

    private static void cgpa(String grade){
        switch (grade){
            case "one":
                System.out.println("you scored A+");
                break;
            case "two":
                System.out.println("you scored A");
                break;
            case "three":
                System.out.println("you scored B");
                break;
            case "four":
                System.out.println("you scored C");
                break;
            case "five":
                System.out.println("you scored D");
                break;
            case "six":
                System.out.println("you scored E");
                break;
            case "seven":
                System.out.println("failed");
                break;
            default:
                System.out.println("type a correct value");
        }
    }

}
