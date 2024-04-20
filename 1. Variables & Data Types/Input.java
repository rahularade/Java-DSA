import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // System.out.print("String Line : ");
        // String str=sc.nextLine(); //For String Line 
        // System.out.println(str);

        // System.out.print("String Word : ");
        // String str2=sc.next(); //For String Word
        // System.out.println(str2);
        
        // System.out.print("Byte : ");
        // byte b=sc.nextByte();
        // System.out.println(b);

        // System.out.print("Short : ");
        // short sh=sc.nextShort();
        // System.out.println(sh);

        // System.out.print("Boolean : ");
        // boolean var=sc.nextBoolean();
        // System.out.println(var);

        // System.out.print("Int : ");
        // int num=sc.nextInt();
        // System.out.println(num);

        // System.out.print("Long : ");
        // long lg=sc.nextLong();
        // System.out.println(lg);

        // System.out.print("Float : ");
        // float price=sc.nextFloat();
        // System.out.println(price);

        // System.out.print("Double : ");
        // double maxprice=sc.nextDouble();
        // System.out.println(maxprice);

        //Sum & Product of a & b
        System.out.print("Enter No1 : ");
        int no1=sc.nextInt();
        System.out.print("Enter No2 : ");
        int no2=sc.nextInt();
        int sum=no1+no2;
        System.out.println("Sum = "+sum);
        int product=no1*no2;
        System.out.println("Product = "+product);
        sc.close();
    }
}