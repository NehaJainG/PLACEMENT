public class Search2DArray {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowLow = 0, rowHigh = matrix.length - 1;
        while(rowLow <= rowHigh){
            int rowMid = (rowLow + rowHigh) / 2;
            if(matrix[rowMid][0] > target){
                rowHigh = rowMid - 1;
            }else if(matrix[rowMid][matrix[rowMid].length - 1] < target){
                rowLow = rowMid + 1;
            }else{
                int low = 0, high = matrix[rowMid].length - 1;
                while(low <= high){
                    int mid = (low + high) / 2;
                    if(matrix[rowMid][mid] == target){
                        return true;
                    }else if(matrix[rowMid][mid] < target){
                        low = mid + 1;
                    }else{
                        high = mid -1;
                    }
                }
                return false;
            }

        }
        return false;
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        int rowLow = 0, rowHigh = matrix.length - 1;
        while(rowLow <= rowHigh){
            int rowMid = (rowLow + rowHigh) / 2;
            if(matrix[rowMid][0] > target){
                rowHigh = rowMid - 1;
            }else if(matrix[rowMid][matrix[rowMid].length - 1] < target){
                rowLow = rowMid + 1;
            }else{
                break;
            }
        }

        int row = (rowLow + rowHigh)/2;
        int low = 0, high = matrix[low].length - 1;
        while(low <= high){
            int mid = (low + high);
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr, 9));
    }
}
