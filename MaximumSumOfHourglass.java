import java.util.Scanner;

public class MaximumSumOfHourglass {
    static int sumOfHourglass(int[][] matrix, int rowIndex, int colIndex){
        int sum = 0;
        for(int i = rowIndex; i < (rowIndex + 3); i++){
            for(int j = colIndex; j < colIndex+3; j++){
                if(i == rowIndex + 1 && j != colIndex + 1) {
                    System.out.print("  ");
                    continue;
                }
                sum += matrix[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return sum;
    }
    static void matrix(int[][] matrix){

    }
    static int maxSum(int[][] matrix){
        int maxSum = 0, sum = 0;
        for(int i = 0; i < matrix.length - 2; i++){
            for(int j = 0; j < matrix[i].length - 2; j++){
                System.out.println("Matrix "+i+j);
                sum = sumOfHourglass(matrix, i, j);
                if(sum > maxSum) maxSum = sum;
                System.out.println();
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        //int[][] matrix = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] matrix = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxSum(matrix));
        sc.close();
    }
}
