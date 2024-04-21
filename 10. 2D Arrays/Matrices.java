import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = 3, m = 3;

        Scanner sc = new Scanner(System.in);
        //input 
        for (int row = 0; row < n; row++) {
            System.out.println("Enter "+ (row+1) +" row elements : ");
            for (int col = 0; col < m; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.println("Matrix : ");
        //output / display
        
        // for (int row = 0; row < n; row++) {
        //     for (int col = 0; col < m; col++) {
        //         System.out.print(matrix[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //using foreach loop
        for (int[] is : matrix) {
            for (int ele : is) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}