package Matrix;

import java.util.Scanner;

//first look understand Transpose of matrix. follow up of transpose problem
public class RotateImage {

    static int[][] rotateMatrix(int[][] m ){
        
        //transpose the matrix
        for (int i = 0; i < m.length; i++) 
            for (int j = i + 1; j < m.length; j++) { 
                int temp = m[i][j]; 
                m[i][j] = m[j][i]; 
                m[j][i] = temp; 
        } 

        //swap elements by columns
        for(int i = 0; i < m.length/2; i++){
            for(int j = 0; j < m.length; j++){
                System.out.println(i+" " + j);
                int temp = m[j][i];
                m[j][i] =  m[j][m.length-i-1];
                m[j][m.length-i-1] = temp;
            }
        }

        return m;

    }

    static void display(int[][] m){
        System.out.println("Matrix");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        System.out.println("Enter matrix elements");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        matrix = rotateMatrix(matrix);
        display(matrix);
        sc.close();
    }
}
