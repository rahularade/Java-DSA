import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int N = sc.nextInt();
        int i=1,sum=0;

        while (i<=N) {
            sum+=i;
            i++;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
