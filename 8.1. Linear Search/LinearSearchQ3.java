//Even Digits Numbers
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


public class LinearSearchQ3 {
    public static void main(String[] args) {
        int nums[] = {18, 124, 9, 1764, 98, 1};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int nums[]){
        int count = 0;
        for (int num : nums) {
           if (even(num)){
            count++;
           }
        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);

        // if (numberOfDigits % 2 == 0) {
        //     return true;
        // }
        return numberOfDigits % 2 ==0;
    }

    static int digits(int num){
        //for negative number
        if(num<0){
            num= num*-1 ; //convert negative number to positive
        }

        if(num==0){
            return 1;
        }

        return (int)(Math.log10(num)+1); //Optimized method to count no. of digits

        // int count=0;
        // while (num>0) {
        //     count++;
        //     num=num/10;
        // }

        // return count;


    }
}
