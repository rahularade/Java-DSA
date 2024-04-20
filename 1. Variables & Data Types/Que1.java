/* In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.*/

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter value of b : ");
        int b=sc.nextInt();
        System.out.print("Enter value of c : ");
        int c=sc.nextInt();

        float avg=(a+b+c)/3;
        System.out.println("Average = "+avg);

        sc.close();
    }
}
