import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        int reverse=0;
        while (num>0) {
            int digit=num%10;
            num/=10;
            reverse=reverse*10+digit;
        }
        System.out.println("Reverse Number : "+reverse);

        // System.out.print("Reverse Number : ");
        // while (num>0) {
        //     int digit=num%10;
        //     System.out.print(digit);
        //     num/=10;
        // }

        sc.close();
    }
}
