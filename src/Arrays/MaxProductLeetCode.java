package Arrays;

/*
Example 1:

Input: nums = [3,4,5,2]
Output: 12
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12
 */
public class MaxProductLeetCode {

    public int maxProduct(int[] nums) {
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 0;i< nums.length;i++ ){
           if (firstNumber<nums[i]){
               int temp = firstNumber;
               firstNumber = nums[i];
              secondNumber = temp;
           } else if (secondNumber<nums[i] && firstNumber >= nums[i]){
                   secondNumber = nums [i];
               }

           }


    return (firstNumber-1)*(secondNumber-1);

    }
}
