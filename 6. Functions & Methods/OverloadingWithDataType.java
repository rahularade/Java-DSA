public class OverloadingWithDataType {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.err.println("Sum = "+sum(2,3));
        System.err.println("Sum = "+sum(5.5f,2.5f));
    }
}

