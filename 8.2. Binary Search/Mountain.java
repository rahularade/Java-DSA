//https://leetcode.com/problems/peak-index-in-a-mountain-arrayf

//https://leetcode.com/problems/find-peak-element

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                //you are in dec part of array
                //this may be ans, but look at left
                end = mid;
            } else {
                //you are in asc part of array
                start = mid + 1; //bcoz we know that mid+1 element > mid element
            }
        }
        //in the end, start == end and pointing to the largest number bcoz of the 2 checks above
        //start and end are always trying to find max element
        return start; //or end
    }
}
