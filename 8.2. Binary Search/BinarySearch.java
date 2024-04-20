public class BinarySearch {

    // return the index
    // return -1 if it does not exist
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid=(start+end)/2; // this may exceed the int range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) { // Left
                end = mid - 1;
            } else if(target > arr[mid]) { // Right
                start = mid + 1;
            } else{
                //ans found
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 10;

        System.out.println("Target is at index : " + binarySearch(arr, target));
    }
}
