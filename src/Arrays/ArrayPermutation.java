package Arrays;

public class ArrayPermutation {
    public boolean permutation(int[] array1, int[] array2){
        if (array1.length != array2.length){
            return false;
        } else {
            int sum1 = 0;
            int sum2 = 0;
            int mul1 = 0;
            int mul2 = 0;
           for (int num: array1 ){
               sum1 += num;
            }
           for (int num: array2){
               sum2 += num;
           }
           for (int num:array1){
               mul1 *= num;
           }
           for (int num: array2){
               mul2 *= num;
           }

           if (sum1 == sum2 && mul1 == mul2){
               return true;
           } else {
               return false;
           }
        }
    }

}
