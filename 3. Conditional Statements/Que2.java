// Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature : ");
        float temp = sc.nextFloat();

        if (temp>100)
            System.out.println("You have a fever");
        else
            System.out.println("You don't have a fever");
    }
}
