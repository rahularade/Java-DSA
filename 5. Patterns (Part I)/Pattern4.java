/* 
    A
    B C
    D E F
    G H I J
*/ 

import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Lines : ");
        int n=sc.nextInt();
        char ch='A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}