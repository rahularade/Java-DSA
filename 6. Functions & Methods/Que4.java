// Write a Java method to compute the sum of the digits in an integer

import java.util.Scanner;

public class Que4 {
    public static void sumOfDigits(int n){
        int sum=0;
        while (n>0) {
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }

        System.out.println("Sum of the digits = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        sumOfDigits(num);
        sc.close();
    }
}
