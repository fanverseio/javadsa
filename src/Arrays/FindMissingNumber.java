package Arrays;

public class FindMissingNumber {
    public int findMissingNumber(int[] array){
        int n = array.length+1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for (int num:array){
            System.out.print(num+" ");
            actualSum += num;
            System.out.println(actualSum + " ");
        }

        System.out.println(expectedSum + " " + actualSum);
        return expectedSum - actualSum;


    }
}
