package Matrix;

public class Transpose {
    // Finds transpose of A[][] in-place 
    static void transpose_inplace(int A[][]) 
    { 
        //works with only square matrix
        for (int i = 0; i < A.length; i++) 
            for (int j = i + 1; j < A.length; j++) { 
                int temp = A[i][j]; 
                A[i][j] = A[j][i]; 
                A[j][i] = temp; 
            } 
    }
    public int[][] transpose(int[][] matrix) {
        //using aditional matrix to solve
        //works for both sqaure and rectangular matrix
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;

    }
}
