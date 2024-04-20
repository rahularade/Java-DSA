/*
    Inverted Half-Pyramid with Numbers
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2 
        1
 */

 public class Pattern3 {
    public static void half_pyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                   System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_pyramid(5);
    }
}