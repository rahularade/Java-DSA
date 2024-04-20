//Search in Range

public class LinearSearchQ2 {
    public static int linearSearch(int num[],int key, int start, int end){
        for (int i = start; i <= end; i++) {
            if (num[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;

        
        int index=linearSearch(numbers, key,1,4);
        if (index==-1) {
            System.out.println("Index Not Found");
        } else {
            System.out.println("Key is at index : "+index);
        }
    }
}
    
