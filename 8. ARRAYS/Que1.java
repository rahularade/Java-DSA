// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// import java.util.HashSet;

public class Que1 {
    public static boolean containsDuplicate(int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    return true;
                }
            }
        }

        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0; i<nums.length; i++) {
        //     if(set.contains(nums[i])) {
        //         return true;
        //     } 
        //     else {
        //         set.add(nums[i]);
        //     }
        // }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2,  3, 4};
        System.out.println(containsDuplicate(nums));
    }
}
