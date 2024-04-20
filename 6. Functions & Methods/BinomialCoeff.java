import java.util.Scanner;

public class BinomialCoeff {
    
    public static int fact(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }

    public static int binCoeff(int n,int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nmr_fact=fact(n-r);
        
        return n_fact/(r_fact*nmr_fact);
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.err.print("Enter n : ");
        int n= sc.nextInt();
        System.err.print("Enter r : ");
        int r= sc.nextInt();

        System.out.println("Binomial Coefficient : "+binCoeff(n, r));
        sc.close();
    }
    
}