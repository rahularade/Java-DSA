import java.util.Scanner;

public class FunWithParams {
    public static int calculateSum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum=calculateSum(a,b);
        System.out.println("Sum = "+sum);

        sc.close();
    }
}
