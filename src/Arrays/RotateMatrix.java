package Arrays;

public class RotateMatrix {

    public int[][] rotate(int[][] matrix){
        int len = matrix.length;

        int[][] newMatrix = new int[len][len];

        for (int i = 0;i<len;i++){
            for (int j = 0;j<len;j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;

    }
}
