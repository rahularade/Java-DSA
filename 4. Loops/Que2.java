// Write a program to find the factorial of any number entered by the user

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter positive integer number : ");

        int no=sc.nextInt();
        int factorial=1;

        for (int i = 1; i <= no; i++) {
            factorial*=i;
        }

        System.out.println("Factorial of "+no+" : "+factorial);
        sc.close();
    }
}
