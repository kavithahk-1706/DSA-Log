import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int complement=target-num;
    
            if(hashMap.containsKey(complement)&&hashMap.get(complement)!=i){
                return new int[]{i,hashMap.get(complement)};
            }
            hashMap.put(num,i);
        }

        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums={2,3,5,1,4};
        int target=8;
        int[] res=twoSum(nums,target);
        System.out.println("Array: "+Arrays.toString(nums));
        System.out.println("Indexes with elements giving sum as "+target+": "+Arrays.toString(res));

    }
}