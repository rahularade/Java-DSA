public class OverloadingWithParam {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.err.println("Sum = "+sum(2,3));
        System.err.println("Sum = "+sum(2,3,5));
    }
}
