import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while(top <= bottom && left <= right){

            // 1. Top row
            for(int j = left; j <= right; j++){
                res.add(matrix[top][j]);
            }
            top++;

            // 2. Right column
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            // 3. Bottom row
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Left column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}
