package Oct.Oct_17102024;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Number = ");
        int a = sc.nextInt();

        //IF condition starts
        if (a <= 59 && a >= 0) {
            System.out.println("Your Grade is F");
        } else if (a <= 69 && a >= 60) {
            System.out.println("Your Grade is D");
        } else if (a <= 79 && a >= 70) {
            System.out.println("Your Grade is C");
        } else if (a <= 89 && a >= 80) {
            System.out.println("Your Grade is B");
        } else if (a <= 100 && a >= 90) {
            System.out.println("Your Grade is A");
        } else {                                    //For any invalid case
            System.out.println("Incorrect Number");
        }


    }
}
