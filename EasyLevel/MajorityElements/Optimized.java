package EasyLevel.MajorityElements;

public class Optimized {
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int count =1;
        for(int i=0;i<nums.length;i++){
            int ans=nums[i];
            if(ans==res){
                count++;
            }else{
                count--;
            }
            if(count==0){
                res=ans;
                count=1;
            }
        }
        return res;
    }
}