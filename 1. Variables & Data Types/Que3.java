/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Price of Pencil : ");
        float pencil=sc.nextFloat();
        System.out.print("Enter Price of Pen : ");
        float pen=sc.nextFloat();
        System.out.print("Enter Price of Eraser : ");
        float eraser=sc.nextFloat();

        float total=pencil+pen+eraser;
        System.out.println("Total = "+total);

        float gst = total*0.18f;
        System.out.println("Total with GST(18%) = "+(total+gst));

        sc.close();
    }
}
