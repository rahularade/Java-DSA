//Keep entering numbers till user enters multiple of 10

import java.util.Scanner;

public class EnterNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number : ");
            int num = sc.nextInt();
            if (num%10==0) {
                break;
            }
            System.out.println("Number : "+num);
        }
        sc.close();
    }
}
