
//https://leetcode.com/problems/find-in-mountain-array

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(arr, target));
    }


    public static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }
	//search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
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

    static int orderAgnosticBS(int arr[], int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid=(start+end)/2; // this may exceed the int range
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) { // Found
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) { // Right
                    start = mid + 1;
                } else { // Left
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) { // Left
                    start = mid + 1;
                } else { // Left
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
