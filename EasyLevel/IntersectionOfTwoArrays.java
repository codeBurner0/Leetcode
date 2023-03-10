package EasyLevel;
import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(set.containsKey(nums1[i])){
                set.put(nums1[i],set.get(nums1[i])+1);
            }else{
                set.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(set.containsKey(nums2[i]) && set.get(nums2[i])>0){
                al.add(nums2[i]);
                set.put(nums2[i],set.get(nums2[i])-1);
            }
        }
        int[] arr=new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}