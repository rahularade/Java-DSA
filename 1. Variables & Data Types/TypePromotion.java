public class TypePromotion {
    public static void main(String[] args) {
        char ch='a'; //a=97
        int no=3;
        int op=ch+no; //a automatically converted into int
        System.out.println(op);

        int a=10;
        float b=20.25f;
        long c=25;
        double d=30;
        double ans=a+b+c+d; //all values converted into double
        System.out.println(ans);

        byte x=5;
        byte y=(byte)(x*2); //use Casting Operator because 2 is int
        System.out.println(y);
    }
}
