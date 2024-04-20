import java.util.Scanner;

public class PrimesInRange {
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

    public static void printPrimes(int range){
        for (int i = 2; i < range; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range=sc.nextInt();
        printPrimes(range);
        sc.close();
    }
}
