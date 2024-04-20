// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no,choice,evenSum=0,oddSum=0;
        do {
            System.out.print("Enter Integer Number : ");
            no=sc.nextInt();

            if (no%2==0) {
                evenSum+=no;
            } else {
                oddSum+=no;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice=sc.nextInt();
        } while (choice==1);

        System.out.println("Even Sum : "+evenSum);
        System.out.println("Odd Sum : "+oddSum);
        sc.close();
    }
}
