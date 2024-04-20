public class LargestOf3 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 30;

        if (A >= B && A >= C) {
            System.out.println("A is Largest of 3");
        } else if (B > C) {
            System.out.println("B is Largest of 3");
        } else {
            System.out.println("C is Largest of 3");
        }

    }
}
