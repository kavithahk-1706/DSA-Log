import java.util.*;

/*Problem Statement:
 * Given an array of elements and a target value,
 * Return an array of indexes of two elements which add up to the target.
 * Only one solution exists, and the same element cannot be used twice
*/


/*Basic Algorithm:
 * Use a hash map to keep track of elements and indexes
 * For each iteration store the complement of the target value as target-current element
 * Search for complement in the hash map
 * If it exists, return an array of the current element's index and the complement's index
 */

class TwoSum {

    //main logic
    public static int[] twoSum(int[] nums, int target) {

        //store a hashmap of interface type Map<Integer,Integer>.
        //this is a classic example of DS-Polymorphism.
        //the key is the element, and the value is its index.
        Map<Integer,Integer> hashMap=new HashMap<>();
        
        //iterate over the span of elements in the array
        for(int i=0;i<nums.length;i++){

            //initialize the current element's value
            int num=nums[i];

            //compute the complementary element as target-num
            //as complement+num=target
            int complement=target-num;
            
            //search for the element in the hashMap
            //containsKey searches for the key, which is the element value in this case
            //also make sure that the complement is not at the same index as the current element
            //because this is basically the equivalent of repeating the same element twice
            if(hashMap.containsKey(complement)&&hashMap.get(complement)!=i){

                //return an array, consisting of the current index and complement's index (from the hash map)    
                return new int[]{i,hashMap.get(complement)};

            }

            //add the current iteration's element and index as the key-value pair to the hash map
            hashMap.put(num,i);

        }

        //if no such pair is found, return an empty array
        return new int[]{};
    }

    //driver code
    public static void main(String[] args){
        int[] nums={2,3,5,1,4};
        int target=8;
        int[] res=twoSum(nums,target);
        System.out.println("Array: "+Arrays.toString(nums));
        System.out.println("Indexes with elements giving sum as "+target+": "+Arrays.toString(res));

    }
}