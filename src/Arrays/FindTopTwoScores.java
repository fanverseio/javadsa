package Arrays;

public class FindTopTwoScores {

    public int[] findTopTwoScores(int[] array) {
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstNum) {
                secondNum = firstNum;
                firstNum = num;
            } else if (secondNum < num && num < firstNum) {
                secondNum = num;
            }

        }
        return new int[]{firstNum, secondNum};
    }
}

        /*
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;

        for (int num:array){
            if (num > firstNum){
                secondNum = firstNum;
                firstNum = num;
            } else if (num > secondNum && num < firstNum){
                secondNum = num;
            }
        }
        return new int[]{firstNum,secondNum};
         */



