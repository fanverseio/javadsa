package Arrays;

public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = true;
                    return duplicate;
                }
            }
        }
        return duplicate;
    }

}
