import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();

        String result=marks>=33?"Pass":"Fail";
        System.out.println("Result : "+result);

        sc.close();
    }
}
