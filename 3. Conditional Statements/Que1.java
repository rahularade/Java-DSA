// Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        String res = num > 0 ? "Positive" : "Negative or 0";
        System.out.println(res);
        sc.close();
    }
}
