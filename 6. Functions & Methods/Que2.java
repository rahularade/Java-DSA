// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise

import java.util.Scanner;

public class Que2 {
    public static boolean isEven(int n){
        if (n%2==0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(num + " is Even Number : "+isEven(num));
        sc.close();
    }
}
