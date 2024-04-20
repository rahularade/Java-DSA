// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();

        boolean x=year%4==0?true:false;
        boolean y=year%100!=0?true:false;
        boolean z=year%100==0 && year%400==0?true:false;

        if (x && (y || z)) {
            System.out.println(year+" is a leap year");
        } else {
            System.out.println(year+" is not a leap year");
        }
        
        // boolean leap=false;
        // if (year%4==0) {
        //     if (year%100==0) {
        //         if (year%400==0) {
        //             leap=true;
        //         }
        //     }
        //     else{
        //         leap=true;
        //     }
        // }

        // if (leap) {
        //     System.out.println(year+" is a leap year");
        // }
        // else{
        //     System.out.println(year+" is not a leap year");
        // }

        sc.close();
    }
}
