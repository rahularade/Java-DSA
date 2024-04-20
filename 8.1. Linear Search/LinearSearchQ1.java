//Search in String

public class LinearSearchQ1 {
    static boolean search(String str, char key){
        // for (int i = 0; i < str.length(); i++) {
        //     if (key==str.charAt(i)) {
        //         return true;
        //     }
        // }
        
        //foreach loop 
        // str.toCharArray() converts String to char Array
        for (char ch : str.toCharArray()) {
            if (ch == key) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        String name = "Rahul";
        char key = 'h';
        System.out.println(search(name, key));
    }
}
