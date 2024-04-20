// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {
        char letters[] = { 'c', 'f', 'j' };
        char target= 'f';
        System.out.println(nextGreaterCharacter(letters, target));
    }

    public static char nextGreaterCharacter(char letters[], char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            // find the middle element
            // int mid=(start+end)/2; // this may exceed the int range
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) { // left
                end = mid - 1;
            } else { // right
                start = mid + 1;
            }
        }
        
        int index = start % letters.length;
        return letters[index]; // return character
    }
}