import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter r : ");
        float r=sc.nextFloat();
        float area=3.14f*r*r;
        System.out.println("Area of Circle = "+area);

        sc.close();

    }
}
