package Arrays;

public class SumDiagonalElements {

    public static int sumDiagonalElements(int [][] array){
        int sum = 0;

        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
               if (j == i){
                   sum += array[i][j];
               }
            }
        }
        return sum;
    }
}
