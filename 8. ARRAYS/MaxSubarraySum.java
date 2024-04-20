public class MaxSubarraySum {
    public static void maxSubarraySum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int currSum=0;
                for (int k = i; k <= j; k++) {

                    currSum+=num[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        maxSubarraySum(num);
    }
}
