// Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)

import java.util.Scanner;

public class Que3 {
    public static void checkPalindrome(int n){
        int originalNum=n;
        int reverseNum=0;

        while (n>0) {
            int lastDigit=n%10;
            reverseNum=reverseNum*10+lastDigit;
            n/=10;
        }

        if (originalNum==reverseNum) {
            System.out.println(originalNum +" is a palindrome");
        } else {
            System.out.println(originalNum +" is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter Number : ");
        int num = sc.nextInt();
        checkPalindrome(num);
        sc.close();
    }
}
