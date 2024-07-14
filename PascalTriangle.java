import java.util.List;
import java.util.ArrayList;
public class PascalTriangle {

    /* Input: numRows = 5
     * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     * 
     * [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
     * 6
     * [1, 4, 6, 4, 1] 
    */
    
    public static List<List<Integer>> generate(int numRows) {
        //when you are told to print the pascal triangle
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i + 1; j++){
                if(j == 0 || j == i) {
                    list.add(1);
                }
                else{
                    list.add(pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j));
                }
            }
            pascalTriangle.add(list);
        }


        return pascalTriangle;
    }

    public static int findnCr(int n , int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static List<Integer> generateNthRow(int row){
        List<Integer> nRow = new ArrayList<>();
        int ele = 1;
        nRow.add(ele);
        for(int i = 1; i < row; i++){
            ele = ele * (row - i) / (i);
            nRow.add(ele);
        }

        return nRow;
    }

    public static int generateForRowCol(int row, int col){
        //find element at given row and col of pascal triangle
        return findnCr(row-1, col-1);
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generateForRowCol(5, 3));
        System.out.println(generateNthRow(5));
    }
}
