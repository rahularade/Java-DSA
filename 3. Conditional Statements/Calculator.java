import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No1 : ");
        int no1 = sc.nextInt();
        System.out.print("Enter No2 : ");
        int no2 = sc.nextInt();
        System.out.print("Enter Operator : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result : " + (no1 + no2));
                break;

            case '-':
                System.out.println("Result : " + (no1 - no2));
                break;

            case '*':
                System.out.println("Result : " + (no1 * no2));
                break;

            case '/':
                System.out.println("Result : " + ((float) no1 / (float) no2));
                break;

            default:
                System.out.println("Wrong Operator");
                break;
        }
        sc.close();
    }
}
