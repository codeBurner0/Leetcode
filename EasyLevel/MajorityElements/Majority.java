package EasyLevel.MajorityElements;

import java.util.Arrays;

public class Majority {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}