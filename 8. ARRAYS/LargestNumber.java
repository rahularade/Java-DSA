public class LargestNumber {
    public static int largestNumber(int num[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest<num[i]) {
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest number is : "+largestNumber(numbers));
    }
}
