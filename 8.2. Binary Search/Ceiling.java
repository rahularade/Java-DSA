// Ceiling of a number 

public class Ceiling {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 9, 14, 16, 18 };
        int target=15;
        System.out.println(ceiling(arr, target));
    }

    //return the index of smallest number >= target
    public static int ceiling(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // find the middle element
            // int mid=(start+end)/2; // this may exceed the int range
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) { // Found
                return mid;
            } 
            if (arr[mid] < target) { // Right
                start = mid + 1;
            } else { // Left
                end = mid - 1;
            }
        }
        return start; // return Ceiling
    }
}