import java.util.Scanner;

public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int decNum=0;
        int power=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum+=lastDigit*(int)Math.pow(2, power);
            binNum/=10;
            power++;
        }   
        System.out.println("Decimal Number = "+decNum); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        int num=sc.nextInt();
        binToDec(num); 
        sc.close();
    }
}
