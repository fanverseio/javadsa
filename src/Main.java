import ArrayListExercises.SearchAnElement;
import Arrays.*;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        /*
        // getting average temperature within an array.
          Arrays.ArrayAverageTemp avg = new Arrays.ArrayAverageTemp();
        DataProcess data = new DataProcess();
        double averageTemp = avg.arrayGetAverageTemp();
        System.out.println(data.roundToTwoDigits(averageTemp));
         */

        /*
        // getting middle array
        MiddleArray mid = new MiddleArray();
        int[] myArray = {2,4,6,9,7,10,11};
        int[] middleArr = mid.middle(myArray);
        for (int i = 0;i<middleArr.length;i++){
            System.out.print(middleArr[i]+" ");
        }
         */

        /*
        // get diagonal sum
        SumDiagonalElements sum = new SumDiagonalElements();
        int [][] myArr = {{1,2,3},{1,2,3},{1,2,3}};
        int res = sum.sumDiagonalElements(myArr);
        System.out.println(res);
         */

        /*
        // find biggest two nums
        FindTopTwoScores find = new FindTopTwoScores();
        int[] array = {12,2,98,120,-9,41,659,114,147,995,45};
        int[] res = find.findTopTwoScores(array);
        for (int i = 0;i<res.length;i++){
            System.out.println(res[i] + " ");
        }
        */

        /*
        // finding missing number from an array
        FindMissingNumber findMissing = new FindMissingNumber();
        int []array = {1,2,3,4,5,6,8,9,10,11};
        System.out.println(findMissing.findMissingNumber(array));
         */

        /*
        // remove duplicates in sorted array
        RemoveDuplicateFromSortedArr re = new RemoveDuplicateFromSortedArr();
        int []nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(re.removeDuplicates(nums));
         */

        /*
        // getting max positive difference
        MaxProfit max = new MaxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(max.maxProfit(prices));
         */

        /*
        // find a number in an array
        SearchInArray search = new SearchInArray();
        int[] array = new int[]{1,2,3,4,5,6};
        System.out.println(search.searchInArray(array,6));
         */

        /*
        MaxProductLeetCode max = new MaxProductLeetCode();
        int[] array = new int[]{3,4,5,2};
        System.out.println(max.maxProduct(array));
         */

        /*
        ContainsDuplicate contain = new ContainsDuplicate();
        int[] nums = new int[]{1,2,3,4,6,5,2};
        System.out.println(contain.containsDuplicate(nums));
        */

        /*
        ArrayPermutation arr = new ArrayPermutation();
        int[] array1 = new int[]{1,2,3,4,5,6};
        int[] array2 = new int[]{3,2,1,6,5,4};
        System.out.println(arr.permutation(array1,array2));
         */

        SearchAnElement search = new SearchAnElement();
        ArrayList<String> string = new ArrayList<String>(Arrays.asList("A","B","C","D"));
        System.out.println(search.searchAnElement(string,"D"));
        System.out.println(search.searchAnElement(string,"E"));


    }
}