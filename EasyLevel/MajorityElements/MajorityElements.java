package EasyLevel.MajorityElements;

import java.util.HashMap;

public class MajorityElements {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int res=nums[0];
        int ans=map.get(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(map.get(nums[i])>ans){
                res=nums[i];
            }
        }
        return res;
    }
}