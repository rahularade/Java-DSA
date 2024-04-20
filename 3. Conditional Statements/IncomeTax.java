import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter income : ");
        int income = sc.nextInt();

        if (income<500000) {
            System.out.println("Tax : 0");
        } else if (income>=500000 && income<1000000) {
            System.out.println("Tax : "+(income*0.2));
        } else {
            System.out.println("Tax : "+(income*0.3));
        }

        sc.close();
    }
}
