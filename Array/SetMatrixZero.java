package Array;

public class SetMatrixZero {

    public static void setZeroes(int[][] matrix) {
        //brute force method
        boolean[][] isZeroMatrix = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    for(int k = 0; k < matrix[i].length; k++) if(matrix[i][k] != 0) isZeroMatrix[i][k] = true;
                    for(int k = 0; k < matrix.length; k++) if(matrix[k][j] != 0)  isZeroMatrix[k][j] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(isZeroMatrix[i][j]) matrix[i][j] = 0;
            }
        }
    }

    public void setZeroes2(int[][] matrix) {
        //better solution
        boolean[] isRowZero = new boolean[matrix.length];
        boolean[] isColZero = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    isRowZero[i] = true;
                    isColZero[j] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(isRowZero[i] || isColZero[j]) matrix[i][j] = 0;
            }
        }
    }

    public static void setZeroes3(int[][] matrix){
        //optimal solution

        boolean col0 = false;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    //System.out.print(i);
                    matrix[i][0] = 0;
                    if(j == 0) col0 = true;
                    else matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0){
            for(int j = 1; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        if(col0){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // {{1,1,1},{1,0,1},{1,1,1}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        setZeroes3(arr);
        System.out.println("After applying set zeros");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
