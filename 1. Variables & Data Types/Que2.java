import java.util.Scanner;

/**
 In a program, input the side of a square. You have to output the area of the
square.
 */
public class Que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side : ");
        float side=sc.nextInt();
        float area=side*side;
        System.out.println("Area of Square = "+area);
        sc.close();
    }
    
}