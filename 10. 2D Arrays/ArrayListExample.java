import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        //input
        list.add(100);
        list.add(45);
        list.add(76);
        list.add(23);
        list.add(87);
        list.add(45);
        list.add(0, 99);
        // for (int i = 0; i < 6; i++) {
        //     list.add(in.nextInt());
        // }

        //output
        System.out.println(list);

        //Methods of ArrayList
        list.set(0, 50); //Replaces the element at the specified position 
        System.out.println(list);

        System.out.println(list.get(5)); //Returns the element at the specified position

        System.out.println(list.contains(76)); //Returns true if this list contains the specified element.

        
        System.out.println(list.indexOf(45)); //return index the first occurrence of a specific element or -1 in case the element is not in the list.
        
        System.out.println(list.lastIndexOf(45)); //return index the last occurrence of a specific element or -1 in case the element is not in the list.

        System.out.println(list.size()); //Returns the number of elements in this list.

        System.out.println(list.remove(0)); //Removes the element at the specified position in this list .

        System.out.println(list);
        
        list.clear(); // It is used to remove all of the elements from this list.
        System.out.println(list);

        System.out.println(list.isEmpty()); // Returns true if this list contains no elements.

        in.close();
    }
}
