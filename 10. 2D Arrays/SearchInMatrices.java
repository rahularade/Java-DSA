import java.util.Arrays;

public class SearchInMatrices {
    public static void main(String[] args) {
        int[][] matrix = {{18, 9,12},
                          {36,-4,91},
                          {44,33,16}};
        int target = 991;
        // for (int index : search(matrix, target)) {
        //     System.out.print(index + " ");
        // }

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target){
        int[] ans = {-1,-1};

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == target) {
                    ans[0] = r;
                    ans[1] = c;
                }
            }
        }

        return ans;
    }
}
