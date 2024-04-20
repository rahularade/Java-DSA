/* 
    1
    1 2
    1 2 3
    1 2 3 4
*/ 

import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Lines : ");
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}