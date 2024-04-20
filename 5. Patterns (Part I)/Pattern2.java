/* 
    * * * *
    * * *
    * *
    *
*/ 


import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Lines : ");
        int n=sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.err.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}