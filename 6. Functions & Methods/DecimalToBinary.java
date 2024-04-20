import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int decNum){
        int binNum=0;
        int power=0;
        while(decNum>0){
            int rem=decNum%2;
            binNum+=rem*(int)Math.pow(10, power);
            decNum/=2;
            power++;
        }
        System.out.println("Binary Number = "+binNum); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int num=sc.nextInt();
        decToBin(num); 
        sc.close();
    }
}
