package Matrix;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new LinkedList<Integer>();
        int left = 0, top = 0, right = matrix[0].length-1 , bottom = matrix.length-1;
        while(top <= bottom && left <= right){
            for(int i =left; i <= right; i++){
                spiralMatrix.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                spiralMatrix.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    spiralMatrix.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
            for(int i = bottom; i >= top; i--){
                spiralMatrix.add(matrix[i][left]);
            }
            left++;
            }
        } 
        return spiralMatrix;
    }

    public static void main(String[] args) {
        
    }
}
