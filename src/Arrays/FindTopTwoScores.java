package Arrays;

public class FintTopTwoScores {

    public int[] findTopTwoScores(int[] array){
        int [] topTwoArr = new int[1];
        int [] topOneArr = new int[1];
        for (int i = 0; i<array.length;i++){
            for (int j = 1; i<array.length;i++){
                if (array[j]>array[i]){
                    topOneArr[0] = array[j];
                    topTwoArr[0] = array[i];
                } else{
                    topOneArr[0] = array[i];
                    topTwoArr[0] = array[j];
                }
            }
        }
        int[] twoLargeScores = new int[2];
        twoLargeScores[0] = topOneArr[0];
        twoLargeScores[1] = topTwoArr[0];
        return  twoLargeScores;
    }
}
