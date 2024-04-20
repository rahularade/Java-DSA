public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10,12,14};
        int arr[]={16,14,12,10,8,6,4,2,0,-2,-4,-6};
        int target=10;

        System.out.println("Target is at index : "+orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

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
