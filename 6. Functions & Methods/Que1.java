// Write a Java method to compute the average of three numbers..

import java.util.Scanner;

public class Que1 {
    public static void avgOfThreeNums(int a,int b, int c){
        float avg=(a+b+c)/3;
        System.out.println("Average of given numbers = "+ avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int no1= sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int no2= sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int no3= sc.nextInt();
        avgOfThreeNums(no1,no2,no3);

        sc.close();
    }
}
