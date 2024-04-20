import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num+" is a Prime Number");
        } else {
            System.out.println(num+" is not a Prime Number");
        }

        sc.close();
    }
}
